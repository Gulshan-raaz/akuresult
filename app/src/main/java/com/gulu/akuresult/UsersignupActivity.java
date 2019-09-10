package com.gulu.akuresult;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

public class UsersignupActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> alluser = new HashMap<>();
	private String str = "";
	
	private ArrayList<HashMap<String, Object>> userdata = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout laypanel;
	private LinearLayout linear17;
	private LinearLayout linear3;
	private LinearLayout laylogin;
	private LinearLayout layregister;
	private TextView navlogin;
	private TextView navregister;
	private LinearLayout linear16;
	private LinearLayout linear15;
	private LinearLayout linear5;
	private ImageView imageview7;
	private EditText edittext7;
	private ImageView imageview8;
	private EditText edittext8;
	private TextView txtforgot;
	private TextView btnlogin;
	private LinearLayout linear11;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear12;
	private ImageView imageview4;
	private EditText edittext4;
	private ImageView imageview5;
	private EditText edittext5;
	private ImageView imageview6;
	private EditText edittext6;
	private TextView btnregister;
	
	private FirebaseAuth au;
	private OnCompleteListener<AuthResult> _au_create_user_listener;
	private OnCompleteListener<AuthResult> _au_sign_in_listener;
	private OnCompleteListener<Void> _au_reset_password_listener;
	private SharedPreferences Email;
	private DatabaseReference akuuser = _firebase.getReference("akuresult/allusername");
	private ChildEventListener _akuuser_child_listener;
	private Intent transfer = new Intent();
	private AlertDialog.Builder dlg;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.usersignup);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		laypanel = (LinearLayout) findViewById(R.id.laypanel);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		laylogin = (LinearLayout) findViewById(R.id.laylogin);
		layregister = (LinearLayout) findViewById(R.id.layregister);
		navlogin = (TextView) findViewById(R.id.navlogin);
		navregister = (TextView) findViewById(R.id.navregister);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		edittext8 = (EditText) findViewById(R.id.edittext8);
		txtforgot = (TextView) findViewById(R.id.txtforgot);
		btnlogin = (TextView) findViewById(R.id.btnlogin);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		btnregister = (TextView) findViewById(R.id.btnregister);
		au = FirebaseAuth.getInstance();
		Email = getSharedPreferences("mailid", Activity.MODE_PRIVATE);
		dlg = new AlertDialog.Builder(this);
		
		navregister.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				navlogin.setBackgroundColor(Color.TRANSPARENT);
				navregister.setBackgroundColor(0xFF000000);
				laylogin.setVisibility(View.GONE);
				layregister.setVisibility(View.VISIBLE);
			}
		});
		
		txtforgot.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dlg.setTitle("Forget Password ");
				dlg.setMessage(" Please Enter  Your Email Id( and check Your Mail for Reset)");
				final EditText edittext10= new EditText(UsersignupActivity.this);
				
				LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
				
				edittext10.setLayoutParams(lpar);
				
				dlg.setView(edittext10);
				
				
				
				dlg.setPositiveButton("Save", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						String str=edittext10.getText().toString();
						au.sendPasswordResetEmail(str).addOnCompleteListener(_au_reset_password_listener);
					}
				});
				dlg.create().show();
			}
		});
		
		btnlogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext7.getText().toString().equals("")) {
					edittext7.setError("Email Cant Be Empty");
				}
				else {
					if (edittext8.getText().toString().equals("")) {
						edittext8.setError("Password Cant Be Empty");
					}
					else {
						au.signInWithEmailAndPassword(edittext7.getText().toString(), edittext8.getText().toString()).addOnCompleteListener(UsersignupActivity.this, _au_sign_in_listener);
						laylogin.setVisibility(View.GONE);
						linear17.setVisibility(View.VISIBLE);
					}
				}
			}
		});
		
		btnregister.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext4.getText().toString().equals("")) {
					edittext4.setError(" EMail  Can't Be Empty");
				}
				if (edittext5.getText().toString().length() < 8) {
					edittext5.setError(" Password  Should Minimum 8 Digit");
				}
				if (!edittext5.getText().toString().equals(edittext6.getText().toString())) {
					edittext6.setError(" Confirm Password Is Wrong ");
				}
				au.createUserWithEmailAndPassword(edittext4.getText().toString(), edittext5.getText().toString()).addOnCompleteListener(UsersignupActivity.this, _au_create_user_listener);
				layregister.setVisibility(View.GONE);
				linear17.setVisibility(View.VISIBLE);
				dlg.setTitle("Verification ");
				dlg.setMessage("He  Dear Please Verify  Your Email And Then Login \nThankyou👨‍💻😀😀");
				dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dlg.create().show();
			}
		});
		
		_akuuser_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		akuuser.addChildEventListener(_akuuser_child_listener);
		
		_au_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					FirebaseAuth au = FirebaseAuth.getInstance();
					com.google.firebase.auth.FirebaseUser user = au.getCurrentUser();
					
					user.sendEmailVerification().addOnCompleteListener (new
					OnCompleteListener<Void>()
					{ @Override public void onComplete(Task task) {if
							(task.isSuccessful ()) {
								
							} else {
								
								
								dlg.setTitle("Verification ");
								dlg.setMessage("Verify Your Mail");
								dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										
									}
								});
								dlg.create().show();
							}
						}});
					SketchwareUtil.showMessage(getApplicationContext(), " Your Account  Created Success \nLogin Now");
					laylogin.setVisibility(View.VISIBLE);
					linear17.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
					layregister.setVisibility(View.VISIBLE);
					linear17.setVisibility(View.GONE);
				}
			}
		};
		
		_au_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					FirebaseAuth au = FirebaseAuth.getInstance();
					com.google.firebase.auth.FirebaseUser user = au.getCurrentUser();
					
					if (user.isEmailVerified()) {
						
						
						Email.edit().putString("mailid", FirebaseAuth.getInstance().getCurrentUser().getEmail()).commit();
						Email.edit().putString("uid", FirebaseAuth.getInstance().getCurrentUser().getUid()).commit();
						transfer.setClass(getApplicationContext(), TabviewActivity.class);
						startActivity(transfer);
					} else {
						
						
						SketchwareUtil.showMessage(getApplicationContext(), "your Email is not verified 😀");
						
						
					}
					finish();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_au_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	private void initializeLogic() {
		layregister.setVisibility(View.GONE);
		linear17.setVisibility(View.GONE);
		_CoolAnimation();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _CoolAnimation () {
		final DilatingDotsProgressBar bar = new DilatingDotsProgressBar(this); 
		bar.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT)); 
		
		bar.setDotRadius(10); 
		
		bar.setDotColors(Color.RED, Color.GREEN); 
		bar.setNumberOfDots(3); 
		bar.setDotScaleMultiplier((float)3); 
		bar.setGrowthSpeed(500); 
		bar.setDotSpacing(30); 
		linear17.addView(bar); 
		
		bar.showNow();
		/*bar.hideNow();*/
		
	}
	public static class DilatingDotDrawable extends android.graphics.drawable.Drawable {
		    private static final String TAG = DilatingDotDrawable.class.getSimpleName();
		    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
		    private float radius;
		    private float maxRadius;
		    final Rect mDirtyBounds = new Rect(0, 0, 0, 0);
		
		    public DilatingDotDrawable(final int color, final float radius, final float maxRadius) {
			        mPaint.setColor(color);
			        mPaint.setStyle(Paint.Style.FILL);
			        mPaint.setStrokeCap(Paint.Cap.ROUND);
			        mPaint.setStrokeJoin(Paint.Join.ROUND);
			
			        this.radius = radius;
			        setMaxRadius(maxRadius);
			    }
		
		    @Override
		    public void draw(Canvas canvas) {
			        final Rect bounds = getBounds();
			        canvas.drawCircle(bounds.centerX(), bounds.centerY(), radius - 1, mPaint);
			    }
		
		    @Override
		    public void setAlpha(int alpha) {
			        if (alpha != mPaint.getAlpha()) {
				            mPaint.setAlpha(alpha);
				            invalidateSelf();
				        }
			    }
		
		    @Override
		    public void setColorFilter(ColorFilter colorFilter) {
			        mPaint.setColorFilter(colorFilter);
			        invalidateSelf();
			    }
		
		    @Override
		    public int getOpacity() {
			        return PixelFormat.TRANSLUCENT;
			    }
		
		    public void setColor(int color) {
			        mPaint.setColor(color);
			        invalidateSelf();
			    }
		
		    public void setRadius(float radius) {
			        this.radius = radius;
			        invalidateSelf();
			    }
		
		    public float getRadius() {
			        return radius;
			    }
		
		    @Override
		    public int getIntrinsicWidth() {
			        return (int) (maxRadius * 2) + 2;
			    }
		
		    @Override
		    public int getIntrinsicHeight() {
			        return (int) (maxRadius * 2) + 2;
			    }
		
		    public void setMaxRadius(final float maxRadius) {
			        this.maxRadius = maxRadius;
			        mDirtyBounds.bottom = (int) (maxRadius * 2) + 2;
			        mDirtyBounds.right = (int) (maxRadius * 2) + 2;
			    }
		
		    @Override
		    public Rect getDirtyBounds() {
			        return mDirtyBounds;
			    }
		
		    @Override
		    protected void onBoundsChange(final Rect bounds) {
			        super.onBoundsChange(bounds);
			        mDirtyBounds.offsetTo(bounds.left, bounds.top);
			    }
	}
	
	
	public static class DilatingDotsProgressBar extends View {
		    public static final String TAG = DilatingDotsProgressBar.class.getSimpleName();
		    public static final double START_DELAY_FACTOR = 0.35;
		    private static final float DEFAULT_GROWTH_MULTIPLIER = 1.75f;
		    private static final int MIN_SHOW_TIME = 500; // ms
		    private static final int MIN_DELAY = 500; // ms
		    private int mDotColor;
		    private int mDotEndColor;
		    private int mAnimationDuration;
		    private int mWidthBetweenDotCenters;
		    private int mNumberDots;
		    private float mDotRadius;
		    private float mDotScaleMultiplier;
		    private float mDotMaxRadius;
		    private float mHorizontalSpacing;
		    private long mStartTime = -1;
		    private boolean mShouldAnimate;
		    private boolean mDismissed = false;
		    private boolean mIsRunning = false;
		    private boolean mAnimateColors = false;
		    private ArrayList<DilatingDotDrawable> mDrawables = new ArrayList<>();
		    private final List<android.animation.Animator> mAnimations = new ArrayList<>();
		    /** delayed runnable to stop the progress */
		    private final Runnable mDelayedHide = new Runnable() {
			        @Override
			        public void run() {
				            mStartTime = -1;
				            mIsRunning = false;
				            setVisibility(View.GONE);
				            stopAnimations();
				        }
			    };
		
		    /** delayed runnable to start the progress */
		    private final Runnable mDelayedShow = new Runnable() {
			        @Override
			        public void run() {
				            if (!mDismissed) {
					                mStartTime = System.currentTimeMillis();
					                setVisibility(View.VISIBLE);
					                startAnimations();
					            }
				        }
			    };
		
		    public DilatingDotsProgressBar(Context context) {
			        this(context, null);
			    }
		
		    public DilatingDotsProgressBar(Context context, AttributeSet attrs) {
			        this(context, attrs, 0);
			    }
		
		    public DilatingDotsProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
			        super(context, attrs, defStyleAttr);
			        init(attrs);
			    }
		
		    private void init(AttributeSet attrs) {
			        //TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.DilatingDotsProgressBar);
			        //mNumberDots = a.getInt(R.styleable.DilatingDotsProgressBar_dd_numDots, 3);
			        //mDotRadius = a.getDimension(R.styleable.DilatingDotsProgressBar_android_radius, 8);
			        //mDotColor = a.getColor(R.styleable.DilatingDotsProgressBar_android_color, 0xff9c27b0);
			        //mDotEndColor = a.getColor(R.styleable.DilatingDotsProgressBar_dd_endColor, mDotColor);
			        //mDotScaleMultiplier = a.getFloat(R.styleable.DilatingDotsProgressBar_dd_scaleMultiplier, DEFAULT_GROWTH_MULTIPLIER);
			        //mAnimationDuration = a.getInt(R.styleable.DilatingDotsProgressBar_dd_animationDuration, 300);
			        //mHorizontalSpacing = a.getDimension(R.styleable.DilatingDotsProgressBar_dd_horizontalSpacing, 12);
			        //a.recycle();
			
			
			        mNumberDots = 3;
			        mDotRadius = 8;
			        mDotColor = Color.RED;
			        mDotEndColor = mDotColor;
			        mDotScaleMultiplier = DEFAULT_GROWTH_MULTIPLIER;
			        mAnimationDuration = 300;
			        mHorizontalSpacing = 12;
			
			
			
			        mShouldAnimate = false;
			        mAnimateColors = mDotColor != mDotEndColor;
			        calculateMaxRadius();
			        calculateWidthBetweenDotCenters();
			
			        initDots();
			        updateDots();
			    }
		
		    @Override
		    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
			        super.onSizeChanged(w, h, oldw, oldh);
			        if (computeMaxHeight() != h || w != computeMaxWidth()) {
				            updateDots();
				        }
			    }
		
		    @Override
		    public void onDetachedFromWindow() {
			        super.onDetachedFromWindow();
			        removeCallbacks();
			    }
		
		    private void removeCallbacks() {
			        removeCallbacks(mDelayedHide);
			        removeCallbacks(mDelayedShow);
			    }
		
		    public void reset() {
			        hideNow();
			    }
		
		    /**
     * Hide the progress view if it is visible. The progress view will not be
     * hidden until it has been shown for at least a minimum show time. If the
     * progress view was not yet visible, cancels showing the progress view.
     */
		    @SuppressWarnings ("unused")
		    public void hide() {
			        hide(MIN_SHOW_TIME);
			    }
		
		    public void hide(int delay) {
			        mDismissed = true;
			        removeCallbacks(mDelayedShow);
			        long diff = System.currentTimeMillis() - mStartTime;
			        if ((diff >= delay) || (mStartTime == -1)) {
				            mDelayedHide.run();
				        } else {
				            if ((delay - diff) <= 0) {
					                mDelayedHide.run();
					            } else {
					                postDelayed(mDelayedHide, delay - diff);
					            }
				        }
			    }
		
		    /**
     * Show the progress view after waiting for a minimum delay. If
     * during that time, hide() is called, the view is never made visible.
     */
		    @SuppressWarnings ("unused")
		    public void show() {
			        show(MIN_DELAY);
			    }
		
		    @SuppressWarnings ("unused")
		    public void showNow() {
			        show(0);
			    }
		
		    @SuppressWarnings ("unused")
		    public void hideNow() {
			        hide(0);
			    }
		
		    public void show(int delay) {
			        if (mIsRunning) {
				            return;
				        }
			
			        mIsRunning = true;
			
			        mStartTime = -1;
			        mDismissed = false;
			        removeCallbacks(mDelayedHide);
			
			        if (delay == 0) {
				            mDelayedShow.run();
				        } else {
				            postDelayed(mDelayedShow, delay);
				        }
			    }
		
		    @Override
		    protected void onDraw(Canvas canvas) {
			        if (shouldAnimate()) {
				            for (DilatingDotDrawable dot : mDrawables) {
					                dot.draw(canvas);
					            }
				        }
			    }
		
		    @Override
		    protected boolean verifyDrawable(final android.graphics.drawable.Drawable who) {
			        if (shouldAnimate()) {
				            return mDrawables.contains(who);
				        }
			        return super.verifyDrawable(who);
			    }
		
		    @Override
		    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
			        setMeasuredDimension((int) computeMaxWidth(), (int) computeMaxHeight());
			    }
		
		    private float computeMaxHeight() {
			        return mDotMaxRadius * 2;
			    }
		
		    private float computeMaxWidth() {
			        return computeWidth() + ((mDotMaxRadius - mDotRadius) * 2);
			    }
		
		    private float computeWidth() {
			        return (((mDotRadius * 2) + mHorizontalSpacing) * mDrawables.size()) - mHorizontalSpacing;
			    }
		
		    private void calculateMaxRadius() {
			        mDotMaxRadius = mDotRadius * mDotScaleMultiplier;
			    }
		
		    private void calculateWidthBetweenDotCenters() {
			        mWidthBetweenDotCenters = (int) (mDotRadius * 2) + (int) mHorizontalSpacing;
			    }
		
		    private void initDots() {
			        mDrawables.clear();
			        mAnimations.clear();
			        for (int i = 1; i <= mNumberDots; i++) {
				            final DilatingDotDrawable dot = new DilatingDotDrawable(mDotColor, mDotRadius, mDotMaxRadius);
				            dot.setCallback(this);
				            mDrawables.add(dot);
				
				            final long startDelay = (i - 1) * (int) (START_DELAY_FACTOR * mAnimationDuration);
				
				            // Sizing
				            android.animation.ValueAnimator growAnimator = android.animation.ObjectAnimator.ofFloat(dot, "radius", mDotRadius, mDotMaxRadius, mDotRadius);
				            growAnimator.setDuration(mAnimationDuration);
				            growAnimator.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
				            if (i == mNumberDots) {
					                growAnimator.addListener(new android.animation.AnimatorListenerAdapter() {
						                    @Override
						                    public void onAnimationEnd(android.animation.Animator animation) {
							                        if (shouldAnimate()) {
								                            startAnimations();
								                        }
							                    }
						                });
					            }
				            growAnimator.setStartDelay(startDelay);
				
				            mAnimations.add(growAnimator);
				
				            if (mAnimateColors) {
					                // Gradient
					                android.animation.ValueAnimator colorAnimator = android.animation.ValueAnimator.ofInt(mDotEndColor, mDotColor);
					                colorAnimator.setDuration(mAnimationDuration);
					                colorAnimator.setEvaluator(new android.animation.ArgbEvaluator());
					                colorAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {
						
						                    @Override
						                    public void onAnimationUpdate(android.animation.ValueAnimator animator) {
							                        dot.setColor((int) animator.getAnimatedValue());
							                    }
						
						                });
					                if (i == mNumberDots) {
						                    colorAnimator.addListener(new android.animation.AnimatorListenerAdapter() {
							                        @Override
							                        public void onAnimationEnd(android.animation.Animator animation) {
								                            if (shouldAnimate()) {
									                                startAnimations();
									                            }
								                        }
							                    });
						                }
					                colorAnimator.setStartDelay(startDelay);
					
					                mAnimations.add(colorAnimator);
					            }
				        }
			    }
		
		    private void updateDots() {
			        if (mDotRadius <= 0) {
				            mDotRadius = getHeight() / 2 / mDotScaleMultiplier;
				        }
			
			        int left = (int) (mDotMaxRadius - mDotRadius);
			        int right = (int) (left + mDotRadius * 2) + 2;
			        int top = 0;
			        int bottom = (int) (mDotMaxRadius * 2) + 2;
			
			        for (int i = 0; i < mDrawables.size(); i++) {
				            final DilatingDotDrawable dot = mDrawables.get(i);
				            dot.setRadius(mDotRadius);
				            dot.setBounds(left, top, right, bottom);
				            android.animation.ValueAnimator growAnimator = (android.animation.ValueAnimator) mAnimations.get(i);
				            growAnimator.setFloatValues(mDotRadius, mDotRadius * mDotScaleMultiplier, mDotRadius);
				
				            left += mWidthBetweenDotCenters;
				            right += mWidthBetweenDotCenters;
				        }
			    }
		
		    protected void startAnimations() {
			        mShouldAnimate = true;
			        for (android.animation.Animator anim : mAnimations) {
				            anim.start();
				        }
			    }
		
		    protected void stopAnimations() {
			        mShouldAnimate = false;
			        removeCallbacks();
			        for (android.animation.Animator anim : mAnimations) {
				            anim.cancel();
				        }
			    }
		
		    protected boolean shouldAnimate() {
			        return mShouldAnimate;
			    }
		
		    // -------------------------------
		    // ------ Getters & Setters ------
		    // -------------------------------
		
		    public void setDotRadius(float radius) {
			        reset();
			        mDotRadius = radius;
			        calculateMaxRadius();
			        calculateWidthBetweenDotCenters();
			        setupDots();
			    }
		
		    public void setDotSpacing(float horizontalSpacing) {
			        reset();
			        mHorizontalSpacing = horizontalSpacing;
			        calculateWidthBetweenDotCenters();
			        setupDots();
			    }
		
		    public void setGrowthSpeed(int growthSpeed) {
			        reset();
			        mAnimationDuration = growthSpeed;
			        setupDots();
			    }
		
		    public void setNumberOfDots(int numDots) {
			        reset();
			        mNumberDots = numDots;
			        setupDots();
			    }
		
		    public void setDotScaleMultiplier(float multiplier) {
			        reset();
			        mDotScaleMultiplier = multiplier;
			        calculateMaxRadius();
			        setupDots();
			    }
		
		    public void setDotColor(int color) {
			        if (color != mDotColor) {
				            if (mAnimateColors) {
					                // Cancel previous animations
					                reset();
					                mDotColor = color;
					                mDotEndColor = color;
					                mAnimateColors = false;
					
					                setupDots();
					
					            } else {
					                mDotColor = color;
					                for (DilatingDotDrawable dot : mDrawables) {
						                    dot.setColor(mDotColor);
						                }
					            }
				        }
			    }
		
		    /**
     * Set different start and end colors for dots. This will result in gradient behaviour. In case you want set 1 solid
     * color - use {@link #setDotColor(int)} instead
     *
     * @param startColor starting color of the dot
     * @param endColor   ending color of the dot
     */
		    public void setDotColors(int startColor, int endColor) {
			        if (mDotColor != startColor || mDotEndColor != endColor) {
				            if (mAnimateColors) {
					                reset();
					            }
				            mDotColor = startColor;
				            mDotEndColor = endColor;
				
				            mAnimateColors = mDotColor != mDotEndColor;
				
				            setupDots();
				        }
			    }
		
		    private void setupDots() {
			        initDots();
			        updateDots();
			        showNow();
			    }
		
		    public int getDotGrowthSpeed() {
			        return mAnimationDuration;
			    }
		
		    public float getDotRadius() {
			        return mDotRadius;
			    }
		
		    public float getHorizontalSpacing() {
			        return mHorizontalSpacing;
			    }
		
		    public int getNumberOfDots() {
			        return mNumberDots;
			    }
		
		    public float getDotScaleMultiplier() {
			        return mDotScaleMultiplier;
			    }
	}
	
	
	
	{
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}

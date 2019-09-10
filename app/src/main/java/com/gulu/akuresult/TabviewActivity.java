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
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;

public class TabviewActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private double x = 0;
	private double y = 0;
	private HashMap<String, Object> senddata = new HashMap<>();
	private String checkdata = "";
	private double width = 0;
	private String str = "";
	
	private ArrayList<HashMap<String, Object>> allmsg = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout click1;
	private LinearLayout click2;
	private LinearLayout click3;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout indicator1;
	private LinearLayout indicator2;
	private LinearLayout indicator3;
	private LinearLayout tab1;
	private LinearLayout tab2;
	private LinearLayout tab3;
	private LinearLayout linear8;
	private LinearLayout linear11;
	private LinearLayout linear9;
	private TextView textview5;
	private ListView listview2;
	private EditText edittext1;
	private Button button1;
	private WebView webview1;
	private TextView textview4;
	
	private AlertDialog.Builder dialog;
	private Calendar cal = Calendar.getInstance();
	private Intent in = new Intent();
	private DatabaseReference diss = _firebase.getReference("akuresult/discuss");
	private ChildEventListener _diss_child_listener;
	private SharedPreferences Email;
	private FirebaseAuth au;
	private OnCompleteListener<AuthResult> _au_create_user_listener;
	private OnCompleteListener<AuthResult> _au_sign_in_listener;
	private OnCompleteListener<Void> _au_reset_password_listener;
	private Vibrator vb;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tabview);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		click1 = (LinearLayout) findViewById(R.id.click1);
		click2 = (LinearLayout) findViewById(R.id.click2);
		click3 = (LinearLayout) findViewById(R.id.click3);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		indicator1 = (LinearLayout) findViewById(R.id.indicator1);
		indicator2 = (LinearLayout) findViewById(R.id.indicator2);
		indicator3 = (LinearLayout) findViewById(R.id.indicator3);
		tab1 = (LinearLayout) findViewById(R.id.tab1);
		tab2 = (LinearLayout) findViewById(R.id.tab2);
		tab3 = (LinearLayout) findViewById(R.id.tab3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview5 = (TextView) findViewById(R.id.textview5);
		listview2 = (ListView) findViewById(R.id.listview2);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		button1 = (Button) findViewById(R.id.button1);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview4 = (TextView) findViewById(R.id.textview4);
		dialog = new AlertDialog.Builder(this);
		Email = getSharedPreferences("mailid", Activity.MODE_PRIVATE);
		au = FirebaseAuth.getInstance();
		vb = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		click1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tab1.setVisibility(View.VISIBLE);
				tab2.setVisibility(View.GONE);
				tab3.setVisibility(View.GONE);
				indicator1.setVisibility(View.VISIBLE);
				indicator2.setVisibility(View.INVISIBLE);
				indicator3.setVisibility(View.INVISIBLE);
				indicator1.setBackgroundColor(0xFF00897B);
			}
		});
		
		click2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tab1.setVisibility(View.GONE);
				tab2.setVisibility(View.VISIBLE);
				tab3.setVisibility(View.GONE);
				indicator1.setVisibility(View.INVISIBLE);
				indicator2.setVisibility(View.VISIBLE);
				indicator3.setVisibility(View.INVISIBLE);
				indicator2.setBackgroundColor(0xFF4DB6AC);
			}
		});
		
		click3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tab1.setVisibility(View.GONE);
				tab2.setVisibility(View.GONE);
				tab3.setVisibility(View.VISIBLE);
				indicator1.setVisibility(View.INVISIBLE);
				indicator2.setVisibility(View.INVISIBLE);
				indicator3.setVisibility(View.VISIBLE);
				indicator3.setBackgroundColor(0xFF4DB6AC);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cal = Calendar.getInstance();
				if (Email.getString("uid", "").equals("")) {
					in.setClass(getApplicationContext(), UsersignupActivity.class);
					startActivity(in);
				}
				else {
					if (edittext1.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "message  Cant  Be empty 😀😀");
					}
					else {
						senddata = new HashMap<>();
						senddata.put("uid", Email.getString("uid", ""));
						senddata.put("nickname", Email.getString("mailid", ""));
						senddata.put("msg", edittext1.getText().toString());
						senddata.put("date", new SimpleDateFormat("dd//MM hh:mm a").format(cal.getTime()));
						diss.push().updateChildren(senddata);
						senddata.clear();
					}
				}
				android.view.inputmethod.InputMethodManager imm = (android.view.inputmethod.InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
				
				listview2.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
				listview2.setStackFromBottom(true);
				
				edittext1.setText("");
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_diss_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				diss.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						allmsg = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								allmsg.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						vb.vibrate((long)(100));
						listview2.setAdapter(new Listview2Adapter(allmsg));
						((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
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
		diss.addChildEventListener(_diss_child_listener);
		
		_au_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_au_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
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
		
		 TabviewActivity.this.getWindow().setSoftInputMode( WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN );
		android.graphics.drawable.GradientDrawable g24= new android.graphics.drawable.GradientDrawable();
		g24.setColor(Color.parseColor("#FFFFFF"));
		g24.setCornerRadius(40);
		linear9.setBackground(g24);
		
		
		listview2.setDivider(null); 
		listview2.setDividerHeight(10);
		
		listview2.setOverScrollMode(View.OVER_SCROLL_NEVER);listview2.setVerticalScrollBarEnabled(false);
		_Tab1(tab1);
		_Tab2(tab2);
		_Tab3(tab3);
		indicator1.setBackgroundColor(0xFFF44336);
		indicator2.setBackgroundColor(0xFFF44336);
		indicator3.setBackgroundColor(0xFFF44336);
		indicator2.setVisibility(View.INVISIBLE);
		indicator3.setVisibility(View.INVISIBLE);
		textview4.setText("⚫ PRIVACY POLICY\n\n Anonymous  built the Bce Result app as ad supported app. This SERVICE is provided by  Anonymous  at no cost and is intended for use as is.\n\nThis page is used to inform visitors regarding my policies with the collection, use, and disclosure of Personal Information if anyone decided to use my Service.\n\nIf you choose to use my Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that I collect is used for providing and improving the Service. I will not use or share your information with anyone except as described in this Privacy Policy.\n\nThe terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at Bce Result unless otherwise defined in this Privacy Policy.\n\nFor a better experience, while using our Service, I may require you to provide us with certain personally identifiable information, including but not limited to .. The information that I request will be retained by us and used as described in this privacy policy.\n\nThe app does use third party services that may collect information used to identify you.\n\nLink to privacy policy of third party service providers used by the app\n\n\n\nADMOB - https://support.google.com/admob/answer/6128543?hl=en\n\n\nFIREBASE ANALYTICS - https://firebase.google.com/policies/analytics\n\n\n⚫CHANGES TO THIS PRIVACY POLICY\n\n I may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. I will notify you of any changes by posting the new Privacy Policy on this page. These changes are effective immediately after they are posted on this page.\n\n⚫CONTACT US\n\n If you have any questions or suggestions about my Privacy Policy, do not hesitate to contact me at hboy6700@gmai.com.");
		webview1.loadUrl("https://bcebakhtiyarpur.org/");
		listview2.setAdapter(new Listview2Adapter(allmsg));
		((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	private void _Tab1 (final View _view) {
		x = x;
		y = y;
		_view.setOnTouchListener(new View.OnTouchListener() {@Override public boolean onTouch(View p1, MotionEvent p2){ switch(p2.getAction()) { case MotionEvent.ACTION_DOWN: x = p2.getX();break; case MotionEvent.ACTION_UP: y = p2.getX();
					
					
					if (((x - y) < -250)) {
						
						
						
						
						
						
					}
					 if (((y - x) < -250)) {
						
						tab2.setVisibility(View.VISIBLE);
						tab3.setVisibility(View.GONE);
						tab1.setVisibility(View.GONE);
						indicator2.setVisibility(View.VISIBLE);
						indicator1.setVisibility(View.INVISIBLE);
						indicator3.setVisibility(View.INVISIBLE);
						indicator2.setBackgroundColor(0xFFFFD700);
					}
					break;}
				return true;}});
	}
	
	
	private void _Tab2 (final View _view) {
		x = x;
		y = y;
		_view.setOnTouchListener(new View.OnTouchListener() {@Override public boolean onTouch(View p1, MotionEvent p2){ switch(p2.getAction()) { case MotionEvent.ACTION_DOWN: x = p2.getX();break; case MotionEvent.ACTION_UP: y = p2.getX();
					
					
					if (((x - y) < -250)) {
						
						
						
						
						
						
						tab1.setVisibility(View.VISIBLE);
						tab2.setVisibility(View.GONE);
						tab3.setVisibility(View.GONE);
						indicator1.setVisibility(View.VISIBLE);
						indicator2.setVisibility(View.INVISIBLE);
						indicator3.setVisibility(View.INVISIBLE);
						indicator1.setBackgroundColor(0xFFFFD700);
					}
					 if (((y - x) < -250)) {
						
						tab3.setVisibility(View.VISIBLE);
						tab1.setVisibility(View.GONE);
						tab2.setVisibility(View.GONE);
						indicator3.setVisibility(View.VISIBLE);
						indicator2.setVisibility(View.INVISIBLE);
						indicator2.setVisibility(View.INVISIBLE);
						indicator3.setBackgroundColor(0xFFFFD700);
					}
					break;}
				return true;}});
	}
	
	
	private void _Tab3 (final View _view) {
		x = x;
		y = y;
		_view.setOnTouchListener(new View.OnTouchListener() {@Override public boolean onTouch(View p1, MotionEvent p2){ switch(p2.getAction()) { case MotionEvent.ACTION_DOWN: x = p2.getX();break; case MotionEvent.ACTION_UP: y = p2.getX();
					
					
					if (((x - y) < -250)) {
						
						
						
						
						
						
						tab2.setVisibility(View.VISIBLE);
						tab1.setVisibility(View.GONE);
						tab3.setVisibility(View.GONE);
						indicator2.setVisibility(View.VISIBLE);
						indicator1.setVisibility(View.INVISIBLE);
						indicator3.setVisibility(View.INVISIBLE);
						indicator2.setBackgroundColor(0xFFFFD700);
					}
					 if (((y - x) < -250)) {
						
					}
					break;}
				return true;}});
	}
	
	
	public class Listview2Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _view, ViewGroup _viewGroup) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _v = _view;
			if (_v == null) {
				_v = _inflater.inflate(R.layout.discussion, null);
			}
			
			final LinearLayout linear14 = (LinearLayout) _v.findViewById(R.id.linear14);
			final LinearLayout linear15 = (LinearLayout) _v.findViewById(R.id.linear15);
			final TextView textview10 = (TextView) _v.findViewById(R.id.textview10);
			final TextView textview8 = (TextView) _v.findViewById(R.id.textview8);
			final TextView textview11 = (TextView) _v.findViewById(R.id.textview11);
			
			if (Email.getString("uid", "").equals(allmsg.get((int)_position).get("uid").toString())) {
				linear14.setGravity(Gravity.RIGHT);
			}
			else {
				linear14.setGravity(Gravity.LEFT);
			}
			textview10.setText(allmsg.get((int)_position).get("nickname").toString());
			textview8.setText(allmsg.get((int)_position).get("msg").toString());
			textview11.setText(allmsg.get((int)_position).get("date").toString());
			
			return _v;
		}
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

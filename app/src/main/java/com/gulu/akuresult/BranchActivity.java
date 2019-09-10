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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;

public class BranchActivity extends AppCompatActivity {
	
	
	private LinearLayout linear20;
	private LinearLayout linear29;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear26;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private TextView textview11;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview4;
	private TextView textview5;
	private TextView textview10;
	
	private Intent transfer = new Intent();
	private InterstitialAd ia;
	private AdListener _ia_ad_listener;
	private SharedPreferences file;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.branch);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview10 = (TextView) findViewById(R.id.textview10);
		file = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("year", getIntent().getStringExtra("year"));
				transfer.putExtra("sem", getIntent().getStringExtra("sem"));
				transfer.putExtra("branch", textview7.getText().toString());
				transfer.setClass(getApplicationContext(), ListviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("year", getIntent().getStringExtra("year"));
				transfer.putExtra("sem", getIntent().getStringExtra("sem"));
				transfer.putExtra("branch", textview8.getText().toString());
				transfer.setClass(getApplicationContext(), ListviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("year", getIntent().getStringExtra("year"));
				transfer.putExtra("sem", getIntent().getStringExtra("sem"));
				transfer.putExtra("branch", textview9.getText().toString());
				transfer.setClass(getApplicationContext(), ListviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("year", getIntent().getStringExtra("year"));
				transfer.putExtra("sem", getIntent().getStringExtra("sem"));
				transfer.putExtra("branch", textview4.getText().toString());
				transfer.setClass(getApplicationContext(), ListviewActivity.class);
				startActivity(transfer);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.putExtra("lol", getIntent().getStringExtra("lol"));
				transfer.setClass(getApplicationContext(), RanckcardActivity.class);
				startActivity(transfer);
			}
		});
		
		_ia_ad_listener = new AdListener() {
			@Override
			public void onAdLoaded() {
				
			}
			
			@Override
			public void onAdFailedToLoad(int _param1) {
				final int _errorCode = _param1;
				
			}
			
			@Override
			public void onAdOpened() {
				
			}
			
			@Override
			public void onAdClosed() {
				ia.loadAd(new AdRequest.Builder().build());
			}
		};
	}
	private void initializeLogic() {
		ia = new InterstitialAd(getApplicationContext());
		ia.setAdListener(_ia_ad_listener);
		ia.setAdUnitId("ca-app-pub-7108406272329228/2834103249");
		ia.loadAd(new AdRequest.Builder().addTestDevice("214CDD9A66C9085BD7F4102E3D874EB0")
		.build());
		if (file.getString("cname", "").equals("126")) {
			_bce();
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		ia.show();
	}
	private void _bce () {
		if (getIntent().getStringExtra("year").equals("1822")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				textview10.setText("2018 - 2022 Rank Card First Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("2")) {
				textview10.setText("2018 -2022 Rank Card Second  Semester ");
			}
		}
		if (getIntent().getStringExtra("year").equals("1721")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				textview10.setText("2017 -2021 Rank Card First  Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("2")) {
				textview10.setText("2017 -2021 Rank Card Second   Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("3")) {
				textview10.setText("2017 -2021 Rank Card Third Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("4")) {
				textview10.setText("2017 -2021 Rank Card Fourth  Semester ");
			}
		}
		if (getIntent().getStringExtra("year").equals("1620")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				textview10.setText("2016 -2020 Rank Card First  Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("2")) {
				textview10.setText("2016 -2020 Rank Card Second Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("3")) {
				textview10.setText("2016 -2020 Rank Card Third  Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("4")) {
				textview10.setText("2016 -2020 Rank Card Fourth  Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("5")) {
				textview10.setText("2016 -2020 Rank Card Fifth  Semester ");
			}
			if (getIntent().getStringExtra("sem").equals("6")) {
				textview10.setText("2016 -2020 Rank Card Sixth  Semester ");
			}
		}
		textview7.setText("C.S.E");
		textview8.setText("E.E.E");
		textview9.setText("C.E");
		textview4.setText("M.E");
		linear26.setVisibility(View.GONE);
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

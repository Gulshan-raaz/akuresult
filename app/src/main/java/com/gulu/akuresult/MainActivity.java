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
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
	
	
	private double first = 0;
	private double second = 0;
	private double third = 0;
	
	private ArrayList<String> collegename = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private Spinner spinner1;
	private TextView textview1;
	
	private Intent transfer = new Intent();
	private AlertDialog.Builder dlg;
	private SharedPreferences file;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		textview1 = (TextView) findViewById(R.id.textview1);
		dlg = new AlertDialog.Builder(this);
		file = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position == 0) {
					
				}
				else {
					if (_position == 1) {
						file.edit().putString("cname", "107").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 2) {
						file.edit().putString("cname", "108").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 3) {
						file.edit().putString("cname", "111").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 4) {
						file.edit().putString("cname", "110").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 5) {
						file.edit().putString("cname", "109").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 6) {
						file.edit().putString("cname", "113").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 7) {
						file.edit().putString("cname", "117").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 8) {
						file.edit().putString("cname", "125").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 9) {
						file.edit().putString("cname", "129").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 10) {
						file.edit().putString("cname", "131").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 11) {
						file.edit().putString("cname", "130").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 12) {
						file.edit().putString("cname", "127").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 13) {
						file.edit().putString("cname", "126").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 14) {
						file.edit().putString("cname", "128").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 15) {
						file.edit().putString("cname", "124").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 16) {
						file.edit().putString("cname", "132").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 17) {
						file.edit().putString("cname", "135").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 18) {
						file.edit().putString("cname", "133").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 19) {
						file.edit().putString("cname", "134").commit();
						transfer.setClass(getApplicationContext(), YearActivity.class);
						startActivity(transfer);
						finish();
					}
					if (_position == 20) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 21) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 22) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 23) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 24) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 25) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 26) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 27) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 28) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 29) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 30) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 31) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 32) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 33) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 34) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 35) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 36) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 37) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (_position == 38) {
						dlg.setTitle("College Choosing ❓");
						dlg.setMessage("This College  is Started This year please Choose Another College 🚫");
						dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
				}
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
	}
	private void initializeLogic() {
		if (file.getString("cname", "").equals("")) {
			collegename.add((int)(0), "Select Your College 🤔");
			collegename.add((int)(1), "Muzafarpur Institute of  technology ");
			collegename.add((int)(2), "Bhagalpur College  of  engineering ");
			collegename.add((int)(3), "Darbhanga College of engineering ");
			collegename.add((int)(4), "Gaya College of engineering ");
			collegename.add((int)(5), "Nalanda College of engineering ");
			collegename.add((int)(6), "Motihari College of engineering ");
			collegename.add((int)(7), "L.N.J.P.I.T Chhapra");
			collegename.add((int)(8), "Rastrakavi Ramdhari singh Dinkar College of engineering ");
			collegename.add((int)(9), "Katihar engineering  College ");
			collegename.add((int)(10), "Purnea College  of  engineering ");
			collegename.add((int)(11), "Supaul College of engineering ");
			collegename.add((int)(12), "Sitamarhi Institute  of  technology ");
			collegename.add((int)(13), "Bakhtiyarpur College of engineering ");
			collegename.add((int)(14), "B.P Mandal College of engineering ");
			collegename.add((int)(15), "Sersah engineering College  sasaram");
			collegename.add((int)(16), "Seharsa College of engineering ");
			collegename.add((int)(17), "Government Engineering College Vaishali");
			collegename.add((int)(18), "Government engineering College Jamui");
			collegename.add((int)(19), "Government engineering College Banka");
			collegename.add((int)(20), "Government engineering College Nawada");
			collegename.add((int)(21), "Government engineering College  Kishanganj");
			collegename.add((int)(22), "Government  engineering College  Arariya");
			collegename.add((int)(23), "Government engineering College Munger");
			collegename.add((int)(24), "Government engineering College seohar");
			collegename.add((int)(25), "Government engineering College  Aurangabad");
			collegename.add((int)(26), "Government engineering College  West Champaran");
			collegename.add((int)(27), "Government engineering College kaimur");
			collegename.add((int)(28), "Government engineering College  Gopalganj");
			collegename.add((int)(29), "Government engineering College  Madhubani");
			collegename.add((int)(30), "Government engineering College  Siwan");
			collegename.add((int)(31), "Government engineering College  Jehanabad");
			collegename.add((int)(32), "Government engineering College  Arwal");
			collegename.add((int)(33), "Government engineering College  Khagariya");
			collegename.add((int)(34), "Government engineering College  Buxar");
			collegename.add((int)(35), "Government engineering College  Bhojpur");
			collegename.add((int)(36), "Government engineering College  Shekhpura");
			collegename.add((int)(37), "Government engineering College Lakhisarai");
			collegename.add((int)(38), "Government engineering College  Samastipur");
			spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, collegename));
			((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
		}
		else {
			transfer.setClass(getApplicationContext(), YearActivity.class);
			startActivity(transfer);
			finish();
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

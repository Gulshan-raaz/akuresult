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
import android.support.design.widget.FloatingActionButton;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.AdapterView;
import android.view.View;

public class YearActivity extends AppCompatActivity {
	
	
	private FloatingActionButton _fab;
	
	private ArrayList<String> list18 = new ArrayList<>();
	private ArrayList<String> list17 = new ArrayList<>();
	private ArrayList<String> list16 = new ArrayList<>();
	
	private LinearLayout linear58;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private TextView textview33;
	private Spinner spinner2;
	private TextView textview34;
	private Spinner spinner3;
	private TextView textview35;
	private Spinner spinner4;
	
	private Intent transfer = new Intent();
	private AlertDialog.Builder dlg;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.year);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		textview33 = (TextView) findViewById(R.id.textview33);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		textview34 = (TextView) findViewById(R.id.textview34);
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		textview35 = (TextView) findViewById(R.id.textview35);
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		dlg = new AlertDialog.Builder(this);
		
		spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (String.valueOf((long)(_position)).equals("0")) {
					
				}
				else {
					if (String.valueOf((long)(_position)).equals("1")) {
						transfer.putExtra("year", "1822");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("2")) {
						transfer.putExtra("year", "1822");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("3")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("4")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("5")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("6")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("7")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("8")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
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
		
		spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (String.valueOf((long)(_position)).equals("0")) {
					
				}
				else {
					if (String.valueOf((long)(_position)).equals("1")) {
						transfer.putExtra("year", "1721");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("2")) {
						transfer.putExtra("year", "1721");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("3")) {
						transfer.putExtra("year", "1721");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("4")) {
						transfer.putExtra("year", "1721");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("5")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("6")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("7")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("8")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
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
		
		spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (String.valueOf((long)(_position)).equals("0")) {
					
				}
				else {
					if (String.valueOf((long)(_position)).equals("1")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("2")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("3")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("4")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("5")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("6")) {
						transfer.putExtra("year", "1620");
						transfer.putExtra("sem", String.valueOf((long)(_position)));
						transfer.setClass(getApplicationContext(), BranchActivity.class);
						startActivity(transfer);
					}
					if (String.valueOf((long)(_position)).equals("7")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						dlg.create().show();
					}
					if (String.valueOf((long)(_position)).equals("8")) {
						dlg.setTitle("Result");
						dlg.setMessage("We can't Show  The Result  Without Exam\nBut We  Can predict Your next  Semester  marks (In future update of this app)");
						dlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
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
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				transfer.setClass(getApplicationContext(), TabviewActivity.class);
				startActivity(transfer);
			}
		});
	}
	private void initializeLogic() {
		list18.add((int)(0), "Select Your Semester ");
		list18.add((int)(1), "First Semester ");
		list18.add((int)(2), "Second  Semester ");
		list18.add((int)(3), "Third Semester ");
		list18.add((int)(4), "Fourth Semester ");
		list18.add((int)(5), "Fifth Semester ");
		list18.add((int)(6), "Sixth Semester ");
		list18.add((int)(7), "Seventh  Semester ");
		list18.add((int)(8), "Eight Semester ");
		spinner2.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list18));
		((ArrayAdapter)spinner2.getAdapter()).notifyDataSetChanged();
		list17.add((int)(0), "Select Your Semester ");
		list17.add((int)(1), "First Semester ");
		list17.add((int)(2), "Second  Semester ");
		list17.add((int)(3), "Third Semester ");
		list17.add((int)(4), "Fourth Semester ");
		list17.add((int)(5), "Fifth Semester ");
		list17.add((int)(6), "Sixth Semester ");
		list17.add((int)(7), "Seventh  Semester ");
		list17.add((int)(8), "Eight Semester ");
		spinner3.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list17));
		((ArrayAdapter)spinner3.getAdapter()).notifyDataSetChanged();
		list16.add((int)(0), "Select Your Semester ");
		list16.add((int)(1), "First Semester ");
		list16.add((int)(2), "Second  Semester ");
		list16.add((int)(3), "Third Semester ");
		list16.add((int)(4), "Fourth Semester ");
		list16.add((int)(5), "Fifth Semester ");
		list16.add((int)(6), "Sixth Semester ");
		list16.add((int)(7), "Seventh  Semester ");
		list16.add((int)(8), "Eight Semester ");
		spinner4.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list16));
		((ArrayAdapter)spinner4.getAdapter()).notifyDataSetChanged();
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

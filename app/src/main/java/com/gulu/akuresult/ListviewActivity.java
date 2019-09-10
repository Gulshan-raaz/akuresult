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
import java.util.HashMap;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.AdapterView;

public class ListviewActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private double n = 0;
	private double len = 0;
	
	private ArrayList<HashMap<String, Object>> data = new ArrayList<>();
	
	private ListView listview1;
	private LinearLayout linear2;
	
	private Intent transfer = new Intent();
	private DatabaseReference result = _firebase.getReference("akuresult/2016/1/cse");
	private ChildEventListener _result_child_listener;
	private DatabaseReference result2 = _firebase.getReference("akuresult/2016/2/cse");
	private ChildEventListener _result2_child_listener;
	private DatabaseReference result3 = _firebase.getReference("akuresult/2016/3/cse");
	private ChildEventListener _result3_child_listener;
	private DatabaseReference result4 = _firebase.getReference("akuresult/2016/4/cse");
	private ChildEventListener _result4_child_listener;
	private DatabaseReference result5 = _firebase.getReference("akuresult/2016/5/cse");
	private ChildEventListener _result5_child_listener;
	private DatabaseReference result6 = _firebase.getReference("akuresult/2016/6/cse");
	private ChildEventListener _result6_child_listener;
	private DatabaseReference resultce1 = _firebase.getReference("akuresult/2016/1/ce");
	private ChildEventListener _resultce1_child_listener;
	private DatabaseReference resultce2 = _firebase.getReference("akuresult/2016/2/ce");
	private ChildEventListener _resultce2_child_listener;
	private DatabaseReference resultce3 = _firebase.getReference("akuresult/2016/3/ce");
	private ChildEventListener _resultce3_child_listener;
	private DatabaseReference resultce4 = _firebase.getReference("akuresult/2016/4/ce");
	private ChildEventListener _resultce4_child_listener;
	private DatabaseReference resultce5 = _firebase.getReference("akuresult/2016/5/ce");
	private ChildEventListener _resultce5_child_listener;
	private DatabaseReference resultce6 = _firebase.getReference("akuresult/2016/6/ce");
	private ChildEventListener _resultce6_child_listener;
	private DatabaseReference resultme1 = _firebase.getReference("akuresult/2016/1/me");
	private ChildEventListener _resultme1_child_listener;
	private DatabaseReference resultme2 = _firebase.getReference("akuresult/2016/2/me");
	private ChildEventListener _resultme2_child_listener;
	private DatabaseReference resultme3 = _firebase.getReference("akuresult/2016/3/me");
	private ChildEventListener _resultme3_child_listener;
	private DatabaseReference resultme4 = _firebase.getReference("akuresult/2016/4/me");
	private ChildEventListener _resultme4_child_listener;
	private DatabaseReference resultme5 = _firebase.getReference("akuresult/2016/5/me");
	private ChildEventListener _resultme5_child_listener;
	private DatabaseReference resultme6 = _firebase.getReference("akuresult/2016/6/me");
	private ChildEventListener _resultme6_child_listener;
	private DatabaseReference resulteee1 = _firebase.getReference("akuresult/2016/1/eee");
	private ChildEventListener _resulteee1_child_listener;
	private DatabaseReference resulteee2 = _firebase.getReference("akuresult/2016/2/eee");
	private ChildEventListener _resulteee2_child_listener;
	private DatabaseReference resulteee3 = _firebase.getReference("akuresult/2016/3/eee");
	private ChildEventListener _resulteee3_child_listener;
	private DatabaseReference resulteee4 = _firebase.getReference("akuresult/2016/4/eee");
	private ChildEventListener _resulteee4_child_listener;
	private DatabaseReference resulteee5 = _firebase.getReference("akuresult/2016/5/eee");
	private ChildEventListener _resulteee5_child_listener;
	private DatabaseReference resulteee6 = _firebase.getReference("akuresult/2016/6/eee");
	private ChildEventListener _resulteee6_child_listener;
	private DatabaseReference result17cse1 = _firebase.getReference("akuresult/2017/1/cse");
	private ChildEventListener _result17cse1_child_listener;
	private DatabaseReference result17cse2 = _firebase.getReference("akuresult/2017/2/cse");
	private ChildEventListener _result17cse2_child_listener;
	private DatabaseReference result17cse3 = _firebase.getReference("akuresult/2017/3/cse");
	private ChildEventListener _result17cse3_child_listener;
	private DatabaseReference result17ce1 = _firebase.getReference("akuresult/2017/1/ce");
	private ChildEventListener _result17ce1_child_listener;
	private DatabaseReference result17ce2 = _firebase.getReference("akuresult/2017/2/ce");
	private ChildEventListener _result17ce2_child_listener;
	private DatabaseReference result17ce3 = _firebase.getReference("akuresult/2017/3/ce");
	private ChildEventListener _result17ce3_child_listener;
	private DatabaseReference result17eee1 = _firebase.getReference("akuresult/2017/1/eee");
	private ChildEventListener _result17eee1_child_listener;
	private DatabaseReference result17eee2 = _firebase.getReference("akuresult/2017/2/eee");
	private ChildEventListener _result17eee2_child_listener;
	private DatabaseReference result17eee3 = _firebase.getReference("akuresult/2017/3/eee");
	private ChildEventListener _result17eee3_child_listener;
	private DatabaseReference result17me1 = _firebase.getReference("akuresult/2017/1/me");
	private ChildEventListener _result17me1_child_listener;
	private DatabaseReference result17me2 = _firebase.getReference("akuresult/2017/2/me");
	private ChildEventListener _result17me2_child_listener;
	private DatabaseReference result17me3 = _firebase.getReference("akuresult/2017/3/me");
	private ChildEventListener _result17me3_child_listener;
	private DatabaseReference akuresult18cse1 = _firebase.getReference("akuresult/2018/1/cse");
	private ChildEventListener _akuresult18cse1_child_listener;
	private DatabaseReference akuresult18ce1 = _firebase.getReference("akuresult/2017/1/ce");
	private ChildEventListener _akuresult18ce1_child_listener;
	private DatabaseReference result18me1 = _firebase.getReference("akuresult/2017/1/me");
	private ChildEventListener _result18me1_child_listener;
	private DatabaseReference result18eee1 = _firebase.getReference("akuresult/2017/1/eee");
	private ChildEventListener _result18eee1_child_listener;
	private InterstitialAd ai;
	private AdListener _ai_ad_listener;
	private DatabaseReference result174 = _firebase.getReference("akuresult/2017/4/cse");
	private ChildEventListener _result174_child_listener;
	private DatabaseReference result17eee4 = _firebase.getReference("akuresult/2017/4/eee");
	private ChildEventListener _result17eee4_child_listener;
	private DatabaseReference result17me4 = _firebase.getReference("akuresult/2017/4/me");
	private ChildEventListener _result17me4_child_listener;
	private DatabaseReference result17ce4 = _firebase.getReference("akuresult/2017/4/ce");
	private ChildEventListener _result17ce4_child_listener;
	private DatabaseReference result18ce2 = _firebase.getReference("akuresult/2018/2/ce");
	private ChildEventListener _result18ce2_child_listener;
	private DatabaseReference result18eee2 = _firebase.getReference("akuresult/2018/2/eee");
	private ChildEventListener _result18eee2_child_listener;
	private DatabaseReference result18cs2 = _firebase.getReference("akuresult/2018/2/cse");
	private ChildEventListener _result18cs2_child_listener;
	private DatabaseReference result18me2 = _firebase.getReference("akuresult/2018/2/me");
	private ChildEventListener _result18me2_child_listener;
	private SharedPreferences file;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.listview);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		listview1 = (ListView) findViewById(R.id.listview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		file = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (mRewardedVideoAd.isLoaded()) {
					mRewardedVideoAd.show();
				} else {
					Toast.makeText(ListviewActivity.this, "Ad not loaded yet", Toast.LENGTH_SHORT).show();
				}
				transfer.putExtra("ttt", data.get((int)_position).get("web").toString());
				transfer.putExtra("regn", data.get((int)_position).get("regno").toString());
				transfer.setClass(getApplicationContext(), WebviewActivity.class);
				startActivity(transfer);
			}
		});
		
		_result_child_listener = new ChildEventListener() {
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
		result.addChildEventListener(_result_child_listener);
		
		_result2_child_listener = new ChildEventListener() {
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
		result2.addChildEventListener(_result2_child_listener);
		
		_result3_child_listener = new ChildEventListener() {
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
		result3.addChildEventListener(_result3_child_listener);
		
		_result4_child_listener = new ChildEventListener() {
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
		result4.addChildEventListener(_result4_child_listener);
		
		_result5_child_listener = new ChildEventListener() {
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
		result5.addChildEventListener(_result5_child_listener);
		
		_result6_child_listener = new ChildEventListener() {
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
		result6.addChildEventListener(_result6_child_listener);
		
		_resultce1_child_listener = new ChildEventListener() {
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
		resultce1.addChildEventListener(_resultce1_child_listener);
		
		_resultce2_child_listener = new ChildEventListener() {
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
		resultce2.addChildEventListener(_resultce2_child_listener);
		
		_resultce3_child_listener = new ChildEventListener() {
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
		resultce3.addChildEventListener(_resultce3_child_listener);
		
		_resultce4_child_listener = new ChildEventListener() {
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
		resultce4.addChildEventListener(_resultce4_child_listener);
		
		_resultce5_child_listener = new ChildEventListener() {
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
		resultce5.addChildEventListener(_resultce5_child_listener);
		
		_resultce6_child_listener = new ChildEventListener() {
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
		resultce6.addChildEventListener(_resultce6_child_listener);
		
		_resultme1_child_listener = new ChildEventListener() {
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
		resultme1.addChildEventListener(_resultme1_child_listener);
		
		_resultme2_child_listener = new ChildEventListener() {
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
		resultme2.addChildEventListener(_resultme2_child_listener);
		
		_resultme3_child_listener = new ChildEventListener() {
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
		resultme3.addChildEventListener(_resultme3_child_listener);
		
		_resultme4_child_listener = new ChildEventListener() {
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
		resultme4.addChildEventListener(_resultme4_child_listener);
		
		_resultme5_child_listener = new ChildEventListener() {
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
		resultme5.addChildEventListener(_resultme5_child_listener);
		
		_resultme6_child_listener = new ChildEventListener() {
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
		resultme6.addChildEventListener(_resultme6_child_listener);
		
		_resulteee1_child_listener = new ChildEventListener() {
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
		resulteee1.addChildEventListener(_resulteee1_child_listener);
		
		_resulteee2_child_listener = new ChildEventListener() {
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
		resulteee2.addChildEventListener(_resulteee2_child_listener);
		
		_resulteee3_child_listener = new ChildEventListener() {
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
		resulteee3.addChildEventListener(_resulteee3_child_listener);
		
		_resulteee4_child_listener = new ChildEventListener() {
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
		resulteee4.addChildEventListener(_resulteee4_child_listener);
		
		_resulteee5_child_listener = new ChildEventListener() {
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
		resulteee5.addChildEventListener(_resulteee5_child_listener);
		
		_resulteee6_child_listener = new ChildEventListener() {
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
		resulteee6.addChildEventListener(_resulteee6_child_listener);
		
		_result17cse1_child_listener = new ChildEventListener() {
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
		result17cse1.addChildEventListener(_result17cse1_child_listener);
		
		_result17cse2_child_listener = new ChildEventListener() {
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
		result17cse2.addChildEventListener(_result17cse2_child_listener);
		
		_result17cse3_child_listener = new ChildEventListener() {
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
		result17cse3.addChildEventListener(_result17cse3_child_listener);
		
		_result17ce1_child_listener = new ChildEventListener() {
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
		result17ce1.addChildEventListener(_result17ce1_child_listener);
		
		_result17ce2_child_listener = new ChildEventListener() {
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
		result17ce2.addChildEventListener(_result17ce2_child_listener);
		
		_result17ce3_child_listener = new ChildEventListener() {
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
		result17ce3.addChildEventListener(_result17ce3_child_listener);
		
		_result17eee1_child_listener = new ChildEventListener() {
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
		result17eee1.addChildEventListener(_result17eee1_child_listener);
		
		_result17eee2_child_listener = new ChildEventListener() {
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
		result17eee2.addChildEventListener(_result17eee2_child_listener);
		
		_result17eee3_child_listener = new ChildEventListener() {
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
		result17eee3.addChildEventListener(_result17eee3_child_listener);
		
		_result17me1_child_listener = new ChildEventListener() {
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
		result17me1.addChildEventListener(_result17me1_child_listener);
		
		_result17me2_child_listener = new ChildEventListener() {
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
		result17me2.addChildEventListener(_result17me2_child_listener);
		
		_result17me3_child_listener = new ChildEventListener() {
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
		result17me3.addChildEventListener(_result17me3_child_listener);
		
		_akuresult18cse1_child_listener = new ChildEventListener() {
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
		akuresult18cse1.addChildEventListener(_akuresult18cse1_child_listener);
		
		_akuresult18ce1_child_listener = new ChildEventListener() {
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
		akuresult18ce1.addChildEventListener(_akuresult18ce1_child_listener);
		
		_result18me1_child_listener = new ChildEventListener() {
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
		result18me1.addChildEventListener(_result18me1_child_listener);
		
		_result18eee1_child_listener = new ChildEventListener() {
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
		result18eee1.addChildEventListener(_result18eee1_child_listener);
		
		_result174_child_listener = new ChildEventListener() {
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
		result174.addChildEventListener(_result174_child_listener);
		
		_result17eee4_child_listener = new ChildEventListener() {
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
		result17eee4.addChildEventListener(_result17eee4_child_listener);
		
		_result17me4_child_listener = new ChildEventListener() {
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
		result17me4.addChildEventListener(_result17me4_child_listener);
		
		_result17ce4_child_listener = new ChildEventListener() {
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
		result17ce4.addChildEventListener(_result17ce4_child_listener);
		
		_result18ce2_child_listener = new ChildEventListener() {
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
		result18ce2.addChildEventListener(_result18ce2_child_listener);
		
		_result18eee2_child_listener = new ChildEventListener() {
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
		result18eee2.addChildEventListener(_result18eee2_child_listener);
		
		_result18cs2_child_listener = new ChildEventListener() {
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
		result18cs2.addChildEventListener(_result18cs2_child_listener);
		
		_result18me2_child_listener = new ChildEventListener() {
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
		result18me2.addChildEventListener(_result18me2_child_listener);
		
		_ai_ad_listener = new AdListener() {
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
				ai.loadAd(new AdRequest.Builder().build());
			}
		};
	}
	private void initializeLogic() {
		mRewardedVideoAd = com.google.android.gms.ads.MobileAds.getRewardedVideoAdInstance(this);
		
		mRewardedVideoAd.setRewardedVideoAdListener(new com.google.android.gms.ads.reward.RewardedVideoAdListener(){
			@Override
			public void onRewarded(com.google.android.gms.ads.reward.RewardItem reward) {
				Toast.makeText(ListviewActivity.this, "onRewarded! currency: " + reward.getType() + " amount: " + reward.getAmount(), Toast.LENGTH_SHORT).show();
				
			}
			@Override
			public void onRewardedVideoAdLeftApplication() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoAdLeftApplication", Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onRewardedVideoAdClosed() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoAdClosed", Toast.LENGTH_SHORT).show();
				
				loadRewardedVideoAd();
			}
			@Override
			public void onRewardedVideoAdFailedToLoad(int errorCode) {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoAdFailedToLoad", Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onRewardedVideoAdLoaded() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoAdLoaded", Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onRewardedVideoAdOpened() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoAdOpened", Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onRewardedVideoStarted() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoStarted", Toast.LENGTH_SHORT).show();
			}
			@Override
			public void onRewardedVideoCompleted() {
				Toast.makeText(ListviewActivity.this, "onRewardedVideoCompleted", Toast.LENGTH_SHORT).show();
			}
		});
		
		loadRewardedVideoAd();
		ai = new InterstitialAd(getApplicationContext());
		ai.setAdListener(_ai_ad_listener);
		ai.setAdUnitId("ca-app-pub-7108406272329228/2834103249");
		ai.loadAd(new AdRequest.Builder().addTestDevice("214CDD9A66C9085BD7F4102E3D874EB0")
		.build());
		_CoolAnimation();
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
	public void onResume() {
		super.onResume();
		mRewardedVideoAd.resume(this);
	}
	
	@Override
	public void onPause() {
		super.onPause();
		mRewardedVideoAd.pause(this);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mRewardedVideoAd.destroy(this);
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
		linear2.addView(bar); 
		
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
	
	
	private void _extra () {
	}
	com.google.android.gms.ads.reward.RewardedVideoAd mRewardedVideoAd;
	
	private void loadRewardedVideoAd() {
		mRewardedVideoAd.loadAd("ca-app-pub-7108406272329228/2834103249", new AdRequest.Builder().build());
	}
	
	
	private void _bce () {
		if (getIntent().getStringExtra("year").equals("1620")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("2")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("3")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("4")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result4.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce4.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme4.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee4.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("5")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result5.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce5.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme5.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee5.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("6")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result6.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					resultce6.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					resultme6.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					resulteee6.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
		}
		if (getIntent().getStringExtra("year").equals("1721")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result17cse1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					result17ce1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					result17me1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					result17eee1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("2")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result17cse2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					result17ce2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					result17me2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					result17eee2.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			if (getIntent().getStringExtra("sem").equals("3")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					result17cse3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					result17ce3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					result17me3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					result17eee3.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
		}
		if (getIntent().getStringExtra("year").equals("1822")) {
			if (getIntent().getStringExtra("sem").equals("1")) {
				if (getIntent().getStringExtra("branch").equals("C.S.E")) {
					akuresult18cse1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("C.E")) {
					akuresult18ce1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("M.E")) {
					result18me1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
				if (getIntent().getStringExtra("branch").equals("E.E.E")) {
					result18eee1.addListenerForSingleValueEvent(new ValueEventListener() {
						@Override
						public void onDataChange(DataSnapshot _dataSnapshot) {
							data = new ArrayList<>();
							try {
								GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
								for (DataSnapshot _data : _dataSnapshot.getChildren()) {
									HashMap<String, Object> _map = _data.getValue(_ind);
									data.add(_map);
								}
							}
							catch (Exception _e) {
								_e.printStackTrace();
							}
							listview1.setAdapter(new Listview1Adapter(data));
							((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
							linear2.setVisibility(View.GONE);
						}
						@Override
						public void onCancelled(DatabaseError _databaseError) {
						}
					});
				}
			}
			listview1.setBackgroundColor(0xFFB0BEC5);
		}
	}
	
	
	private void _mit () {
		
	}
	
	
	private void _Bhagalpur () {
		
	}
	
	
	private void _darbhanga () {
		
	}
	
	
	private void _gaya () {
		
	}
	
	
	private void _nalanda () {
		
	}
	
	
	private void _motihari () {
		
	}
	
	
	private void _chhapra () {
		
	}
	
	
	private void _rastrakavi_begusarai () {
		
	}
	
	
	private void _katihar () {
		
	}
	
	
	private void _purnea () {
		
	}
	
	
	private void _supaul () {
		
	}
	
	
	private void _sitamarhi () {
		
	}
	
	
	private void _bpmandal_madhepura () {
		
	}
	
	
	private void _sershah () {
		
	}
	
	
	private void _seharsa () {
		
	}
	
	
	private void _vaishali () {
		
	}
	
	
	private void _jamui () {
		
	}
	
	
	private void _banka () {
		
	}
	
	
	private void _nawada () {
		
	}
	
	
	private void _kishanganj () {
		
	}
	
	
	private void _arrariya () {
		
	}
	
	
	private void _munger () {
		
	}
	
	
	private void _seohar () {
		
	}
	
	
	private void _auranfabad () {
		
	}
	
	
	private void _champaran () {
		
	}
	
	
	private void _kaimur () {
		
	}
	
	
	private void _gopalganj () {
		
	}
	
	
	private void _madhubani () {
		
	}
	
	
	private void _siwan () {
		
	}
	
	
	private void _jehanabad () {
		
	}
	
	
	private void _arwal () {
		
	}
	
	
	private void _buxar () {
		
	}
	
	
	private void _bhojpur () {
		
	}
	
	
	private void _shekhpura () {
		
	}
	
	
	private void _lakhisarai () {
		
	}
	
	
	private void _samastipur () {
		
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_v = _inflater.inflate(R.layout.customview, null);
			}
			
			final TextView textview1 = (TextView) _v.findViewById(R.id.textview1);
			
			textview1.setText(data.get((int)_position).get("regno").toString());
			
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

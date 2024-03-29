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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class RanckcardActivity extends AppCompatActivity {
	
	
	private String str = "";
	private double rankno = 0;
	
	private ArrayList<HashMap<String, Object>> rank = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ListView listview1;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.ranckcard);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		listview1 = (ListView) findViewById(R.id.listview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
	}
	private void initializeLogic() {
		rankno = 0;
		if (getIntent().getStringExtra("lol").equals("161")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1ABMBaTjtXAJ6vmhFdyA_8XJ2PX8CQ0-V ");
		}
		if (getIntent().getStringExtra("lol").equals("162")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=16icz1xLFD5XeyZxGbdlmmGo95DnRE3kw");
		}
		if (getIntent().getStringExtra("lol").equals("163")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=12Pad0z1I7cWi58xVV6FDP8VyBKE4rLxw");
		}
		if (getIntent().getStringExtra("lol").equals("164")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1evn2OYgOJD-rGDuOl9gy2ajImnRPBlz5 ");
		}
		if (getIntent().getStringExtra("lol").equals("165")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1H_VPQ7wVfn7O_12c2cd_M4UUXbwGJfU- ");
		}
		if (getIntent().getStringExtra("lol").equals("166")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1mIFLlWbAPmI4ykTdZOeAgF8IoGbBB4q_");
		}
		if (getIntent().getStringExtra("lol").equals("171")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1soDVoZvTOgWKcCzqD7Pv3FOAelyoYVl9 ");
		}
		if (getIntent().getStringExtra("lol").equals("172")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1eNBCkOY_xwkHrAHtTCVPdBbnKpTlV8J2  ");
		}
		if (getIntent().getStringExtra("lol").equals("173")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1snMOcFOWvJwAswt2qGz9vcbmOsv6JOc ");
		}
		if (getIntent().getStringExtra("lol").equals("174")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1Pz6pYyCurN2G-_lgCAg4ejAfZjzz16RE ");
		}
		if (getIntent().getStringExtra("lol").equals("182")) {
			new BackTask().execute("https://docs.google.com/uc?export=download&id=1o9eQpl-O15izVIHRLCVy1waRyan4Ip91 ");
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
	
	private void _extra () {
	}
	
	private class BackTask extends AsyncTask<String, Integer, String> {
		
		@Override
		
		protected void onPreExecute() {}
		
		
		protected String doInBackground(String... address) {
			
			String output = "";
			
			try {
				
				java.net.URL url = new java.net.URL(address[0]);
				
				java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
				
				String line;
				
				while ((line = in.readLine()) != null) {
					
					output += line;
					
				}
				
				in.close(); } catch (java.net.MalformedURLException e) {
				
				output = e.getMessage();
				
			} catch (java.io.IOException e) {
				
				output = e.getMessage();
				
			} catch (Exception e) {
				
				output = e.toString();
				
			}
			
			return output;
			
		}
		
		
		protected void onProgressUpdate(Integer... values) {}
		
		
		protected void onPostExecute(String s){
			
			str=s;
			
			
			rank = new Gson().fromJson(str, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview1.setAdapter(new Listview1Adapter(rank));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		}
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
				_v = _inflater.inflate(R.layout.customranck, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _v.findViewById(R.id.linear1);
			final TextView textview2 = (TextView) _v.findViewById(R.id.textview2);
			final TextView textview3 = (TextView) _v.findViewById(R.id.textview3);
			
			textview2.setText(String.valueOf((long)(_position + 1)).concat("                       ".concat(String.valueOf((long)(Double.parseDouble(rank.get((int)_position).get("regno").toString()) / 1)))));
			textview3.setText(rank.get((int)_position).get("marks").toString());
			
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

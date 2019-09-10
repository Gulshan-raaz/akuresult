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
import android.widget.LinearLayout;
import android.webkit.WebView;
import android.webkit.WebSettings;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.AdListener;
import android.view.View;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;

public class WebviewActivity extends AppCompatActivity {
	
	
	private FloatingActionButton _fab;
	private String path = "";
	
	private LinearLayout linear1;
	private WebView webview2;
	
	private InterstitialAd ia;
	private AdListener _ia_ad_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.webview);
		initialize(_savedInstanceState);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		webview2 = (WebView) findViewById(R.id.webview2);
		webview2.getSettings().setJavaScriptEnabled(true);
		webview2.getSettings().setSupportZoom(true);
		
		webview2.setWebViewClient(new WebViewClient() {
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
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ia.show();
				webview2.zoomOut();
				webview2.zoomOut();
				webview2.zoomOut();
				webview2.zoomOut();
				try{
					android.graphics.pdf.PdfDocument document = new android.graphics.pdf.PdfDocument();
					
					android.graphics.pdf.PdfDocument.PageInfo pageInfo = new android.graphics.pdf.PdfDocument.PageInfo.Builder(linear1.getWidth(), linear1.getHeight(), 1).create();
					
					android.graphics.pdf.PdfDocument.Page page = document.startPage(pageInfo);
					
					Canvas canvas = page.getCanvas();
					Paint paint = new Paint();
					canvas.drawPaint(paint);
					linear1.draw(canvas);
					document.finishPage(page);
					
					path = FileUtil.getExternalStorageDir().concat("/".concat(getIntent().getStringExtra("regn").concat(".pdf")));
					FileUtil.writeFile(path, "");
					java.io.File myFile = new java.io.File(path);
					
					java.io.FileOutputStream fOut = new java.io.FileOutputStream(myFile);
					
					java.io.OutputStreamWriter myOutWriter = new java.io.OutputStreamWriter(fOut);
					
					document.writeTo(fOut);
					
					document.close();
					myOutWriter.close();
					fOut.close();
					
					Toast.makeText(getBaseContext(), "your result is  Saved in file manager", Toast.LENGTH_LONG).show();
					
				} catch (Exception e) {
					Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_LONG).show();
				}
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
		webview2.loadUrl("data:text/html,".concat(getIntent().getStringExtra("ttt").replace("[", "").replace("]", "")));
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

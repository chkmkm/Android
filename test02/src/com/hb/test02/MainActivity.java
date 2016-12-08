package com.hb.test02;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends Activity {

	WebView webView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        webView = (WebView) findViewById(R.id.webView1);
        webView.loadUrl("http://getbootstrap.com/");
        WebSettings setting = webView.getSettings();
        setting.setJavaScriptEnabled(true);
//        webView.setWebViewClient(new webURL());
    }
    
    class webURL extends WebViewClient{
    	
    	public webURL() {
    		onLoadResource(webView, "http://bootstrapk.com/");
		}
    	
    }
    
}

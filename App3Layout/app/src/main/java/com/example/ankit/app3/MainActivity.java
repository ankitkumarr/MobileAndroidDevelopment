package com.example.ankit.app3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((WebView)findViewById(R.id.webView)).loadUrl("https://www.google.com");
    }

    public void website1(View v) {
        ((WebView)findViewById(R.id.webView)).loadUrl("https://www.google.com");
    }

    public void website2(View v) {
        ((WebView)findViewById(R.id.webView)).loadUrl("http://www.cnn.com");
    }

    public void website3(View v) {
        ((WebView)findViewById(R.id.webView)).loadUrl("http://www.bing.com");
    }
}

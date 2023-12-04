package com.example.campusrecuitment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class learning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        WebView webView = findViewById(R.id.youtubeWebView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Replace "YOUR_YOUTUBE_CHANNEL_URL" with the actual URL of your YouTube channel
        String youtubeChannelUrl = "https://www.youtube.com/@abdul_bari";
        webView.loadUrl(youtubeChannelUrl);
    }
}
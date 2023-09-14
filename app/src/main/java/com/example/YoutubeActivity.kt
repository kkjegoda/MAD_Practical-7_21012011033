package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeWebView=findViewById<WebView>(R.id.video)
        val webSettings:WebSettings=youtubeWebView.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        val id="fJn9B64Znrk"
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$id")

    }
}
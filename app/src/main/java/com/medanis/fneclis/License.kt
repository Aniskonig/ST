package com.medanis.fneclis

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.ClientCertRequest
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_license.*
import kotlinx.android.synthetic.main.activity_license.view.webv
import java.net.URL

class License : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var webv: WebView? = findViewById<WebView>(R.id.webv)
        webv?.webViewClient = WebViewClient()
        setContentView(R.layout.activity_main) // replace with you xml file name webview
        var  url : String = intent.getStringExtra("value")?:""
        //val webv = findViewById<WebView>(R.id.webv)
       // webv.webViewClient = WebViewClient()
        startActivity(intent)
    }
}

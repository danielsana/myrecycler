package com.example.myrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class breakfastglovo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breakfastglovo)

        val bfglovo = findViewById<WebView>(R.id.bfglovo)
        bfglovo.loadUrl("https://www.ubereats.com/ke/category/nairobi-nairobi/breakfast-and-brunch")

        bfglovo.getSettings().setJavaScriptEnabled(true);
        bfglovo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }
}
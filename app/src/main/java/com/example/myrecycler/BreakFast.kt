package com.example.myrecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class BreakFast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.breakfast)

        val bugwebview = findViewById<WebView>(R.id.bugwebview)
        bugwebview.loadUrl("file:///android_asset/bugg.html")

        bugwebview.getSettings().setJavaScriptEnabled(true);
        bugwebview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        val breakfastg = findViewById<Button>(R.id.breakfastglovo)
        breakfastg.setOnClickListener {
            val intent = Intent(applicationContext,breakfastglovo::class.java)
            startActivity(intent)
        }
    }
}
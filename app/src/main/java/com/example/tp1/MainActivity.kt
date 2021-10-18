package com.example.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.chromium.base.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "good");
        Log.e("MainActivity", "error")
        Log.w("MainActivity", "this plugin might be depreced")
        Log.d("MainActivity","This application is running correctly");
    }
}
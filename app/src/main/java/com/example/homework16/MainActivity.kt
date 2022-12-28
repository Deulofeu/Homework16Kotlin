package com.example.homework16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStop() {
        super.onStop()
        val myIntent = Intent(this, SecondActivity::class.java)
        myIntent.putExtra("MESSAGE", "Good game!")
        startActivity(myIntent)
    }
}
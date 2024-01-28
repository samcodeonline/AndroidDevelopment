package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val TAG = "tag"
    lateinit var tvHelloWorld: TextView
    lateinit var btnClickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHelloWorld = findViewById(R.id.helloWorldTv)
        btnClickMe = findViewById(R.id.BtnClickMe)

        btnClickMe.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                var intent = Intent(this@MainActivity,ActivityTwo::class.java)
                startActivity(intent)
            }
        })
    }
}


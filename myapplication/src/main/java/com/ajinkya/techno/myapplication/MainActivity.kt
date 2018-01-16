package com.ajinkya.techno.myapplication

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        txtHello.setText("Hello, Ajinkya")
//        txtHello.setTextColor(Color.parseColor("#fff"))

        btnClick.setOnClickListener {
            startActivity(Intent(this, NextActivity::class.java))

        }

    }
}

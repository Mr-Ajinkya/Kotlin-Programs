package com.ajinkya.techno.myapplication

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

/**
 * Created by lenovo on 1/15/2018.
 */
class NextActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        txtWelcome.setTextColor(Color.BLUE)

    }


}
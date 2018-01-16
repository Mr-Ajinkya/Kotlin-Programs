package com.ajinkya.techno.ankodemo

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        verticalLayout(){
            val edt = editText(){
                hint = "Name"
            }

            button("okay"){
                onClick {
                    edt.setText("hello")
                }
            }
            button("Alert"){
                onClick {
                    alert {
                        title = "Title"
                        message = "message"
                        yesButton {

                        }
                        noButton {

                        }
                    }.show()
                }
            }

            button("Date picker"){
                onClick {
                    DatePickerDialog(
                            this@MainActivity,
                           DatePickerDialog.OnDateSetListener { datePicker, yr, mnth, dt ->
                               toast(""" $dt- ${mnth + 1}- $yr""")
                           },

                    2018,
                    0,
                    16
                    ).show()
                }
            }

            button("Time Picker") {
                onClick {
                    TimePickerDialog(
                            this@MainActivity, TimePickerDialog.OnTimeSetListener { _, hh, mm ->
                        toast(""" $hh : $mm """)
                    },
                            1,
                            12,
                            false
                    ).show()
                }
            }

        }
    }


}

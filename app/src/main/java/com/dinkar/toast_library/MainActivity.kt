package com.dinkar.toast_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dinkar.toaster.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toaster.msg(this@MainActivity,"Hi Dinkar")
    }
}
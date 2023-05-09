package com.dinkar.toaster

import android.app.Activity
import android.content.Context
import android.widget.Toast

object Toaster {

    fun msg(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}
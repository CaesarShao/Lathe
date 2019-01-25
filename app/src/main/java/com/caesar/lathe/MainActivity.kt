package com.caesar.lathe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.caesarlib.lathe.LogHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dos()
    }

    fun dos() {
        LogHelper.setEnable(true)
        for (i in 0..7) {
            LogHelper.I(i.toString())
        }
    }
}

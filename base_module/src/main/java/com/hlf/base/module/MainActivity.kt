package com.hlf.base.module

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hlf.base.module.utils.LogUtils
import com.hlf.base.module.utils.e

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainActivity::class.java.e()
    }
}

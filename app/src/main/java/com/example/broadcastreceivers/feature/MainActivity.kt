package com.example.broadcastreceivers.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.broadcastreceivers.R
import com.example.broadcastreceivers.util.NetworkUtil
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
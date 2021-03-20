package com.example.broadcastreceivers.feature

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.broadcastreceivers.R
import com.example.broadcastreceivers.di.DIManager
import com.example.broadcastreceivers.util.NetworkUtil
import com.example.broadcastreceivers.util.RandomReceiver
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
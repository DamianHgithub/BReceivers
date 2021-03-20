package com.example.broadcastreceivers.util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import org.koin.android.ext.android.get
import org.koin.java.KoinJavaComponent.get

class RandomReceiver(
    val networkUtil: NetworkUtil
): BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (networkUtil.isConnected()) Log.d("Network", "Online")
        else Log.d("Network", "Offline")
    }
}
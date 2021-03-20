package com.example.broadcastreceivers.di

import android.app.Application
import android.content.IntentFilter
import com.example.broadcastreceivers.util.RandomReceiver
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DIManager(): Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DIManager)
            modules(listOf(
                utilModule
            ))
        }
        val randomReceiver = get<RandomReceiver>()
        registerReceiver(randomReceiver, IntentFilter(("android.net.conn.CONNECTIVITY_CHANGE")))
    }
}
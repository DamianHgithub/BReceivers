package com.example.broadcastreceivers.di

import com.example.broadcastreceivers.util.NetworkUtil
import com.example.broadcastreceivers.util.RandomReceiver
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val utilModule = module {
    single { NetworkUtil(androidContext()) }
    single { RandomReceiver(get()) }
}
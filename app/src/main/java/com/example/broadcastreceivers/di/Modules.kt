package com.example.broadcastreceivers.di

import com.example.broadcastreceivers.util.NetworkUtil
import org.koin.dsl.module

val utilModule = module {
    single { NetworkUtil(get()) }
}
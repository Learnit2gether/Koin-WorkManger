package com.example.workmanager

import android.app.Application
import com.example.workmanager.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin

class WorkManagerApp : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WorkManagerApp)
            workManagerFactory()
            modules(appModule)
        }
    }
}
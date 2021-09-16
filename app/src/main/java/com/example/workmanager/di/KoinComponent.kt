package com.example.workmanager.di

import com.example.workmanager.NetworkWorker
import com.example.workmanager.SampleUseCase
import org.koin.androidx.workmanager.dsl.worker
import org.koin.dsl.module

val appModule = module {

    worker {
        NetworkWorker(context = get(), workerParams = get())
    }

    single {
        SampleUseCase()
    }

}
package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

private const val TAG = "NetworkWorker"

class NetworkWorker(context: Context, workerParams: WorkerParameters) : Worker(
    context,
    workerParams
), KoinComponent {

    val sampleUseCase: SampleUseCase by inject()

    override fun doWork(): Result {
        Log.d(TAG, "doWork: ")
        sampleUseCase.workerUseCase()
        return Result.success()
    }
}
package com.example.corotinesmasterclass

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, params: WorkerParameters) :
    Worker(context, params) {


    override fun doWork(): Result {
        try {
            Log.d("--------","Success")
        } catch (ex: Exception) {
            Log.d("--------","Success FAILED")
            return Result.failure(); //или Result.retry()
        }
        return Result.success()
    }




    override fun onStopped() {
        super.onStopped()
        Log.d("--------","Stoppped")
    }




}
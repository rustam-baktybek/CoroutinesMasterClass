package com.example.corotinesmasterclass

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger


class MainActivity : AppCompatActivity() {
    val sharedCounter: AtomicInteger = AtomicInteger(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWorkRequest =
            PeriodicWorkRequestBuilder<MyWorker>(
                15,
                TimeUnit.DAYS,
                17,
                TimeUnit.MINUTES
            )
                .build()

        WorkManager.getInstance(this).enqueue(myWorkRequest)

    }
}











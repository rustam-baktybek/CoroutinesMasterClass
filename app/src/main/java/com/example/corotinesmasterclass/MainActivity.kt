package com.example.corotinesmasterclass

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger


class MainActivity : AppCompatActivity() {
    val sharedCounter: AtomicInteger = AtomicInteger(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.Default).launch {
            Log.d("--------","coroutines")

        }






























    }
}



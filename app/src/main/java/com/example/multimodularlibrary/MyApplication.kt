package com.example.multimodularlibrary

import android.app.Application
import com.example.myaarlocationsearchlibrary.core.data.LocationSearchManager

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        LocationSearchManager.init(this, "sampleAPIKey")
    }
}
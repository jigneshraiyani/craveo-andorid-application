package com.example.craveto

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CraveoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any application-wide resources here if needed
    }
}
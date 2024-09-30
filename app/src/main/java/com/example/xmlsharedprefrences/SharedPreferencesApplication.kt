package com.example.xmlsharedprefrences

import android.app.Application

class SharedPreferencesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Preferences(this)
    }
}
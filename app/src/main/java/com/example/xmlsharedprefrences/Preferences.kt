package com.example.xmlsharedprefrences

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class Preferences (application: Application) {

    init {
        Companion.application = application
    }
    companion object{
        lateinit var application: Application

        fun setStringValue(key:String, value :String?){
            sharedPreferences.edit().putString(key, value).apply()
        }
        fun getStringValue(key: String): String? {
            return sharedPreferences.getString(key, null)
        }
        private val sharedPreferences : SharedPreferences
            get() {
                return application.getSharedPreferences(
                    "shared_preferences_compose_preferences", Context.MODE_PRIVATE
                )
            }

    }
}
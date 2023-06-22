package com.example.sharedpreferences

import android.app.Application

class UserVipApplication : Application() {

    companion object{
        lateinit var prefferences: Prefferences
    }

    override fun onCreate() {
        super.onCreate()
        prefferences = Prefferences(applicationContext)
    }
}
package com.fission.sampleproject

import android.app.Application
import com.fission.sampleproject.data.SampleDatabase
import timber.log.Timber

class MainApp : Application() {

    init {
        instance = this
    }

    companion object {
        lateinit var instance: MainApp
        val database: SampleDatabase = SampleDatabase.getAppDataBase(instance.applicationContext)!!
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}

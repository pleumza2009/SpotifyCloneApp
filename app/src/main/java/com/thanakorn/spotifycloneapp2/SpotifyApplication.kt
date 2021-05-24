package com.thanakorn.spotifycloneapp2

import android.app.Application
import com.thanakorn.spotifycloneapp2.di.appModule
import com.thanakorn.spotifycloneapp2.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SpotifyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SpotifyApplication)
            modules(appModule, serviceModule)
            
        }
    }


}
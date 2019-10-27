package dev.nathanmkaya.spacexlaunchtracker

import android.app.Application
import dev.nathanmkaya.spacexlaunchtracker.di.appModule
import dev.nathanmkaya.spacexlaunchtracker.di.dataModule
import dev.nathanmkaya.spacexlaunchtracker.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SpaceXApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SpaceXApp)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}
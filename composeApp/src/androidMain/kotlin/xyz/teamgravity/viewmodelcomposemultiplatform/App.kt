package xyz.teamgravity.viewmodelcomposemultiplatform

import KoinInitializer
import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInitializer(this).init()
    }
}
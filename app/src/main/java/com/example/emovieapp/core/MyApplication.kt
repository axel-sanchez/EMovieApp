package com.example.emovieapp.core

import android.app.Application
import com.example.emovieapp.di.ApplicationComponent
import com.example.emovieapp.di.ApplicationModule
import com.example.emovieapp.di.DaggerApplicationComponent

/**
 * @author Axel Sanchez
 */
class MyApplication: Application() {
    val component: ApplicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .build()
}
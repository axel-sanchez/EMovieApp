package com.example.emovieapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * @author Axel Sanchez
 */
@Module
class ApplicationModule(private val context: Context){
    @Provides
    @Singleton
    fun provideContext(): Context = context
}
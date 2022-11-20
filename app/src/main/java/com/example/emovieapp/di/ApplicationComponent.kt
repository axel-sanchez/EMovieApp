package com.example.emovieapp.di

import com.example.emovieapp.presentation.HomeFragment
import dagger.Component
import javax.inject.Singleton

/**
 * @author Axel Sanchez
 */
@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent{
    fun inject(homeFragment: HomeFragment)
}
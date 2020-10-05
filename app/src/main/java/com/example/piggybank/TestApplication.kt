package com.example.piggybank

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

import com.example.piggybank.di.DaggerAppComponent

class TestApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
     }


}
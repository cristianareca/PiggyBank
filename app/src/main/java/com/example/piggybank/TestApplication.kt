package com.example.piggybank

import com.example.piggybank.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication



class TestApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }


}
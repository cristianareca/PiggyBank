package com.example.piggybank.di


import android.app.Application
import com.example.data.di.DataMovementsModule
import com.example.data.di.DataPaymentsModule
import com.example.data.di.DataSourceApiModule

import com.example.piggybank.TestApplication
import com.example.piggybank.ui.movements.di.MovementsModule
import com.example.piggybank.ui.payments.di.PaymentsModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            FragmentBuildersModule::class,
            MovementsModule::class,
            DataMovementsModule::class,
            DataSourceApiModule::class,
            PaymentsModule::class,
            DataPaymentsModule::class,

        ]
)

interface AppComponent:AndroidInjector<TestApplication>{

    @Component.Factory
    interface Factory{
        fun create (@BindsInstance application:Application):AppComponent
    }
}

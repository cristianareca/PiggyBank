package com.example.piggybank.di


import android.app.Application
import com.example.data.di.*

import com.example.piggybank.TestApplication
import com.example.piggybank.ui.movements.di.MovementsModule
import com.example.piggybank.ui.payments.di.PaymentsModule
import com.example.piggybank.ui.safe.di.SafesModule
import com.example.piggybank.ui.send.di.SendModule
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
            SendModule::class,
            DataSendsModule::class,
            SafesModule::class,
            DataSafesModule::class

        ]
)

interface AppComponent:AndroidInjector<TestApplication>{

    @Component.Factory
    interface Factory{
        fun create (@BindsInstance application:Application):AppComponent
    }
}

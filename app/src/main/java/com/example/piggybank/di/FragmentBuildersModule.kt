package com.example.piggybank.di

import com.example.piggybank.ui.movements.fragments.MovementsHistoryFragment
import com.example.piggybank.ui.payments.fragments.PaymentsHistoryFragment
import com.example.piggybank.ui.safe.fragments.SafeMovementsFragment
import com.example.piggybank.ui.send.fragments.SendHistoryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovementsFragment():MovementsHistoryFragment
    @ContributesAndroidInjector
    abstract fun contributePaymentsFragment():PaymentsHistoryFragment
    @ContributesAndroidInjector
    abstract fun contributeSendFragment():SendHistoryFragment
    @ContributesAndroidInjector
    abstract fun contributeSafeFragment():SafeMovementsFragment
}
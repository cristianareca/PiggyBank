package com.example.piggybank.di

import com.example.piggybank.ui.movements.fragments.MovementsHistoryFragment
import com.example.piggybank.ui.obligations.fragments.ObligationsHistoryFragment
import com.example.piggybank.ui.payments.fragments.PaymentsHistoryFragment
import com.example.piggybank.ui.safe.fragments.SafeMovementsFragment
import com.example.piggybank.ui.send.fragments.SendingHistoryFragment

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovementsFragment():MovementsHistoryFragment

    @ContributesAndroidInjector
    abstract fun contributeObligationsFragment():ObligationsHistoryFragment

    @ContributesAndroidInjector
    abstract fun contributeSafesFragment():SafeMovementsFragment

    @ContributesAndroidInjector
    abstract fun contributePaymentsFragment():PaymentsHistoryFragment

    @ContributesAndroidInjector
    abstract fun contributeSendingsFragment():SendingHistoryFragment
}
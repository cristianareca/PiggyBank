package com.example.piggybank.di

import com.example.piggybank.ui.movements.fragments.MovementsHistoryFragment
import dagger.android.ContributesAndroidInjector

abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovementsFragment():MovementsHistoryFragment
}
package com.example.piggybank.di

import com.example.piggybank.ui.movements.fragments.MovementsHistoryFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovementsFragment():MovementsHistoryFragment

}
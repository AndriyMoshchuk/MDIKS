package com.Andriy.Moshchuk.movieviewer.presentation.di

import android.content.Context
import android.content.SharedPreferences
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import com.Andriy.Moshchuk.movieviewer.presentation.common.FlowNavigator
import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import javax.inject.Singleton

@Module
class AppModule(val activity: FragmentActivity, val fragmentManager: FragmentManager, val containerId: Int) {

    @Provides
    @Singleton
    fun provideCicerone(): Cicerone<Router> = Cicerone.create()


    @Provides
    @Singleton
    fun providesRouter(cicerone: Cicerone<Router>): Router = cicerone.router


    @Provides
    @Singleton
    fun providesNavigatorHolder(cicerone: Cicerone<Router>): NavigatorHolder = cicerone.navigatorHolder


    @Provides
    @Singleton
    fun provideFlowNavigator(): FlowNavigator = FlowNavigator(activity, fragmentManager, containerId)

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = activity?.getPreferences(Context.MODE_PRIVATE)
}
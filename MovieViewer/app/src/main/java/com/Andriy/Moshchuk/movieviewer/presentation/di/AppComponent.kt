package com.Andriy.Moshchuk.movieviewer.presentation.di

import com.Andriy.Moshchuk.movieviewer.presentation.AppActivity
import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.common.dialog.RateDialog
import com.Andriy.Moshchuk.movieviewer.presentation.discover.tab.DiscoverFragment
import com.Andriy.Moshchuk.movieviewer.presentation.movies.details.MovieDetailsFragment
import com.Andriy.Moshchuk.movieviewer.presentation.movies.list.MovieListFragment
import com.Andriy.Moshchuk.movieviewer.presentation.movies.tab.MovieTabFragment
import com.Andriy.Moshchuk.movieviewer.presentation.people.details.PersonDetailsFragment
import com.Andriy.Moshchuk.movieviewer.presentation.people.tab.PeopleTabFragment
import com.Andriy.Moshchuk.movieviewer.presentation.profile.LoginFragment
import com.Andriy.Moshchuk.movieviewer.presentation.profile.ProfileFragment
import com.Andriy.Moshchuk.movieviewer.presentation.search.SearchFragment
import com.Andriy.Moshchuk.movieviewer.presentation.tv.details.TvDetailsFragment
import com.Andriy.Moshchuk.movieviewer.presentation.tv.list.TvListFragment
import com.Andriy.Moshchuk.movieviewer.presentation.tv.tab.TvTabFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(target: MovieTabFragment)
    fun inject(target: AppActivity)
    fun inject(target: DiscoverFragment)
    fun inject(target: MovieListFragment)
    fun inject(target: TvListFragment)
    fun inject(target: MovieDetailsFragment)
    fun inject(target: TabNavigationFragment)
    fun inject(target: TvTabFragment)
    fun inject(target: TvDetailsFragment)
    fun inject(target: PeopleTabFragment)
    fun inject(target: PersonDetailsFragment)
    fun inject(target: ProfileFragment)
    fun inject(target: LoginFragment)
    fun inject(target: RateDialog)
    fun inject(target: SearchFragment)
}
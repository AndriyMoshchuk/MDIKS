package com.Andriy.Moshchuk.movieviewer.presentation.movies

import android.os.Bundle
import com.Andriy.Moshchuk.movieviewer.R
import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.movies.tab.MOVIE_TAB_FRAGMENT_KEY
import com.Andriy.Moshchuk.movieviewer.presentation.utils.NavigationKeys

class MoviesNavigationFragment : TabNavigationFragment() {

    override val navigationKey = NavigationKeys.MOVIES_NAVIGATION_KEY

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) == null)
            cicerone.router.navigateTo(MOVIE_TAB_FRAGMENT_KEY)
    }

    override fun backToRoot() {
        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) != null)
            cicerone.router.backTo(MOVIE_TAB_FRAGMENT_KEY)
    }
}
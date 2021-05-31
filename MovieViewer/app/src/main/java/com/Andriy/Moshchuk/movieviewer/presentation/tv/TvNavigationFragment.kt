package com.Andriy.Moshchuk.movieviewer.presentation.tv

import android.os.Bundle
import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.tv.tab.TV_TAB_FRAGMENT_KEY
import com.Andriy.Moshchuk.movieviewer.presentation.utils.NavigationKeys
import com.Andriy.Moshchuk.movieviewer.R

class TvNavigationFragment : TabNavigationFragment() {

    override val navigationKey = NavigationKeys.TV_NAVIGATION_KEY

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) == null)
            cicerone.router.navigateTo(TV_TAB_FRAGMENT_KEY)
    }

    override fun backToRoot() {
        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) != null)
            cicerone.router.backTo(TV_TAB_FRAGMENT_KEY)
    }
}
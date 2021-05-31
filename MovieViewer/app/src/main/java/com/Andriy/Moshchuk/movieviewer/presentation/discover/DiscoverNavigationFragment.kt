package com.Andriy.Moshchuk.movieviewer.presentation.discover

import android.os.Bundle

import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.discover.tab.DISCOVER_FRAGMENT_KEY
import com.Andriy.Moshchuk.movieviewer.presentation.utils.NavigationKeys
import com.Andriy.Moshchuk.movieviewer.R

class DiscoverNavigationFragment : TabNavigationFragment() {

    override val navigationKey = NavigationKeys.DISCOVER_NAVIGATION_KEY

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) == null)
            cicerone.router.navigateTo(DISCOVER_FRAGMENT_KEY)
    }

    override fun backToRoot() {
        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) != null)
            cicerone.router.backTo(DISCOVER_FRAGMENT_KEY)
    }
}
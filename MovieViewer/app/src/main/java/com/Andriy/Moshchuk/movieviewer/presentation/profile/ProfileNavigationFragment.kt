package com.Andriy.Moshchuk.movieviewer.presentation.profile

import android.os.Bundle

import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.utils.NavigationKeys
import com.Andriy.Moshchuk.movieviewer.R

class ProfileNavigationFragment : TabNavigationFragment() {

    override val navigationKey = NavigationKeys.PROFILE_NAVIGATION_KEY

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) == null)
            cicerone.router.navigateTo(PROFILE_FRAGMENT_KEY)
    }

    override fun backToRoot() {
        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) != null)
            cicerone.router.backTo(PROFILE_FRAGMENT_KEY)
    }
}
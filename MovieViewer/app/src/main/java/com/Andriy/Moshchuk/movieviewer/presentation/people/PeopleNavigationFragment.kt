package com.Andriy.Moshchuk.movieviewer.presentation.people

import android.os.Bundle
import com.Andriy.Moshchuk.movieviewer.presentation.common.TabNavigationFragment
import com.Andriy.Moshchuk.movieviewer.presentation.people.tab.PEOPLE_TAB_FRAGMENT_KEY
import com.Andriy.Moshchuk.movieviewer.presentation.utils.NavigationKeys
import com.Andriy.Moshchuk.movieviewer.R

class PeopleNavigationFragment : TabNavigationFragment() {

    override val navigationKey = NavigationKeys.PEOPLE_NAVIGATION_KEY

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) == null)
            cicerone.router.navigateTo(PEOPLE_TAB_FRAGMENT_KEY)
    }

    override fun backToRoot() {
        if (childFragmentManager.findFragmentById(R.id.navigationFragmentContainer) != null)
            cicerone.router.backTo(PEOPLE_TAB_FRAGMENT_KEY)
    }
}
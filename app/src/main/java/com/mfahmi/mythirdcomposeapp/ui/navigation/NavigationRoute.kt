package com.mfahmi.mythirdcomposeapp.ui.navigation

sealed class NavigationRoute(val route: String) {
    object AboutMe : NavigationRoute("about_me")
    object Experience : NavigationRoute("experience")
    object Education : NavigationRoute("education")
}

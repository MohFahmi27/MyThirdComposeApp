package com.mfahmi.mythirdcomposeapp.ui.navigation

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mfahmi.mythirdcomposeapp.ui.aboutme.AboutMeScreen
import com.mfahmi.mythirdcomposeapp.ui.education.EducationScreen
import com.mfahmi.mythirdcomposeapp.ui.experience.ExperienceScreen

@Composable
fun MainNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.AboutMe.route,
        modifier = Modifier.wrapContentSize()
    ) {
        composable(route = NavigationRoute.AboutMe.route) {
            AboutMeScreen(navController)
        }
        composable(route = NavigationRoute.Experience.route) {
            ExperienceScreen(navController)
        }
        composable(route = NavigationRoute.Education.route) {
            EducationScreen(navController)
        }
    }
}
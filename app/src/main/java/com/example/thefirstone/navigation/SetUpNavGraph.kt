package com.example.thefirstone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.thefirstone.presentation.screens.splash_screen.SplashScreen


@Composable
fun SetUpNavGraph(navControllerHost: NavHostController) {
    NavHost(navController = navControllerHost, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navControllerHost)
        }
    }
}
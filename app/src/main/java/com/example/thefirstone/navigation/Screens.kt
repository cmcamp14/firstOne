package com.example.thefirstone.navigation

sealed class Screens(val route: String){
    object SplashScreen: Screens("splash_screen")
}
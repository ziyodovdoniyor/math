package com.example.math.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.math.ui.theme.screens.SplashView

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Splash.route) {
        composable(route = Screens.Splash.route) {
            SplashView(navController = navController)
        }
        composable(route = Screens.Level.route) {
            SplashView(navController = navController)
        }
    }
}
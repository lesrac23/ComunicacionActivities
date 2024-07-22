package com.example.cominicacionactivity

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationComponent(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Login.route){
        composable(Screen.Login.route){
            LoginScreen(navController)

        }
        composable(Screen.Home.route){
            HomeScreen()
        }
    }

}
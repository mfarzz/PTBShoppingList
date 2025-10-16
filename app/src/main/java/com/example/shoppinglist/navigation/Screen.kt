package com.example.shoppinglist.navigation

sealed class Screen(val route: String, val title: String) {
    object Home : Screen("home", "Shopping List")
    object Profile : Screen("profile", "Profile")
    object Settings : Screen("settings", "Settings")
}
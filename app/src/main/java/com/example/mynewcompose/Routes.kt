package com.example.mynewcompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItemRoute(val routeName:String, val route:String, val icon:ImageVector){
    object Assistants:BottomNavItemRoute(routeName = "assistants", route = "AssistantsScreen", icon = Icons.Default.Home)
    object Settings:BottomNavItemRoute(routeName = "setting", route = "SettingsScreen", icon = Icons.Default.Settings)
    object Profile:BottomNavItemRoute(routeName = "profile", route = "ProfileScreen", icon =  Icons.Default.Person)
}

sealed class Route(val routeName:String, val route:String){
    object Login:Route(routeName = "login", route = "LoginScreen")
}

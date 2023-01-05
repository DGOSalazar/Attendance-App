package com.example.mynewcompose.ui.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.mynewcompose.ui.components.MyBottomNavigation
import com.example.mynewcompose.ui.components.MyTopAppBar

@Composable
fun SettingsScreen(navController: NavHostController) {
    Scaffold(topBar = { MyTopAppBar() },
        content = { ContentSettingsScreen() },
        bottomBar = { MyBottomNavigation(navController) })
}

@Composable
fun ContentSettingsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Text(text = "Settings content")
    }
}

package com.example.mynewcompose.ui.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.mynewcompose.ui.components.MyBottomNavigation
import com.example.mynewcompose.ui.components.MyTopAppBar

@Composable
fun ProfileScreen(navController: NavHostController){
    Scaffold(topBar = { MyTopAppBar() },
        content = { ContentProfileScreen() },
        bottomBar = { MyBottomNavigation(navController) })
}

@Preview
@Composable
fun ContentProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Text(text = "Profile content")
    }
}

package com.example.mynewcompose.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mynewcompose.BottomNavItemRoute

@Composable
fun MyBottomNavigation(navController:NavHostController) {
    val items = listOf(
        BottomNavItemRoute.Assistants,
        BottomNavItemRoute.Settings,
        BottomNavItemRoute.Profile
    )
    BottomNavigation(
        backgroundColor = Color(0xFFB7D2E7),
        elevation = 5.dp
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                selected = false,
                onClick = {
                    navController.navigate(item.route)
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "",
                        tint = Color(0xFF004F8C)
                        //tint = Color.White
                    )
                },
                //modifier = Modifier.background(Color(0xFF004F8C))
            )
        }
    }
}

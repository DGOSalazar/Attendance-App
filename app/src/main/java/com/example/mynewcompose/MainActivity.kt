package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynewcompose.ui.assistants.AssistantsScreen
import com.example.mynewcompose.ui.assistants.AssistantsViewModel
import com.example.mynewcompose.ui.login.LoginScreen
import com.example.mynewcompose.ui.login.LoginViewModel
import com.example.mynewcompose.ui.profile.ProfileScreen
import com.example.mynewcompose.ui.settings.SettingsScreen
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = Route.Login.route){
                        composable(Route.Login.route){ LoginScreen(navigationController, LoginViewModel()) }
                        composable(BottomNavItemRoute.Assistants.route){ AssistantsScreen(navigationController, AssistantsViewModel()) }
                        composable(BottomNavItemRoute.Settings.route){ SettingsScreen(navigationController) }
                        composable(BottomNavItemRoute.Profile.route){ ProfileScreen(navigationController) }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyNewComposeTheme {
        //ContentAssistantsScreen(LoginViewModel())
    }
}
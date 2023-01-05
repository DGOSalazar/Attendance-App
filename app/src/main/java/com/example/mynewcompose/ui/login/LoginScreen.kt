package com.example.mynewcompose.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mynewcompose.BottomNavItemRoute
import com.example.mynewcompose.R
import com.example.mynewcompose.ui.components.*
import com.example.mynewcompose.ui.login.components.MyLogoLogin
import com.example.mynewcompose.ui.theme.MyTextField

@Composable
fun LoginScreen(navController: NavHostController, loginViewModel: LoginViewModel) {
    val username:String by loginViewModel.email.observeAsState(initial = "")
    val password:String by loginViewModel.password.observeAsState(initial = "")
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(Modifier.padding(16.dp)) {
            MyLogoLogin(Modifier.align(alignment = Alignment.CenterHorizontally))
            MyTextWelcomeLogin()
            MyTextEnterYourCredentials()
            MyTextField(text = username, hint = stringResource(R.string.enter_your_email), onTextChanged = {
                loginViewModel.setEmailAndPassword(it, password)
            })
            MyTextField(text = password, hint = stringResource(R.string.enter_your_password), onTextChanged = {
                loginViewModel.setEmailAndPassword(username, it)
            })
            MyTextForgetYourPassword()
            MyVerticalSpace(32.dp)
            MyButton(text = stringResource(R.string.login), modifier = Modifier.fillMaxWidth(), onClickButton = {
                navController.navigate(route = BottomNavItemRoute.Assistants.route)
            })
        }
    }
}


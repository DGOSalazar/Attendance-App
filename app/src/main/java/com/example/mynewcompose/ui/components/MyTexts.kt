package com.example.mynewcompose.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynewcompose.R

@Preview(showBackground = true)
@Composable
fun MyTextEnterYourCredentials() {
    Text(
        text = stringResource(R.string.enter_your_credentials),
        fontSize = 20.sp,
        color = Color(0xFF0965AF),
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun MyTextWelcomeLogin() {
    Text(
        text = stringResource(R.string.welcome),
        fontSize = 24.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun MyTextForgetYourPassword() {
    Text(
        text = stringResource(R.string.forget_your_password),
        fontWeight = FontWeight.Light,
        color = Color(0xFFA5A3A3),
        fontSize = 11.sp,
        modifier = Modifier.padding(top = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun MyTextAssistants() {
    Text(
        text = stringResource(R.string.assistants),
        color = Color(0xFF0965AF),
        modifier = Modifier.padding(horizontal = 16.dp)
    )
}
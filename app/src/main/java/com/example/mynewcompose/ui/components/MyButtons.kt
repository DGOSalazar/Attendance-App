package com.example.mynewcompose.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyButton(text: String, modifier: Modifier, onClickButton:() -> Unit) {
    OutlinedButton(
        enabled = true,
        onClick = {onClickButton()},
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF0965AF),
            disabledBackgroundColor = Color(
                red = 0f,
                green = 0f,
                blue = 0f,
                alpha = 0.19f
            )
        ),
        modifier = modifier,
        border = BorderStroke(1.dp, Color.Transparent)

    ) {
        Text(text = text, color = Color.White)
    }
}
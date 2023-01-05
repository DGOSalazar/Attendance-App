package com.example.mynewcompose.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTextField(text:String, hint:String, onTextChanged: (String) -> Unit){
    TextField(
        value = text,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        label = {
            Text(
                text = hint,
                color = Color(0xFFA5A3A3),
                fontSize = 16.sp
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = Color(
                0xFFF5F5F5
            ),
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent
        ),
        singleLine = true,
        maxLines = 1
    )
}
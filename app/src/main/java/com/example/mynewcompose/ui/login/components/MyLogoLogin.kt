package com.example.mynewcompose.ui.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mynewcompose.R

@Composable
fun MyLogoLogin(modifier: Modifier) {
    Box(
        modifier = modifier
            .width(150.dp)
            .height(150.dp)
            .clip(RoundedCornerShape(25f))
            .background(Color(0xFF0965AF)),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "",
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(R.string.attendance),
                color = Color.White,
                fontSize = 24.sp
            )
        }
    }
}
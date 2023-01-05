package com.example.mynewcompose.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.R

@Preview
@Composable
fun MyTopAppBar() {
    TopAppBar(
        contentColor = Color.White,
        elevation = 5.dp,
        backgroundColor = Color(0xFF004F8C)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.logo_coppel_three),
                contentDescription = ""
            )
            MyHorizontalSpace(size = 8.dp)
            Text(
                text = stringResource(R.string.hello)
            )
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                BadgedBox(badge = {
                    Badge(
                        backgroundColor = Color.Yellow,
                        contentColor = Color.Red
                    ) { Text(text = "3") }
                }) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}
package com.example.mynewcompose.ui.assistants.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.domain.model.Assistant
import com.example.mynewcompose.ui.components.MyHorizontalSpace

@Composable
fun MyItemAttendent(attendent: Assistant) {
    Row(modifier = Modifier
        .fillMaxWidth()) {
        Icon(
            painter = painterResource(id = attendent.image),
            contentDescription = "",
            modifier = Modifier
                .width(20.dp)
                .height(20.dp)
        )
        MyHorizontalSpace(size = 8.dp)
        Text(
            text = attendent.name,
            color = Color(0xFF476D8C),
            fontWeight = FontWeight.Bold
        )
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End) {
            Icon(
                imageVector = Icons.Default.MoreHoriz,
                contentDescription = "",
                tint = Color.Gray
            )
        }
    }
}
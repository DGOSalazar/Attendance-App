package com.example.mynewcompose.ui.assistants.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyHelperOptions() {
    Row(Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp)) {
        Column(
            Modifier.weight(1f),
            horizontalAlignment = Alignment.Start
        ) {
            Icon(
                imageVector = Icons.Default.MoreHoriz,
                contentDescription = "",
                tint = Color.Gray
            )
        }
        Column(
            Modifier.weight(1f),
            horizontalAlignment = Alignment.End
        ) {
            Icon(
                imageVector = Icons.Default.HelpOutline,
                contentDescription = "",
                tint = Color.Gray
            )
        }
    }
}
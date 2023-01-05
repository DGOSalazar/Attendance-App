package com.example.mynewcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.mynewcompose.R


@Composable
fun MyDialog(title: String, subtitle: String, type: String, onCancelRequest: () -> Unit, onConfirmRequest: () -> Unit, onDismissDialog:() -> Unit) {
    Dialog(onDismissRequest = { onDismissDialog()}) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(25f))
                .background(Color(0xFFF6F6F6)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
            ) {
                MyVerticalSpace(size = 16.dp)
                Text(
                    text = title,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    color = if(type == "Info") {Color.Black} else {Color.Red}
                )
                MyVerticalSpace(size = 8.dp)
                Text(
                    text = subtitle,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                MyVerticalSpace(size = 16.dp)
                Divider()
                Row(Modifier.fillMaxWidth()) {
                    if (type == "Info") {
                        TextButton(onClick = { onCancelRequest()}, modifier = Modifier.weight(1f)) {
                            Text(text = stringResource(R.string.cancel), color = Color(0xFF239FD4))
                        }
                        Divider(
                            modifier = Modifier
                                .width(1.dp)
                                .fillMaxHeight()
                        )
                    }

                    TextButton(onClick = { onConfirmRequest()}, modifier = Modifier.weight(1f)) {
                        Text(text = stringResource(R.string.confirm), color = Color(0xFF239FD4))
                    }
                }
            }
        }
    }
}
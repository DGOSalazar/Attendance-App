package com.example.mynewcompose.ui.components

import android.view.ContextThemeWrapper
import android.widget.CalendarView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.mynewcompose.R

@Preview
@Composable
fun MyCalendarView() {
    var date by remember {
        mutableStateOf("")
    }
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 10.dp
    ) {
        Column {
            AndroidView(factory = {
                CalendarView(
                    ContextThemeWrapper(
                        it,
                        R.style.Theme_MyNewCompose
                    )
                )
            }, update = {
                it.setOnDateChangeListener { _, year, month, day ->
                    date = "$day - ${month + 1} - $year"
                }
            })
        }
    }
}
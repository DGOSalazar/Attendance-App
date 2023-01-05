package com.example.mynewcompose.ui.assistants.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.R
import com.example.mynewcompose.domain.model.Assistant
import com.example.mynewcompose.ui.assistants.AssistantsViewModel
import com.example.mynewcompose.ui.components.MyVerticalSpace

@Composable
fun MyRecyclerAssistants(assistantsViewModel:AssistantsViewModel) {
    LazyColumn(Modifier.padding(horizontal = 32.dp).height(150.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getAssistants()) { attendent ->
            MyItemAttendent(attendent)
            MyVerticalSpace(size = 8.dp)
            Divider()
        }
    }
}

fun getAssistants(): List<Assistant> {
    return listOf(
        Assistant("Hector Villanueva", R.drawable.logo_android),
        Assistant("Eduardo Juarez", R.drawable.logo_apple),
        Assistant("Jorge Perez", R.drawable.logo_java),
        Assistant("Diego Salazar", R.drawable.logo_mysql),
        Assistant("Hugo Aguayo", R.drawable.logo_mysql),
        Assistant("Francisco Villanueva", R.drawable.logo_mysql),
        Assistant("Humberto Macias", R.drawable.logo_mysql),
        Assistant("Cher Gonzalez", R.drawable.logo_mysql),
        Assistant("Cinthia Caldera", R.drawable.logo_mysql),
        Assistant("Edgar Celis", R.drawable.logo_mysql),
        Assistant("Vanessa Ruvalcaba", R.drawable.logo_mysql),
        Assistant("Elvira Legaspi", R.drawable.logo_mysql)
    )
}

package com.example.mynewcompose.ui.assistants

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mynewcompose.R
import com.example.mynewcompose.ui.assistants.components.MyHelperOptions
import com.example.mynewcompose.ui.assistants.components.MyRecyclerAssistants
import com.example.mynewcompose.ui.components.*

@Composable
fun AssistantsScreen(
    navigationController: NavHostController,
    assistantsViewModel: AssistantsViewModel
) {
    Scaffold(topBar = { MyTopAppBar() },
        content = { ContentAssistantsScreen(assistantsViewModel) },
        bottomBar = { MyBottomNavigation(navigationController) })
}


@Composable
fun ContentAssistantsScreen(assistantsViewModel: AssistantsViewModel) {
    val showConfirmationDialog by assistantsViewModel.showConfirmationDialog.observeAsState(initial = false)
    val showErrorDialog by assistantsViewModel.showErrorDialog.observeAsState(initial = false)
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        if (showConfirmationDialog) {
            MyDialog(
                title = stringResource(R.string.record_attendance),
                subtitle = stringResource(R.string.confirmation_record_attendance),
                type = "Info",
                onCancelRequest = { assistantsViewModel.hideDialog("ConfirmationDialog") },
                onConfirmRequest = { assistantsViewModel.recordAttendance() },
                onDismissDialog = { assistantsViewModel.hideDialog("ConfirmationDialog") }
            )
        }
        if (showErrorDialog) {
            MyDialog(
                title = stringResource(R.string.tittle_error),
                subtitle = stringResource(R.string.try_again_later),
                type = "Error",
                onCancelRequest = {},
                onConfirmRequest = { assistantsViewModel.hideDialog("ErrorDialog") },
                onDismissDialog = { assistantsViewModel.hideDialog("ErrorDialog") }
            )
        }
        /*MyDialog(
            title = "Error",
            subtitle = "No te encuentras cerca del domicilio señalado",
            type = "Error"
        )*/
        Column {
            MyHelperOptions()
            MyCalendarView()
            MyVerticalSpace(size = 8.dp)
            MyTextAssistants()
            MyVerticalSpace(size = 8.dp)
            Divider(color = Color(0xFFB7D0F5), modifier = Modifier.padding(horizontal = 16.dp))
            MyVerticalSpace(size = 16.dp)
            MyRecyclerAssistants(assistantsViewModel)
            MyVerticalSpace(size = 16.dp)
            MyButton(
                text = stringResource(R.string.record_attendance),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                onClickButton = {
                    assistantsViewModel.showDialog("ConfirmationDialog")
                }
            )
        }
    }
}
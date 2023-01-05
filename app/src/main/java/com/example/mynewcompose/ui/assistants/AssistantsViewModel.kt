package com.example.mynewcompose.ui.assistants

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AssistantsViewModel:ViewModel() {

    private val _showConfirmationDialog = MutableLiveData<Boolean>()
    val showConfirmationDialog:LiveData<Boolean> = _showConfirmationDialog
    private val _showErrorDialog = MutableLiveData<Boolean>()
    val showErrorDialog:LiveData<Boolean> = _showErrorDialog

    fun showDialog(typeDialog: String) {
        when(typeDialog){
            "ConfirmationDialog" -> _showConfirmationDialog.value = true
            "ErrorDialog" -> _showErrorDialog.value = true
        }
    }

    fun hideDialog(typeDialog: String) {
        when(typeDialog){
            "ConfirmationDialog" -> _showConfirmationDialog.value = false
            "ErrorDialog" -> _showErrorDialog.value = false
        }
    }

    fun recordAttendance() {
        hideDialog("ConfirmationDialog")
        showDialog("ErrorDialog")
    }
}
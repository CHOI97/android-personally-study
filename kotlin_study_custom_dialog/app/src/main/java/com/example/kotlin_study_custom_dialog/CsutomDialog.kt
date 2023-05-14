package com.example.kotlin_study_custom_dialog

import android.app.Dialog
import android.content.Context
import android.view.View
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog

class CustomDialog(private val context: Context): Dialog(context){

    override fun create() {
        dialog = builder.create()
    }

    override fun show() {
        dialog = builder.create()
        dialog?.show()
    }

    override fun dismiss() {
        dialog?.dismiss()
    }
}
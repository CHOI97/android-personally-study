//package com.example.kotlin_study_custom_dialog
//
//import android.app.Dialog
//import android.content.DialogInterface
//import android.os.Bundle
//import androidx.fragment.app.DialogFragment
//
//class AlertDialog: DialogFragment() {
//
//
//    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return activity?.let {
//            // Use the Builder class for convenient dialog construction
//            val builder = AlertDialog.Builder(it)
//            builder.setMessage("dialog test")
//                .setPositiveButton("dialog test",
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // START THE GAME!
//                    })
//                .setNegativeButton("취소",
//                    DialogInterface.OnClickListener { dialog, id ->
//                        // User cancelled the dialog
//                    })
//            // Create the AlertDialog object and return it
//            builder.create()
//        } ?: throw IllegalStateException("Activity cannot be null")
//    }
//}
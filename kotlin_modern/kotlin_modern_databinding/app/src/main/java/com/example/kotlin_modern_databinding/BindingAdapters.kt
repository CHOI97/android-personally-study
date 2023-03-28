package com.example.kotlin_modern_databinding

import android.widget.ProgressBar
import androidx.databinding.BindingAdapter

@BindingAdapter("app:progressScaled")
fun setProgress(progressBar: ProgressBar, counter: Int) {
    progressBar.progress = counter
}
//fun setProgress(progressBar: ProgressBar, counter: Int, max: Int) {
//    progressBar.progress = (counter * 2).coerceAtMost(max)
//}
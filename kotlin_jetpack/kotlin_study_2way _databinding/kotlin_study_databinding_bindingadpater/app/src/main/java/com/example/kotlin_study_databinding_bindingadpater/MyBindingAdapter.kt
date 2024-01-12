package com.example.kotlin_study_databinding_bindingadpater

import android.graphics.Color
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("myProgress")
fun myProgressSetting(view: ImageView,myPointType: MyPointType){
    when(myPointType){
        MyPointType.BIG->{view.setImageResource(R.drawable.baseline_battery_0_bar_24)}
        MyPointType.MEDIUM->{view.setColorFilter(Color.parseColor("#fa8072"))}
        MyPointType.SMALL->{view.setColorFilter(Color.parseColor("#ffb6c1"))}
        MyPointType.VERY_SMALL->{view.setColorFilter(Color.parseColor("#000000"))}
    }
}

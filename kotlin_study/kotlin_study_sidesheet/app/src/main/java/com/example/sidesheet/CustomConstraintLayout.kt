package com.example.sidesheet
import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible

class CustomConstraintLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        val viewRect = findViewById<View>(R.id.fcw)
        val rect = Rect()
        viewRect.getGlobalVisibleRect(rect)

        return if (viewRect.isVisible && (!rect.contains(ev.rawX.toInt(), ev.rawY.toInt()))) {
            Log.d("Touch Listener","outside")
            viewRect.visibility = View.GONE
            true
        } else {
            false
        }
    }
}

package com.whilerain.animationpractices.coordinatorlayout

import android.content.Context
import android.support.v4.view.ViewCompat
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewConfiguration
import android.widget.TextView


class MovableTextView @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
defStyle: Int = 0
) : AppCompatTextView(context, attrs, defStyle) {
    private var mSlop = ViewConfiguration.getTouchSlop()
    private var mLastX = 0f
    private var mLastY = 0f

    init {
        isClickable = true
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        // return super.onTouchEvent(event);
        val action = event.action
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                mLastX = event.x
                mLastY = event.y
            }
            MotionEvent.ACTION_MOVE -> {
                val deltax = (event.x - mLastX).toInt()
                val deltay = (event.y - mLastY).toInt()
                if (Math.abs(deltax) > mSlop || Math.abs(deltay) > mSlop) {
                    ViewCompat.offsetTopAndBottom(this, deltay)
                    ViewCompat.offsetLeftAndRight(this, deltax)
                    mLastX = event.x
                    mLastY = event.y
                }
            }
            MotionEvent.ACTION_UP -> {
                mLastX = event.x
                mLastY = event.y
            }
            else -> {
            }
        }
        return true
    }
}
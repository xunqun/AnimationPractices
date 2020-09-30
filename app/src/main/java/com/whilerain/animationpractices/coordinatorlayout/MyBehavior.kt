package com.whilerain.animationpractices.coordinatorlayout

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.CoordinatorLayout.*
import android.util.AttributeSet
import android.view.View


class MyBehavior constructor(context: Context?, attrs: AttributeSet?) : Behavior<View>() {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        return dependency is MovableTextView
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: View, dependency: View): Boolean {
        val dependBottom: Int = dependency.bottom

        child.y = (dependBottom + 50).toFloat()
        child.x = dependency.left.toFloat()

        return true
    }

}
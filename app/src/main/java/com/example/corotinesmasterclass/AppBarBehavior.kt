package com.example.corotinesmasterclass

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout

class AppBarBehavior(context: Context?, attrs: AttributeSet?) :

    AppBarLayout.Behavior(context, attrs) {


    override fun onLayoutChild(
        parent: CoordinatorLayout,
        abl: AppBarLayout,
        layoutDirection: Int
    ): Boolean {
        return super.onLayoutChild(parent, abl, layoutDirection)
    }

    override fun onStopNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        abl: AppBarLayout,
        target: View,
        type: Int
    ) {
        super.onStopNestedScroll(coordinatorLayout, abl, target, type)
    }

    override fun onNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        dxConsumed: Int,
        dyConsumed: Int,
        dxUnconsumed: Int,
        dyUnconsumed: Int,
        type: Int,
        consumed: IntArray
    ) {
        super.onNestedScroll(
            coordinatorLayout,
            child,
            target,
            dxConsumed,
            dyConsumed,
            dxUnconsumed,
            dyUnconsumed,
            type,
            consumed
        )
    }


    override fun onNestedPreFling(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY)
    }

    override fun onNestedFling(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View,
        velocityX: Float,
        velocityY: Float,
        consumed: Boolean
    ): Boolean {
        return super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, consumed)
    }

    override fun onTouchEvent(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        ev: MotionEvent
    ): Boolean {
        return super.onTouchEvent(parent, child, ev)
    }

    override fun onInterceptTouchEvent(
        parent: CoordinatorLayout,
        child: AppBarLayout,
        ev: MotionEvent
    ): Boolean {
        return false
    }

    override fun onStopNestedScroll(
        coordinatorLayout: CoordinatorLayout,
        child: AppBarLayout,
        target: View
    ) {
        super.onStopNestedScroll(coordinatorLayout, child, target)
    }

}
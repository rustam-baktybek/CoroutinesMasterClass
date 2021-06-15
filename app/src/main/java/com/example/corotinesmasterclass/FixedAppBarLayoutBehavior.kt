package com.example.corotinesmasterclass

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.appbar.AppBarLayout


class FixedAppBarLayoutBehavior: AppBarLayout.Behavior() {

    init {
        setDragCallback(object : DragCallback() {
            override fun canDrag(appBarLayout: AppBarLayout): Boolean = false
        })
    }

}
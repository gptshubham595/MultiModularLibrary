package com.toaster.library

import android.content.Context
import android.widget.Toast

class MathUtils constructor(context: Context) {
    private val context: Context = context
    fun add(a: Int, b: Int): Int {
        Toast.makeText(context, "Hello from AAR library context! ${a+b}", Toast.LENGTH_SHORT).show()
        return a + b
    }
}
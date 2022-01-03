package com.example.dynamictoast

import android.content.Context
import android.widget.Toast

object ShowToast {

    fun lLong(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun lShort(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }


}
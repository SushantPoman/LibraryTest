package com.example.librarytest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dynamictoast.ShowToast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lToastButton: Button = findViewById(R.id.longToast)
        val sToastButton: Button = findViewById(R.id.shortToast)

        lToastButton.setOnClickListener {
            ShowToast.lLong(this, "Long msg display")
        }

        sToastButton.setOnClickListener {
            ShowToast.lShort(this, "Short msg display")
        }

    }

}
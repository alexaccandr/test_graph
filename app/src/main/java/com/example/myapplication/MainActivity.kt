package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.module1.Module1Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model2 = Module1Utils.createModle2()
        val b = model2.myVar1

        val sas: Pair<Int, Int> = 2 to 2
    }
}
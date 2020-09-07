package com.mvvm.newsapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("This Is our second commit")println("Change 3")
        println("Another printline statemen4")
        println("This line will be merged ")

    }
}
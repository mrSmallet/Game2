package com.example.sergey.game2

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlin.Unit

class MainActivity : AppCompatActivity() {


    val id_mother: Int = R.drawable.mother_icon
    val id_brother: Int = R.drawable.brother_icon
    val id_aunt: Int = R.drawable.aunt_icon


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val mother: com.example.sergey.game2.Unit = Unit("mother",30, id_mother)
        val aunt: com.example.sergey.game2.Unit = Unit("aunt",29, id_aunt)
        val brother: com.example.sergey.game2.Unit = Unit("brother",16, id_brother)

    }
}

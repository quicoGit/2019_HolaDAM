package com.plumbaria.e_2_1_holadam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var nuevoTexto = TextView(this)
        nuevoTexto.setText("Hola DAM desde Kotlin")
        setContentView(nuevoTexto)
    }
}
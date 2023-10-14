package com.example.clase3interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val juan = Adulto(nombre = "Juan", edad = 35, profesion = "Jardinero")
        val esteban = Menor(nombre = "Esteban", edad = 35, nivelEducativo = "actor")
    }
}
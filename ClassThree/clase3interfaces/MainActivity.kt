package com.example.clase3interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*      val juan = Adulto(nombre = "Juan", edad = 35, profesion = "Jardinero")
        val esteban = Menor(nombre = "Esteban", edad = 35, nivelEducativo = "actor")*/

        val juan = Adulto()
        juan.nombre = "Juan"
        juan.edad = 45
        juan.profesion = "Jardinero"

        println(juan.correr())
        println(juan.trabajar())
        println(juan.estudiar())

        val esteban = Menor()
        esteban.nombre = "Esteban"
        esteban.edad = 14
        esteban.nivelEducativo = "2do año"

        println(esteban.correr())
        println(esteban.trabajar())
        println(esteban.estudiar())
    }
}
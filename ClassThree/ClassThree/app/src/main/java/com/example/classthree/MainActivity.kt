package com.example.classthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var prueba = ClasePrueba()

        var name = prueba.getMiNombre()
        Log.i( "infoz", name )
        prueba.setMiNombre("nicolas")
        name = prueba.getMiNombre()
        Log.i( "infoz", prueba.getMiNombre() )
        if (prueba.checkEsMayorDe(edad = 13)){
            Log.i("infoz", "onCreate: Es mayur de edad")
        }else {
            Log.i("infoz", "onCreate: Es menor de edad")
        }

    }
}

//ver la funcon imprimir que no recive nada y no devuelve nada
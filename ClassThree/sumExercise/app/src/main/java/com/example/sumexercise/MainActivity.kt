package com.example.sumexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numeroUno = 10
        val numeroDos = 40
        val suma = ClaseSuma()
        val resultado = suma.sumarDosNumeros(numeroUno , numeroDos)

        when (resultado){
            in 49..Int.MAX_VALUE -> Log.i("informacion", "onCreate: EL numero es menor a 50")
            50 -> Log.i("informacion", "onCreate: EL numero es igual a 50")
            else -> Log.i("informacion", "onCreate: EL numero es igual a 50")
        }

    //INTENTO DE RESOLUCION EN CLASE
/*        if (resultado > 50 ){
            Log.i("infoz", "El numero es mayor a 50")
        }
        else if (resultado == 50){
            Log.i("infoz", "El numero es menor a 50")
        }

        else{
            Log.i("Informacion", "El numero es menor a 50")
        }*/
    }
}
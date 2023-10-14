package com.example.clase3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        val sumar = ClaseSuma() //Se crea la variable sumar y una nueva instacia

        val esPar = sumar.checkResulatadoPar(3,5)

        if (!esPar) Toast.makeText(this, "Resultado impar", Toast.LENGTH_SHORT).show() //Encierra el mensaje en una variable en un toast, este es resultado de un condicional
        else Toast.makeText(this, "Resultado Par", Toast.LENGTH_SHORT).show()*/

        val numeros = Numeros(3,5)

        //Se crea una instancia de la clase  y se pasan los valores
        val operaciones = Operaciones()

        val result = operaciones.sumar(numeros)
        Toast.makeText(this, result.toString(),Toast.LENGTH_LONG).show()


    }
}
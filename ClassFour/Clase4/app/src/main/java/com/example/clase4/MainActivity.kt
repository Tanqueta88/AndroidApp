package com.example.clase4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var tvNombre : TextView
    private lateinit var tvEdad : TextView
    private lateinit var tvEstudio : TextView
    private lateinit var tvAccion : TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvNombre = findViewById(R.id.textViewNombre)
        tvEdad = findViewById(R.id.textViewEdad)
        tvEstudio = findViewById(R.id.textViewEstudio)
        tvAccion = findViewById(R.id.textViewAccion)
        button = findViewById(R.id.button)

        val persona1 = Adulto("Sofia", 26, "Estudiante", Adulto.EstadoCivil.SOLTERO)
        //Toast.makeText(this, persona1.obtenerNombre(), Toast.LENGTH_LONG).show()
        tvNombre.text = adulto.get
    }
}
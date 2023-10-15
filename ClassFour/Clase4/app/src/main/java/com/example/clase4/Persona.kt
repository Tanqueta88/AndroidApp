package com.example.clase4

abstract class Persona (
    private val nombre: String,
    private val edad: Int
)
{
    fun obtenerNombre(): String {
        //return this.nombre
        return "Mi nombre es: ${this.nombre}"
    }

    fun obtenerEdad(): String{
        return "Mi edad es:   ${this.edad}"
    }

    fun obtenerProfesion(): String{
        return "Mi profesion es:   ${this.nombre}"
    }
}
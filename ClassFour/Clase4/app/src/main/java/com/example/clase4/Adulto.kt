package com.example.clase4

class Adulto (
    private val nombre: String,
    private val edad: Int,
    private val profesion: String,
    private val estadoCivil: EstadoCivil
): Persona(nombre, edad)
//La clase adulto va a heredar de persona
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

    enum class EstadoCivil{
        CASADO,
        SOLTERO,
        DIVORCIADO,
        CONYGE,
        VIUDO
    }
}
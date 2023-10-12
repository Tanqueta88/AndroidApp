package com.example.classthree

class ClasePrueba {
    private var miNombre = "Carlitos"
    //private var edad = 25


    fun getMiNombre(): String { //Devuelve un string no recibe nada
        return miNombre
    }

    fun setMiNombre(nombre: String) { //Recibe un parametro y no devuelve nada
        miNombre = nombre
    }

    fun checkEsMayorDe(edad : Int) : Boolean {//Recibe pareametros y devuelve un valor
        return edad > 17
    }

    companion object {
        const val apellido = "Rodrigez"
    }
}

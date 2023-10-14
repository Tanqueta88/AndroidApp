package com.example.clase3interfaces

class Menor : Acciones {
    var nombre: String = ""
    var edad: Int = 0
    var nivelEducativo: String = ""
    override fun correr(): String {
        return nombre + " esta corriendo"
    }

    override fun estudiar(): String {
        return nombre + " esta estudiando en " + nivelEducativo
    }

    override fun trabajar(): String {
        return nombre + " no esta trabajando porque tiene " + edad + " años"
    }
}
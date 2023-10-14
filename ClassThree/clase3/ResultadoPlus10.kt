package com.example.clase3

class ResultadoPlus10 : OperacionesI {
    override fun sumar(numeros: Numeros): Int {
        return (numeros.numero1 + numeros.numero2) + 10
    }

    override fun restar(numeros: Numeros): Int {
        return (numeros.numero1 - numeros.numero2) + 10
    }

    override fun multiplicar(numeros: Numeros): Int {
        return (numeros.numero1 * numeros.numero2) + 10
    }

    override fun dividir(numeros: Numeros): Int {
        return (numeros.numero1 / numeros.numero2) + 10
    }
}
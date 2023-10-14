package com.example.clase3;

public class Resultados: OperacionesI {
    override fun sumar(numeros: Numeros): Int {
        return numeros.numero1 + numeros.numero1
    }

    override fun restar(numeros: Numeros): Int {
        return numeros.numero1 - numeros.numero1
    }

    override fun multiplicar(numeros: Numeros): Int {
        return numeros.numero1 * numeros.numero1
    }

    override fun dividir(numeros: Numeros): Int {
        return numeros.numero1 / numeros.numero1
    }
}

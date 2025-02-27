package Nivelamento.exercicios

import kotlin.math.sqrt


fun main() {
//Objetivo: fazer com a menor quantidade de variaveis possivel
//    println(fibonacciPrimeiraMetodo())
//    println(fibonacciSegundaMetodo())
    println(fibonacciTerceiroMetodo(10))

}

fun fibonacciTerceiroMetodo(posicao: Int): Int {
    //0 variaveis
    when {
        posicao <= 0 -> return 0;
        posicao == 1 -> return 1;
        else -> return fibonacciTerceiroMetodo(posicao - 1) + fibonacciTerceiroMetodo(posicao - 2);
    }

}

fun fibonacciSegundaMetodo() {
    //1 variaveis
    var n2 = 0.0
    do {
        println("Digite qual casa de Fibonacci você deseja saber o valor (da terceira casa+)")
        n2 = readLine()?.toDoubleOrNull() ?: 0.0
        n2 = (Math.pow((1 + sqrt(5.0)) / 2, n2) - Math.pow((1 - (1 + sqrt(5.0)) / 2), n2)) / sqrt(5.0)
    } while (n2.toInt() < 3)
    println(n2.toInt())
}

fun fibonacciPrimeiraMetodo() {
    //4 variaveis
    var n2 = 2
    var n1 = 1
    var aux = 0
    var numDesejado = 0
    do {
        println("Digite qual casa de Fibonacci você deseja saber o valor (da terceira casa+)")
        numDesejado = readLine()?.toIntOrNull() ?: 0
    } while (numDesejado < 3)
    for (i in 4..numDesejado) {
        aux = n2
        n2 = n2 + n1
        n1 = aux
    }
    println(n2)
}
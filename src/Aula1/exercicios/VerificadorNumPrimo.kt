package Aula1.exercicios

import java.util.Scanner

fun main() {
    print("Digite um numero")
    val input = readLine()
    val num = input?.toIntOrNull()
    if(num == null || num <= 0){
        println("Número inválido, número nulo ou menor que 1")
        return
    }
    var ehPrimo = true
    if (num <= 1) {
        ehPrimo = false
    } else {
        for (i in 2..(num - 1)) {
            if(num % i == 0){
                ehPrimo = false
                break;
            }
        }
    }
    when{
        ehPrimo -> print("$num é primo")
        else -> print("$num não é primo")
    }
}
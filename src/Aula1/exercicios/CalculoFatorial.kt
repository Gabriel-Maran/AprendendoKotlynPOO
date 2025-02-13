package Aula1.exercicios

import java.util.Scanner

fun main(){

    println("Digite um número para calcular o fatorial: ")
    val input = readLine()
    var numero = input?.toInt()
    if(numero == null || numero < 0){
        println("Número invalido")
        return
    }
    var fatorial = 1
    for (i in numero downTo 2) {
        fatorial *= i
    }

    println("O fatorial é: "+fatorial)
}
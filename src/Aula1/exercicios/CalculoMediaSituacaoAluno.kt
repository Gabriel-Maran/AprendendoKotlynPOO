package Aula1.exercicios

import java.util.Scanner

fun main() {
    var soma = 0.0
    val qtdNotas = 3

    for (i in 1..qtdNotas) {
        print("Digite a nota $i : ")
        val input = readLine()
        val nota = input?.toDoubleOrNull()

        if(nota != null){
            soma += nota
        }else{
            println("Entrada invalida. Digite um número válido")
        }
    }

    val media: Double = soma / qtdNotas
    print("Media: $media")

    when {
        (media >= 7) -> println("Aprovado!")
        (media >= 5) -> println("Recuperação")
        else -> println("Reprovado")
    }
}
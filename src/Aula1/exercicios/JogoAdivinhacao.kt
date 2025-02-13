package Aula1.exercicios

import java.util.*

fun main() {
    val random = Random()

    val numeroSecreto = random.nextInt(100) + 1
    var tentativa: Int?
    var tentativas = 0

    println("Tente adivinhar o número entre 1 e 100!")

    while (true) {
        println("Digite seu palpite:")
        val input = readLine()

        tentativa = input?.toIntOrNull()

        if (tentativa == null) {
            println("Por favor, digite um número válido")
            continue  // Retorna ao início do loop
        }

        tentativas++

        when {
            tentativa == numeroSecreto -> {
                println("Parabéns! Você acertou em $tentativas tentativas.")
                break
            }
            tentativa < numeroSecreto -> println("Tente um número maior.")
            else -> println("Tente um número menor.")
        }
        println()
    }
}

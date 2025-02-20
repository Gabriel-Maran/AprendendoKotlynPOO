package Aula2.exercicios

fun main() {
    var escolha = 0
    val escolhaRandom = (1..3).random()
    println(escolhaRandom)
    do {
        println("Pedra, papel, tesoura")
        println("Digita 1 para pedra, 2 para papel e 3 para tesoura")
        escolha = readLine()?.toIntOrNull() ?: 0
        println("Minha escolha: $escolhaRandom, sua escolha: $escolha")
    } while (escolha !in 1..3)
    when (escolha) {
        escolhaRandom -> println("Empate")
        1 -> when (escolhaRandom) {
            2 -> println("Você perdeu, minha escolha foi papel")
            3 -> println("Você ganhou, minha escolha foi tesoura")
        }
        2 -> when (escolhaRandom) {
            1 -> println("Você ganhou, minha escolha foi pedra")
            3 -> println("Você perdeu, minha escolha foi tesoura")
        }
        3 -> when (escolhaRandom) {
            1 -> println("Você perdeu, minha escolha foi pedra")
            2 -> println("Você ganhou, minha escolha foi papel")
        }
    }
}
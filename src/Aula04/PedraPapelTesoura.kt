package Aula04

import java.util.Random

val regex = Regex(pattern = "^[^1-3]$")
var vitUsuario = 0
var vitPc = 0
fun main() {
    println("Digite seu nickname:")
    var nicknameUsuario: String = readlnOrNull() ?: "player1"
    do {
        var escUsuario = ""
        do {
            println(" === PEDRA, PAPEL OU TESOURA ===")
            println("$nicknameUsuario faça sua escolha!")
            println("Digite 1 para jogar")
            println("Digite 2 para ver o placar")
            println("Digite 3 para sair")
            println("================================")
            escUsuario = readlnOrNull() ?: "0"
        } while (regex.containsMatchIn(escUsuario))
        when (escUsuario) {
            "1" -> jogar(nicknameUsuario)
            "2" -> placar(nicknameUsuario)
            "3" -> {
                println("Saindo..."); placar(nicknameUsuario)
            }
        }
    } while (escUsuario != "3")
}

fun placar(nicknameUsuario: String) {
    println("=======================================")
    println("Quantidade de vitorias de $nicknameUsuario: $vitUsuario")
    println("Quantidade de vitorias da máquina: $vitPc")
    println("=======================================")
}

fun jogar(nicknameUsuario: String) {
    var jogadaPC = (1..3).random()
    var jogadaUsuario = " "
    do {
        println("=====================")
        println("$nicknameUsuario escolha sua jogada!")
        println("Digite 1 para pedra")
        println("Digite 2 para papel")
        println("Digite 3 para tesoura")
        println("=====================")
        jogadaUsuario = readlnOrNull() ?: "0"
    } while (regex.containsMatchIn(jogadaUsuario))
    when (jogadaPC - jogadaUsuario.toInt()) {
        0 -> {
            println("Jogoda da máquina: $jogadaPC")
            println("Emapte");
        }

        in listOf(-1, 2) -> {
            println("Jogoda da máquina: $jogadaPC")
            println("Vitoria do $nicknameUsuario"); vitUsuario++
        }

        in listOf(1, -2) -> {
            println("Jogoda da máquina: $jogadaPC")
            println("Vitoria do Pc"); vitPc++
        }
    }

}
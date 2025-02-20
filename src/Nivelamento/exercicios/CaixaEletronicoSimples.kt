package Nivelamento.exercicios

fun main() {
    var saldo = 1000
    var opcao = 0
    while (true) {
        println("Saldo atual: R$ $saldo");
        println("1 - Sacar");
        println("2 - Depositar");
        println("3 - Sair");
        println("Escolha uma opção")
        var input = readLine()
        opcao = input?.toIntOrNull()
            ?: 0 // ?: 0 → Operador Elvis (?:), que define um valor padrão (0) caso a conversão falhe
        when (opcao) {
            1 -> {
                println("Digite o valor para sacar")
                input = readLine()
                var valor = input?.toIntOrNull() ?: 0
                when {
                    valor > saldo -> println("Saldo Insuficiente")
                    else -> {
                        saldo -= valor
                        println("Saque realizado!")
                    }
                }
            }

            2 -> {
                println("Digite o valor para depositar: ")
                input = readLine()
                var valor = input?.toIntOrNull() ?: 0
                saldo += valor
            }

            3 -> {
                println("Saindo...")
                break;
            }

            else -> println("Opção Inválida")
        }
    }
}
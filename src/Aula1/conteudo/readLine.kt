package Aula1.conteudo

fun main() {
    fun lerString() {
//       1. Ler uma String:
        val nome: String? = readLine()
//      - Se o usuário digitar algo, será armazenado em nome. Se apenas pressionar Enter, nome será null.
    }

    fun converterInteiro() {
//      2. Converter para Inteiro (Int)
        val numEx1: Int? = readLine()?.toIntOrNull()
//      ou
        val input = readLine()
        val numEx2 = input?.toIntOrNull()
//      O toIntOrNull() tenta converter a entrada para Int e retorna null se não for um número válido.
    }

    fun operadorElvis() {
//      Define um valor padrão caso o valor seja null
        var opcao = readLine()?.toIntOrNull() ?: 0
//      readLine()?.toIntOrNull() tenta converter a entrada em Int, mas pode ser null.
//      ?: 0 significa que, se for null, opcao recebe 0.
//      Exemplo prático: Entrada: "10" → opcao = 10
//      Entrada: "abc" → opcao = 0 (porque toIntOrNull() retorna null)
    }

    fun operadorChamadaSegura() {
        val nome: String? = readLine()
        println(nome?.length)
//      Se nome for null, não dá erro, apenas imprime "null"
//      Se nome for null, nome?.length retorna null sem erro.
    }

    fun operadorForcaNaoNulo() {
        val numero: Int = readLine()!!.toInt()
//      Se readLine() for null, o programa crasha com erro de NullPointerException.
//      *Use com cuidado! Só use !! se tiver certeza que o valor nunca será null.
    }

    fun let() {
        readLine()?.let {
            val numero = it.toIntOrNull() ?: 0
            println("Número: $numero")
        }
//      O bloco só roda se readLine() não for null.
    }

    fun also() {
        val idade = readLine()?.toIntOrNull()?.also { println("Idade digitada: $it") } ?: 0
//      also imprime a idade, mas o valor principal segue o fluxo. Ele basicamente faz algo a mais
    }

    fun run() {
//      Executa um bloco e retorna o último valor
        val resultado = run {
            val num = readLine()?.toIntOrNull() ?: 0
            num * 2
        }
        println(resultado) // Retorna o dobro do número digitado
//      O run evita criar uma variável temporária para num, tornando o código mais limpo.
    }
}
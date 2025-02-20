package Nivelamento.exercicios

fun main(){
    val numRandom1 = (1..100).random()
    val numRandom2 = (1..100).random()
    println(numRandom1)
    println(numRandom2)
    println("Jogador 1, por favor, informe seu nome: ")
    val player1 = readLine().toString()
    println("Jogador 2, por favor, informe seu nome: ")
    val player2 = readLine().toString()
    val player1Tentativas = advNum(player1, numRandom1)
    val player2Tentativas = advNum(player2, numRandom2)
    when{
        player1Tentativas<player2Tentativas -> println("\uD83C\uDFC6 $player1 ganhou, fazendo $player1Tentativas tentavias, enquanto o $player2 fez em $player2Tentativas tentativas")
        player1Tentativas>player2Tentativas -> println("\uD83C\uDFC6 $player2 ganhou, fazendo $player2Tentativas tentavias, enquanto o $player1 fez em $player1Tentativas tentativas")
        else-> println("\uD83E\uDD1D $player1 e $player2 tiveram a mesma quantidade de acertos, sendo $player1Tentativas")
    }
}

fun advNum(nome: String, num:Int):Int{
    var tentativa:Int = 0
    var totalTentativa:Int = 0
    do{
        println("$nome, tente acertar o número secreto: ")
        tentativa = readLine()?.toIntOrNull() ?: 0
        totalTentativa++
        when{
            tentativa>num -> println("\uD83D\uDD3D, o número secreto é menor que $tentativa")
            tentativa<num -> println("\uD83D\uDD3C, o número secreto é maior que $tentativa")
        }
    }while(tentativa != num)
    println("$nome, parabens! Você acertou o número secreto \uD83C\uDF89")
    return totalTentativa
}
package RevisãoProva01

import kotlin.random.Random

val regexInteiros = Regex("^\\d+$")
var numInt1 = 0
var numInt2 = 0
var numInt3 = 0
var validacao = true
//Sendo feito....
fun main(){

}

fun somaNumsReais() {
    var listaNums = mutableListOf<Int>()
    do {
        println("Digite '0' para sair")
        println("Digite um número")
        numInt1 = readlnOrNull()?.toInt() ?: 0
        if (!numInt1.toString().matches(regexInteiros)) {
            println("Erro, digite um número inteiro")
        }
        listaNums.add(numInt1)
    }while(numInt1 != 0)
    numInt1 = listaNums.sum()
    println("A soma dos número é $numInt1")
}

fun gerarNumIntervaloXY(){
    do{
        println("Digite o primeiro número")
        numInt1 = readlnOrNull()?.toInt() ?: 0
        println("Digite o segundo número")
        numInt2 = readlnOrNull()?.toInt() ?: 0
        if(numInt1<numInt2){
            numInt3 = (numInt1..numInt2).random()
        }else{
            numInt3 = (numInt2..numInt1).random()
        }
        println("O número aleatorio gerado entre os dois número é: $numInt3")
        println("Deseja testar com outros dois números? Digite 'true' se deseja")
        validacao = readlnOrNull()?.toBoolean() ?: false
    }while(validacao)
}
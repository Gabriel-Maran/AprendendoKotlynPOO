package RevisãoProva01

val regexInteirosPosi = Regex("^\\d+$")
val regexInteirosPositENeg = Regex("^[-+]?\\d+$")
val regexReais = Regex("^[-+]?((\\d+\\.\\d*)|(\\.\\d+)|(\\d+))([eE][-+]?\\d+)?\$")
var listPositivos = mutableListOf<Int>();
var listNegativos = mutableListOf<Int>();
var numInt1 = 0
var numInt2 = 0
var numInt3 = 0
var validacao = true

//Sendo feito....
fun main() {
    do {
        do{
            println("==== Manipulação Numerica ====")
            println("Digite 1 para somar x números reais")
            println("Digite 2 para gerar um num em um intervalo x-y")
            println("Digite 3 para add numeros positivos e negativos a listas especificas e ordenadas")
            println("Digite 4 para sair")
            numInt1 = readlnOrNull()?.toIntOrNull() ?: 0
        }while(numInt1 !in 1..4)
        when (numInt1) {
            1 -> somaNumsReais()
            2 -> gerarNumIntervaloXY()
            3 -> numPosiENeg()
            4 -> println("Saindo....")
        }
    } while (numInt1 != 4)
}

fun somaNumsReais() {
    var listaNums = mutableListOf<Int>()
    do {
        println("Digite '0' para sair")
        println("Digite um número")
        numInt1 = readlnOrNull()?.toIntOrNull() ?: 0
        if (!numInt1.toString().matches(regexReais)) {
            println("Erro, digite um número inteiro")
        }
        listaNums.add(numInt1)
    } while (numInt1 != 0)
    numInt1 = listaNums.sum()
    println("A soma dos número é $numInt1")
}

fun gerarNumIntervaloXY() {
    do {
        println("Digite o primeiro número")
        numInt1 = readlnOrNull()?.toIntOrNull() ?: 0
        println("Digite o segundo número")
        numInt2 = readlnOrNull()?.toIntOrNull() ?: 0
        if (numInt1 < numInt2) {
            numInt3 = (numInt1..numInt2).random()
        } else {
            numInt3 = (numInt2..numInt1).random()
        }
        println("O número aleatorio gerado entre os dois número é: $numInt3")
        println("Deseja testar com outros dois números? Digite 'true' se deseja")
        validacao = readlnOrNull()?.toBooleanStrictOrNull() ?: false
    } while (validacao)
}

fun numPosiENeg() {
    do {
        do {
            println("Digite um número positivo ou negativo: ")
            numInt1 = readlnOrNull()?.toIntOrNull() ?: 0
            if (!numInt1.toString().matches(regexInteirosPositENeg) || numInt1 == 0) {
                println("Erro! Digite um número positivo ou negativo")
            }
        } while (!numInt1.toString().matches(regexInteirosPositENeg))
        if (numInt1 > 0) {
            listPositivos.add(numInt1)
        } else if (numInt1 < 0) {
            listNegativos.add(numInt1)
        }
        println("Digite '1' para realizar a inserção de outro número")
        numInt1 = readlnOrNull()?.toIntOrNull() ?: 0
    } while (numInt1 == 1)
    listPositivos.sort()
    listNegativos.sort()
    println("Lista positivos: $listPositivos")
    println("Lista negativos: $listNegativos")
}

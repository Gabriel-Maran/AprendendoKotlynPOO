package Aula1.exercicios

fun main() {
    contadorDeVogais()
}

fun calculadoraSimples() {
    var operacao = 0;
    var resultado: Double = 0.0
    var num1: Int = 0
    var num2: Int = 0
    while (operacao > 4 || operacao < 1) {
        println("Escolha: 1-Soma, 2-Subtraçãp, 3-Divisão, 4-Multiplicação: ")
        operacao = readLine()?.toIntOrNull() ?: 0
    }
    println("Informe o primeiro número: ")
    num1 = readLine()?.toIntOrNull() ?: 0
    do {
        println("Informe o segundo número: ")
        num2 = readLine()?.toIntOrNull() ?: 0
        if (operacao == 3 && num2 == 0) {
            println("Operação inválida, divisão por zero, tente novamente")
        }
    } while (operacao == 3 && num2 == 0)
    when (operacao) {
        1 -> resultado = (num1 + num2).toDouble()
        2 -> resultado = (num1 - num2).toDouble()
        3 -> resultado = (num1 / num2).toDouble()
        4 -> resultado = (num1 * num2).toDouble()
    }
    println(resultado)
}

fun verificadorPalindromo() {
    var palavra: String = ""
    var aux: String = ""
    println("Digite um palavra ou frase para verificar se é um palíndromo")
    palavra = readLine().toString().lowercase()
        .replace(" ", "") //replace vai retirar os valores antigos e substituir por um novo
    aux = palavra.reversed().lowercase()
    println("Palavra: $palavra")
    println("Aux: $aux")
    when {
        palavra.equals(aux) -> println("É um palindromo")
        else -> println("Não é um palindromo")
    }
}

fun listaDeCompras() {
    var auxString: String = ""
    var indexRemocao: Int = 0
    var listaDeCompras = mutableListOf<String>()
    while (!(auxString.trim().equals("1"))) {
        println("Digite 1 para sair, 2 para remover um item e 3 para verificar a lista")
        println("Digite item por item que deseja adicionar a lista: ")
        auxString = readLine().toString()
        when {
            auxString.trim().equals("1") -> println("Saindo do campo de adição de itens na lista")
            auxString.trim().equals("2") -> {
                println("Lista: $listaDeCompras")
                println("Qual item deseja remover?(Digite 0 para voltar)")
                println("Digite 1 para o primeiro, 2 para o segundo....")
                indexRemocao = readLine()?.toIntOrNull() ?: 0
                indexRemocao -= 1
                if (indexRemocao >= 0) {
                    listaDeCompras.removeAt(indexRemocao)
                }
            }

            auxString.trim().equals("3") -> println("Lista: $listaDeCompras")
            else -> listaDeCompras.add(auxString)
        }
    }
    println("Lista: $listaDeCompras")
}

fun conversorTemp() {
    var temperatura = 0.0
    var celciusOuF = 0
    while (!(celciusOuF == 1 || celciusOuF == 2)) {
        println("Digte '1' caso queira saber de Celsius para Fahrenheit e '2' de Fahrenheit para Celsius ")
        celciusOuF = readLine()?.toIntOrNull() ?: 0
    }
    println("Digite a temperatura que deseja converter: ")
    temperatura = readLine()?.toDoubleOrNull() ?: 0.0
    when (celciusOuF) {
        1 -> {
            temperatura = (temperatura * (9.0 / 5.0)) + 32
            println("A temperatura de Fahrenheit para Celsius é $temperatura")
        }

        2 -> {
            temperatura = (5.0 / 9.0) * (temperatura - 32)
            println("A temperatura de Fahrenheit para Celsius é $temperatura")
        }
    }
}

fun contadorDeVogais(){
    println("Digite uma palavra ou frase que deseja saber a quantidade de vogais")
    val inputTexto = readLine().toString()
    val vogais = setOf('a', 'e', 'i', 'o', 'u')
    var contador = 0
    for(c:Char in inputTexto.lowercase()){
        if (c in vogais) {
            contador++
        }
    }
    println("Contador de vogais: $contador")
}

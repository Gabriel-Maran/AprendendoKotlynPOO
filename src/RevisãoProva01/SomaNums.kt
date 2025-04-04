package RevisãoProva01

fun main() {
    var num1 = 0.0
    var num2 = 0.0
    do {
        val regex = Regex(pattern = "^\\d+(\\.\\d+)?$")
        println("Digite o primeiro número")
        num1 = readlnOrNull()?.toDouble() ?: 0.0
        println("Digite o segundo número")
        num2 = readlnOrNull()?.toDouble() ?: 0.0

    } while (!(num1.toString().matches(regex) && num2.toString().matches(regex)))
    var soma = num1 + num2
    println("A soma dos números é $soma")
}
package RevisãoProva01


fun main() {
    var texto = ""
    var palavra = ""
    var i = 0
    var count = 0
    println("Digite o texto que deseja fazer a busca: ")
    texto = readlnOrNull().toString()
    println("Digite a palavra que deseja busca: ")
    palavra = readlnOrNull().toString()
    while ((i + palavra.length) <= texto.length) {
        var substring = texto.substring(i, i + palavra.length)
        if (substring == palavra) {
            count++
        }
        i++
    }
    println("No texto, a $palavra aparece $count vezes")
}

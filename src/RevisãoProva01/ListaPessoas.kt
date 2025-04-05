package RevisãoProva01

val listaPessoas = mutableListOf<String>()
val regex = Regex("^[A-Za-z]+$")

fun main() {
    var aux = " "
    do {
        do {
            println("Digite 'sair' para sair, digite 'listar' para listar")
            println("Digite o nome de uma pessoa")
            aux = readlnOrNull() ?: "1"
            if (!aux.matches(regex)) {
                println("Erro, digite apenas letras")
            }
        } while (!aux.matches(regex))
        if(aux.uppercase() == "LISTAR"){
            listarPessoas()
        }
            listaPessoas.add(aux)
    } while (aux.uppercase() != "SAIR")
}

fun listarPessoas(){
    println("=== Lista de pessoas ===")
    listaPessoas.sort()
    println(listaPessoas)
    println("========================")
}
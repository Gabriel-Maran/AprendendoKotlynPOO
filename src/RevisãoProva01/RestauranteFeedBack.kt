package RevisãoProva01

class Restaurante(nome: String, endereco: String, especialidade: String) {
    var nome: String = nome
        private set
    var endereco: String = endereco
        private set
    var especialidade: String = especialidade
        private set
    var nota: Notas = Notas()
        private set

    override fun toString(): String {
        return "Restaurante(nome='$nome', endereco='$endereco', especialidade='$especialidade', nota=${nota})"
    }



}

class Notas() {
    val notas = mutableListOf<Int>()
    fun add(nota: Int) {
        if (nota < 0 || nota > 10) {
            println("Erro, a nota inserida é inválida!")
            return
        }
        notas.add(nota)
    }

    override fun toString(): String {
        if (notas.size > 0) {
            return notaAvarage()
        }
        return "sem notas"
    }

    fun notaAvarage(): String {
        return "${notas.average()}"
    }


}

class Cliente(nome: String) {
    var nome: String = nome
        private set
    fun avaliacaoRestaurante(restaurante:Restaurante, nota: Int){
        if(nota < 0 || nota > 10) {
            println("Erro, nota inserida é inválida")
            return
        }
        restaurante.nota.add(nota)
    }
}

fun main() {
    val clientes = List(20) { Cliente("Cliente ${it + 1}") }
    val restaurante1 = Restaurante(
        nome = "Pizzaria 1",
        endereco = "Rua, 123",
        especialidade = "Pizza1"
    )
    val restaurante2 = Restaurante(
        nome = "Pizzaria 2",
        endereco = "Rua, 456",
        especialidade = "Pizza2"
    )

    clientes.forEach { cliente ->
        val nota1 = (0..10).random() // Nota aleatória para o restaurante1
        val nota2 = (0..10).random() // Nota aleatória para o restaurante2
        cliente.avaliacaoRestaurante(restaurante1, nota1)
        cliente.avaliacaoRestaurante(restaurante2, nota2)
    }
    println(restaurante1)
    println(restaurante2)
}
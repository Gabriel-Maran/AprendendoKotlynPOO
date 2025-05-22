package ExerciciosMap

fun main() {
    val matematica = Materia("Matematica")
    matematica.addNota(5.2, "João")
    matematica.addNota(9.2, "Gabriel")
    matematica.addNota(8.2, "Cleiton")
    matematica.addNota(7.2, "Carlos")
    matematica.addNota(6.2, "IssoAi")
    matematica.addNota(6.2, "SeiLa")

    matematica.imprimirAprovados()
}

class Materia(val nome: String) {
    private val alunosNota: LinkedHashMap<Double, MutableList<String>> = LinkedHashMap()

    fun addNota(notaAluno: Double, nomeAluno: String) {
        if (alunosNota.containsKey(notaAluno)) {
            alunosNota[notaAluno]?.add(nomeAluno) ?: ""
            return
        }
        alunosNota[notaAluno] = mutableListOf(nomeAluno)
    }

    fun imprimirAprovados() {
        println("--------- Lista de aprovados: ---------")
        for (nota in alunosNota.keys) {
            if (nota >= 6) {
                println("${alunosNota[nota]} ${if (alunosNota[nota]?.size!! > 1) "foram" else "foi"} aprovado(s)! A nota é $nota")
            }
        }
        println("---------------------------------------")
    }

    fun imprimirReprovprovados() {
        println("--------- Lista de reprovados: ---------")
        for (nota in alunosNota.keys) {
            if (nota < 6) {
                println("${alunosNota[nota]} ${if (alunosNota[nota]?.size!! > 1) "foram" else "foi"} aprovado(s)! A nota é $nota")
            }
        }
        println("---------------------------------------")
    }

    override fun toString(): String {
        return "Matéria : ${this.nome} \n" +
                "Nomes e notas : ${this.alunosNota}"
    }
}
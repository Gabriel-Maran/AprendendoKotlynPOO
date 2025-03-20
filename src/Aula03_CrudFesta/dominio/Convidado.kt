package Aula03_CrudFesta.dominio

class Convidado {
    var nome: String = ""
    var presente: String = ""
    var alimentar: String = ""
    var presenca: Boolean = false

    override fun toString(): String {
        return "(nome='$nome', presente='$presente', alimentar='$alimentar', presenca=$presenca)"
    }

}
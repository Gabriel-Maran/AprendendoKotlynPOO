package Aula2.dominio

class Cachorro: Animal() {
    val truques:String = "senta, rola, late e dá a pata"
    override fun somAnimal(): String {
        return "Au au"
    }
}
package Aula2.dominio

//Herança: Permite que uma classe herede todos os atributos e metodos de uma outra classe
//Essa nossa classe é uma sub classe
class Gato : Animal() {
    val higiene: String = "Usa caixinha de areia"

    //Poliformismo: É a forma de reecrever o metodo
    override fun somAnimal(): String {
        return "Miau miau"
    }
}
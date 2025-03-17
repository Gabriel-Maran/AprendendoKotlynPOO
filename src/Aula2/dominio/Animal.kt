package Aula2.dominio
// A palavra open é usada para indicar que uma Classe pode ser herdadada

open class Animal {
    //Atributos
    var nome = ""

    //        get() = field //redundante no Kotlin
    var especie = ""
    var dieta = ""
    var habitat = ""
    //Encapsulamento: Forma de controle sobre os atributos, quem pode acessar ou não


    //Metodos
    open fun somAnimal(): String {
        return "Faz Barulho!"
    }

}
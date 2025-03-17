package Aula2.teste

import Aula2.dominio.Animal
import Aula2.dominio.Cachorro
import Aula2.dominio.Gato

fun main() {
    //Toda Classe começa com letra maiuscula e segue o padrao CamelCase
    //Exemplo: MinhaClasse

    //Os objetos começam com letra MINUSCULA
    //Exemplo: meuObjeto
    val gato: Gato = Gato()
    gato.nome = "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"
    val animal: Animal = gato

    println(gato.somAnimal())
    println(animal.somAnimal())
//    val animal:Animal = Animal()
//    animal.nome = "gato"
//    animal.habitat = "domestico"
//    animal.especie = "felino"
//    animal.dieta = "peixe"
//
//    /* Isso não é recomendado*/
//    val gato : Gato = animal as Gato
}
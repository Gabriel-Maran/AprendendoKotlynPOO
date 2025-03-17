package Aula2.teste

import Aula2.dominio.Animal
import Aula2.dominio.Cachorro
import Aula2.dominio.Gato

fun main(){
    val gato: Gato = Gato()
    gato.nome = "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"

    println(gato.somAnimal())

    val cachorro: Cachorro = Cachorro()
    cachorro.nome = "Cachorro"
    cachorro.habitat = "domestico"
    cachorro.especie = "canino"
    cachorro.dieta = "bacon"

    println(cachorro.somAnimal())

    val animal = Animal()
    println(animal.somAnimal())
}
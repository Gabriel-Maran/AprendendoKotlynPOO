package Aula01.teste

import Aula01.dominio.Pessoa

fun main() {
    pedidoInformacoes()
    //Formulario Nome, Idade, Peso, Altura
    //A aplicacao precisa calcular IMC
}

fun pedidoInformacoes() {
    val p: Pessoa = Pessoa();
    println("Digite seu nome: ")
    p.nome = readln()
    println("Digite sua idade: ")
    p.idade = readLine()?.toIntOrNull() ?: 0
    println("Digite seu peso: ")
    p.peso = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite sua altura: ")
    p.altura = readln().toDoubleOrNull() ?: 0.0
    var imc = String.format("%.2f", calculoIMC(p.peso, p.altura))
    println(p.nome+", o seu IMC é $imc")
}

fun calculoIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura);
}

//Atividade: Crie uma classe Animal
//Atributos: Nome Ciêntifico, Especie, Dieta, Habitat
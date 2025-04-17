package Aula04.estruturaDeDados.exercicios

import java.text.DecimalFormat
import java.util.*
import kotlin.random.Random

val df = DecimalFormat("#.##")

class Paciente(var nome: String, var idade: Int, var peso: Double, var altura: Double, var cpf: String) {
    override fun toString(): String {
        return "\n{ Nome: $nome; " +
                "idade: $idade; " +
                "peso(kg(: ${df.format(peso)}; " +
                "altura(m): ${df.format(altura)}; " +
                "CPF: $cpf} "
    }
}

fun main() {
    while (true) {
        val possiveisPaciente = addPaciente()
        println("!!Novos pacientes chegaram!!")
        while (possiveisPaciente.isNotEmpty()) {
            println("---- Lista de pacientes: --------")
            println(possiveisPaciente)
            println("---------------------------------")
            println("Medico vai começar o atendimento a ${possiveisPaciente.first.nome}")
            println("--------------------------")
            var pacienteAtual = possiveisPaciente.first
            val tempoParaAtender: Long = tempoAtendimento(pacienteAtual.peso, pacienteAtual.altura)
            println("O tempo para o atendimento é de : $tempoParaAtender")
            Thread.sleep(tempoParaAtender)
            possiveisPaciente.removeFirst()
        }
        println("Medico terminou o atendimento de todos os pacientes")
        Thread.sleep(3000)
    }
}

fun addPaciente(): LinkedList<Paciente> {
    val possiveisPaciente = LinkedList<Paciente>()
    var paciente1 = Paciente(
        "Joao",
        Random.nextInt(10, 100), Random.nextDouble(10.0, 200.0),
        Random.nextDouble(1.0, 2.2), "0123456789-01"
    )
    var paciente2 = Paciente(
        "Carlos",
        Random.nextInt(10, 100), Random.nextDouble(10.0, 200.0),
        Random.nextDouble(1.0, 2.2), "0123456789-02"
    )
    var paciente3 = Paciente(
        "Jorge",
        Random.nextInt(10, 100), Random.nextDouble(10.0, 200.0),
        Random.nextDouble(1.0, 2.2), "0123456789-03"
    )
    var paciente4 = Paciente(
        "Cleiton",
        Random.nextInt(10, 100), Random.nextDouble(10.0, 200.0),
        Random.nextDouble(1.0, 2.2), "0123456789-04"
    )
    possiveisPaciente.add(paciente1)
    possiveisPaciente.add(paciente2)
    possiveisPaciente.add(paciente3)
    possiveisPaciente.add(paciente4)
    var pacienteEsperando = LinkedList<Paciente>()
    for (i in 1..Random.nextInt(1, 4)) {
        pacienteEsperando.add(possiveisPaciente.random())
    }
    return pacienteEsperando
}

fun calcIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun tempoAtendimento(peso: Double, altura: Double): Long {
    val imc = calcIMC(peso, altura)
    return ((Random.nextInt(3000, 6000) * imc) / 7).toLong()
}
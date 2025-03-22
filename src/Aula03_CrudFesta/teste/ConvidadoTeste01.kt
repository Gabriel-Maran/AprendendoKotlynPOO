package Aula03_CrudFesta.teste

import Aula03_CrudFesta.dominio.Convidado

val listaConvidados = mutableListOf<Convidado>()
var convidado = Convidado()

fun main() {
    menuConvidados()

}

private fun menuConvidados() {
    do {
        println("--- MENU ---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("0- SAIR")
        val opcao: Int = readln().toIntOrNull() ?: -1
        when (opcao) {
            1 -> {
                println("Cadastrando....")
                cadastrar()
            }

            2 -> {
                println("Listando....")
                listar()
            }

            3 -> {
                println("Editando....")
                editar()
            }

            4 -> {
                println("Excluindo....")
                excluir()
            }

            0 -> println("Saindo")
        }

    } while (opcao != 0)
}

private fun cadastrar() {
    convidado = Convidado()
    println("Qual o seu nome? ")
    convidado.nome = readln()
    println("${convidado.nome}, qual presente você levará? ")
    convidado.presente = readln()
    println("${convidado.nome}, o que você não pode comer? ")
    convidado.alimentar = readln()
    println("${convidado.nome}, você irá na festa?(S/N) ")
    val presenca: Char = readlnOrNull()?.get(0) ?: 'N'
    convidado.presenca = presenca == 'S'
    listaConvidados.add(convidado)
}

private fun listar() {
    for ((i, convidado) in listaConvidados.withIndex()) {
        println("Convidado${i + 1}: $convidado")
    }
}

private fun editar() {
    //Sendo feito...
    val regex = Regex(pattern = "^[^1-4]$")
    listar()
    println("Qual usuário você deseja editar?(Ex:1, para o primeiro)")
    var escolhaUsuario: Int = readlnOrNull()?.toIntOrNull() ?: 0
    if (listaConvidados.size < escolhaUsuario || escolhaUsuario <= 0) {
        println("Escolha invalida")
        return
    } else if (listaConvidados.isEmpty()) {
        println("A lista está vazia")
        return
    }
    println("O que você deseja editar?\n1-nome\n2-presente\n3-restição alimentar\n4-presença")
    var aux = readlnOrNull()?.toString() ?: "0"
    val escolhaCampoEdicao: Int = aux.toIntOrNull() ?: 0
    if (regex.containsMatchIn(aux)) {
        println("Escolha invalida")
        return
    }
    escolhaUsuario -= 1
    when (escolhaCampoEdicao) {
        1 -> {
            println("Digite o novo nome: ")
            convidado = listaConvidados.get(escolhaUsuario)
            convidado.nome = readln()
        }

        2 -> {
            println("Digite o novo presente: ")
            convidado = listaConvidados.get(escolhaUsuario)
            convidado.presente = readln()
        }

        3 -> {
            println("Digite todas as Restrições alimentares: ")
            convidado = listaConvidados.get(escolhaUsuario)
            convidado.alimentar = readln()
        }

        4 -> {
            println("Digite o novo nome: ")
            convidado = listaConvidados.get(escolhaUsuario)
            val presenca: Char = readlnOrNull()?.get(0) ?: 'N'
            convidado.presenca = presenca == 'S'
        }
    }
}

private fun excluir() {
    listar()
    println("Qual usuário você deseja excluir?(Ex:1, para o primeiro)")
    var escolha: Int = readlnOrNull()?.toIntOrNull() ?: -1
    if (escolha < 1) {
        println("Escolha invalida")
        return
    }
    listaConvidados.removeAt((escolha - 1))
    println("Usuário excluido com sucesso")
}
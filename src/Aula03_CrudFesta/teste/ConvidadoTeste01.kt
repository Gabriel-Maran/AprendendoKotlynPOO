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
        println("5- BUSCAR")
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

            5 -> {
                println("Buscando....")
                buscar()
            }

            0 -> println("Saindo")
        }

    } while (opcao != 0)
}

private fun cadastrar() {
    val regex = Regex("^[A-Za-z]+\$")
    convidado = Convidado()
    do {
        println("Qual o seu nome? ")
        convidado.nome = readln()
    } while (!convidado.nome.matches(regex))
    println("${convidado.nome}, qual presente você levará? ")
    convidado.presente = readln()
    println("${convidado.nome}, o que você não pode comer? ")
    convidado.alimentar = readln()
    println("${convidado.nome}, você irá na festa?(S/N) ")
    val presenca: Char = readlnOrNull()?.get(0) ?: 'N'
    convidado.presenca = presenca.uppercaseChar() == 'S'
    listaConvidados.add(convidado)
}

private fun listar() {
    if (listaConvidados.isEmpty()) {
        println("Lista vazia")
        return
    }
    listaConvidados.forEach {
        println("Nome: ${it.nome}, Presente: ${it.presente}, Restrições alimentares: ${it.alimentar}, Presença: ${it.presenca}")
    }
}

private fun editar() {
    val regexLetras = Regex("^[A-Za-z]+\$")
    val regexUmQuatro = Regex(pattern = "^[1-4]$")
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
    val aux = readlnOrNull()?.toString() ?: "0"
    val escolhaCampoEdicao: Int = aux.toIntOrNull() ?: 0
    if (!regexUmQuatro.matches(aux)) {
        println("Escolha invalida")
        return
    }
    escolhaUsuario -= 1
    when (escolhaCampoEdicao) {
        1 -> {
            println("Digite o novo nome: ")
            convidado = listaConvidados.get(escolhaUsuario)
            do {
                convidado.nome = readln()
            } while (!convidado.nome.matches(regexLetras))
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
            println("Digite a presença: (S/N)")
            var presenca:Char = 'N'
            do{
                convidado = listaConvidados.get(escolhaUsuario)
                presenca = readlnOrNull()?.get(0)?.uppercaseChar() ?: 'N'
            }while (! (presenca == 'S' || presenca == 'N'))
            convidado.presenca = presenca.uppercaseChar() == 'S'
        }
    }
}

private fun excluir() {
    listar()
    if (listaConvidados.isNotEmpty()) {
        println("Qual usuário você deseja excluir?(Ex:1, para o primeiro)")
        val escolha: Int = readlnOrNull()?.toIntOrNull() ?: -1
        if (escolha < 1 || escolha > listaConvidados.size) {
            println("Escolha invalida")
            return
        }
        listaConvidados.removeAt((escolha - 1))
        println("Usuário excluido com sucesso")
    }
    return
}

private fun buscar() {
    var i = 0
    val regex = Regex("^[A-Za-z]+\$")
    var nomeBuscado = "-1"
    do {
        println("Digite o nome que você deseja buscar: ")
        nomeBuscado = readlnOrNull() ?: "-1"
        if(listaConvidados.isEmpty()) {
            println("Lista está vazia")
            println("Retornando....")
            return
        }
    } while (!nomeBuscado.matches(regex))
    listaConvidados.forEach { convidado ->
        if (convidado.nome.uppercase().contains(nomeBuscado.uppercase())) {
            println("Posição: $i; nome buscado: $nomeBuscado")
        }
        i++
    }

}
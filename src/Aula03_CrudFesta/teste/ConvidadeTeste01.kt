package Aula03_CrudFesta.teste

import Aula03_CrudFesta.dominio.Convidado

fun main() {
    menuConvidados()

}

val listaConvidados = mutableListOf<Convidado>()

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
    var convidado = Convidado()
    println("Qual o seu nome? ")
    convidado.nome = readln()
    println("${convidado.nome}, qual presente você levará? ")
    convidado.presente = readln()
    println("${convidado.nome}, o que você não pode comer? ")
    convidado.alimentar = readln()
    println("${convidado.nome}, você irá na festa?(S/N) ")
    val presenca: Char = readLine()?.get(0) ?: 'N'
    convidado.presenca = (presenca.uppercase() == "S")
    listaConvidados.add(convidado)
}

private fun listar() {
    for ((i, convidado) in listaConvidados.withIndex()){
        println("Convidado${i+1}: $convidado")
    }
}

private fun editar(){
    //Sendo feito...
//    listar()
//    println("Qual usuário você deseja editar?(Ex:1, para o primeiro)")
//    var escolhaUsuario:Int = readLine()?.toIntOrNull() ?: -1
//    if(escolhaUsuario<1){
//        println("Escolha invalida")
//        return
//    }
//    println("O que você deseja editar?\n1-nome\n2-presente\n3-restição alimentar\n4-presença")
//    var escolhaCampoEdicao = readln().toIntOrNull() ?: -1
//    if(escolhaCampoEdicao<1 || escolhaCampoEdicao>4){
//        println("Escolha invalida")
//        return
//    }
//    when(escolhaCampoEdicao){
//        1-> {
//            println("Digite o novo nome: ")
//            listaConvidados.get(escolhaUsuario).nome == readln()
//        }
//        2-> {
//            println("Digite o novo presente: ")
//            listaConvidados.get(escolhaUsuario).presente == readln()
//        }
//        3-> {
//            println("Digite as Restrições alimentares: ")
//            listaConvidados.get(escolhaUsuario).alimentar == readln()
//        }
//        4-> {
//            println("Digite o novo nome: ")
//            val presenca: Char = readLine()?.get(0) ?: 'N'
//            listaConvidados.get(escolhaUsuario).presenca == (presenca.uppercase() == "S")
//        }
//    }
}

private fun excluir(){
    listar()
    println("Qual usuário você deseja excluir?(Ex:1, para o primeiro)")
    var escolha:Int = readLine()?.toIntOrNull() ?: -1
    if(escolha<1){
        println("Escolha invalida")
        return
    }
    listaConvidados.removeAt((escolha - 1))
    println("Usuário excluido com sucesso")
}
package Aula04.estruturaDeDados.conteudo

import java.util.LinkedList

fun main(){
    //Criando fila
    val fila = LinkedList<String>()

    //Adicionando funcionario a fila
    fila.addLast("Gabriel")
    fila.addLast("João")
    fila.addLast("Maria")
    fila.addLast("Pedro")

    //Verifica o primeiro usuário da lista
    println(fila.peek())

    do{
        println("Removendo: ${fila.removeFirst()}")
        Thread.sleep(1000)
    }while(fila.isNotEmpty())
}
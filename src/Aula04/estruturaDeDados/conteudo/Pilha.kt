package Aula04.estruturaDeDados.conteudo

import java.util.LinkedList

fun main() {
    val pilha = LinkedList<String>()
    //Prateleira de produtos
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")

    //Acessar primeiro item da pilha(ultimo add)
    println(pilha.peek())

    //Ver tamanho da pilha
    println(pilha.size)

    pilha.push("Milho")

    //Retira o primeiro
    var esgotado = pilha.pop()
    println("O $esgotado está(ão) esgotado(s) da lista")

    if(pilha.isEmpty()){
        println("Não há produtos na lista de vendas")
    }else{
        println("Ainda há produtos na lista de vendas")
    }

    println("Na pilha ainda há: $pilha")
}
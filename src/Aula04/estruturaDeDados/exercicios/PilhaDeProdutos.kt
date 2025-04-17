package Aula04.estruturaDeDados.exercicios

import java.util.LinkedList
import kotlin.random.Random

//Na instrução está "minutos" mas fiz em segundos, para facilitar a correção


class Produto(var nome: String, var validade: Int, var quantidade: Int = 0) {
    override fun toString(): String {
        return "\n{ Nome: $nome; " +
                "Validade(seg): ${validade / 1000}; " +
                "Quantidade: $quantidade}"
    }
}

fun main() {
    while (true) {
        println("-------------------")
        println("Repondo estoque....")
        println("-------------------")
        val pilha = reporEstoque()
        do {
            val tempoDeSono = generateTimeToRemove(pilha.first.quantidade)
            println("--- Lista de itens: ---")
            println(pilha.toString())
            println("-----------------------")
            println("Removendo primeira coleção de itens...")
            println("Tempo para a remoção: ${tempoDeSono / 1000} segundos")
            Thread.sleep(tempoDeSono)
            println("Item ${pilha.first}, vencido? ${pilha.first.validade - tempoDeSono <= 0}.")
            pilha.removeFirst()
        } while (pilha.isNotEmpty())
    }
}

fun generateTimeToRemove(num: Int): Long {
    return Random.nextInt(1000, 3000).toLong() * num / 2
}

fun reporEstoque(): LinkedList<Produto> {
    var listaDeProdutos = LinkedList<Produto>()
    val tomate = Produto("tomate", Random.nextInt(6000, 20000), Random.nextInt(1, 10))
    val queijo = Produto("queijo", Random.nextInt(6000, 20000), Random.nextInt(1, 20))
    val ovo = Produto("ovo", Random.nextInt(6000, 20000), Random.nextInt(1, 20))
    val pao = Produto("pao", Random.nextInt(6000, 20000), Random.nextInt(1, 20))
    listaDeProdutos.push(tomate)
    listaDeProdutos.push(queijo)
    listaDeProdutos.push(ovo)
    listaDeProdutos.push(pao)

    return listaDeProdutos
}
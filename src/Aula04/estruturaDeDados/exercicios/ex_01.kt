package Aula04.estruturaDeDados.exercicios

import java.util.LinkedList
import kotlin.random.Random

class Produto(var nome: String, var validade: String, var quantidade: Int = 0) {
    override fun toString(): String {
        return "\n{ Nome: $nome;Validade: $validade; Quantidade: $quantidade}"
    }
}

fun main() {
    val pilha = LinkedList<Produto>()
    while (true) {
        val tomate = Produto("nome", "12/05/2026", Random.nextInt(1, 10))
        val queijo = Produto("nome", "12/05/2026", Random.nextInt(1, 20))
        val ovo = Produto("nome", "12/05/2026", Random.nextInt(1, 20))
        val pao = Produto("nome", "12/05/2026", Random.nextInt(1, 20))
        if (pilha.isEmpty()) {
            pilha.push(tomate)
            pilha.push(queijo)
            pilha.push(ovo)
            pilha.push(pao)
        }
        while (pilha.isNotEmpty()) {
            var itensRemovidos = Random.nextInt(1 ,10)
            println(pilha.toString())
            Thread.sleep(5000)
            if(pilha.first.quantidade == 0){
                pilha.removeFirst()
            }
            if(pilha.first.quantidade >= itensRemovidos){
                pilha.first.quantidade = pilha.first.quantidade - itensRemovidos
            }else{
                itensRemovidos = itensRemovidos - pilha.first.quantidade
                pilha.first.quantidade = 0
            }
        }

    }
}

package Nivelamento.exercicios

fun main() {

}

class ListCompras() {
    private var listCompras: MutableList<CompraItem> = mutableListOf<CompraItem>()

    fun listAdd(compra: CompraItem) {
        listCompras.add(compra)
    }

    fun listRemove(index: Int) {
        if (listCompras.isEmpty()) {
            println("Lista vazia")
            return
        } else if (listCompras.size < index || index <= 0) {
            println("Erro, index inválido")
            return
        }
        listCompras.removeAt((index -1))
    }

    fun printList(compra: CompraItem) {
        if (listCompras.isNotEmpty()) {
            listCompras.forEach { c ->
                print {
                    "Item: ${c.item.nomeItem}, Preço: ${c.item.precoItem}, Quantidade: ${c.quantidadeItem} "
                }
            }
            return
        }
        println("A lista está vezia")
    }

    fun verificadorItemNaLista(compra: CompraItem): Boolean {
        if (listCompras.isNotEmpty()) {
            return listCompras.any { it.item.nomeItem == compra.item.nomeItem }
        }
        return false
    }

    fun clearList() {
        while (listCompras.isNotEmpty()) {
            listCompras.removeFirst()
        }
        println("Agora a lista está vazia!")
    }
}

class CompraItem(var item: Item, var quantidadeItem: Int) {
    fun calcTotalItem(): Double {
        return this.item.precoItem * this.quantidadeItem
    }
}

class Item(var nomeItem: String, var precoItem: Double)
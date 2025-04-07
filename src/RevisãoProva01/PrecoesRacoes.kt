package RevisãoProva01

open class Racao(preco: Double, peso: Double, sabor: String) {
    var preco: Double = preco
        internal set
    var peso: Double = peso
        internal set
    var sabor: String = sabor
        internal set

    init {
        require(preco > 0) { "Preço deve ser maior que 0" }
        require(peso > 0) { "Peso deve ser maior que 0" }
    }

    open fun desconto() {
        preco -= preco * 0.1
    }

    override fun toString(): String {
        return "Racao(preco=$preco, peso=$peso, sabor='$sabor')"
    }

}

class GatoRacao(
    preco: Double, peso: Double, sabor: String,
    paraCastrado: Boolean, ricaEmFerro: Boolean
) : Racao(preco, peso, sabor) {
    private var paraCastrado: Boolean = paraCastrado
        private set
    private var ricaEmFerro: Boolean = paraCastrado
        private set

    override fun desconto() {
        if (paraCastrado) {
            preco -= preco * 0.15
            return
        }
        preco -= preco * 0.2
    }

    override fun toString(): String {
        return "Racao(preco=$preco, peso=$peso, sabor='$sabor'), (paraCastrado=$paraCastrado, ricaEmFerro=$ricaEmFerro)"
    }


}

class CaoRacao(
    preco: Double, peso: Double, sabor: String,
    fortalecimentoDePelo: Boolean, pedacosComCarne: Boolean
) : Racao(preco, peso, sabor) {
    var fortalecimentoDePelo: Boolean = fortalecimentoDePelo
        private set
    var pedacosComCarne: Boolean = pedacosComCarne
        private set

    override fun desconto() {
        if (pedacosComCarne) {
            preco -= preco * 0.05
            return
        }
        preco -= preco * 0.25
    }

    override fun toString(): String {
        return "Racao(preco=$preco, peso=$peso, sabor='$sabor'), sabor='$sabor'),(fortalecimentoDePelo=$fortalecimentoDePelo, pedacosComCarne=$pedacosComCarne)"
    }


}


fun main() {
    val racaoGato = GatoRacao(
        preco = 50.0,
        peso = 2.5,
        sabor = "Salmão",
        paraCastrado = true,
        ricaEmFerro = true
    )
    println(racaoGato.preco)
    racaoGato.desconto()
    println(racaoGato.preco)
    println(racaoGato.toString())
}
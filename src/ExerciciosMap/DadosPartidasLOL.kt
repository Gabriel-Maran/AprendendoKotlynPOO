package ExerciciosMap

fun main() {

}

class Equipe(val nome: String) {
    var informacoesEquipe: LinkedHashMap<String, LinkedHashMap<String, Double>> = linkedMapOf()

    fun addAllPlayerInfo(player: Player) {
        informacoesEquipe[player.nome] = player.informcoes
    }

    fun media() {//TODO
        println("A media de")
        //- Dano Total,
        //- Dano Médio,
        //- Dano Sofrido Médio.
        //- Distância Percorrida,
        //
        //- Número de Mortes (derrota),
        //- Número de Abatimento (inimigos mortos).
    }
}

class Player(val nome:String) {
    val informcoes: LinkedHashMap<String, Double> = linkedMapOf()
    fun addDanoTotal(danoTotal: Double) {
        informcoes["DanoTotal"] = danoTotal
    }

    fun addDanoMedio(danoMedio: Double) {
        informcoes["DanoMedio"] = danoMedio
    }

    fun addDanoSofrido(danoSofrido: Double) {
        informcoes["danoSofrido"] = danoSofrido
    }

    fun addNumMortes(numMortes: Double) {
        informcoes["numMortes"] = numMortes
    }

    fun addNumAbates(numAbates: Double) {
        informcoes["numAbates"] = numAbates
    }
}
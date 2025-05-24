package ExerciciosMap

import com.sun.management.GcInfo

fun main() {
    val player1 = Player("Gabriel");
    player1.addDanoSofrido(10.0);
    player1.addDanoMedio(100.0)
    player1.addDanoTotal(1059.9)
    player1.addNumMortes(10.0)
    player1.addNumAbates(19.0)
    val player2 = Player("Joao");
    player2.addDanoSofrido(12.0);
    player2.addDanoMedio(102.0)
    player2.addDanoTotal(1061.9)
    player2.addNumMortes(12.0)
    player2.addNumAbates(21.0)

    val equipe: Equipe = Equipe("EquipeFoda")
    equipe.addAllPlayerInfo(player1)
    equipe.addAllPlayerInfo(player2)

    equipe.average()
}

class Equipe(val nome: String) {
    var informacoesEquipe: LinkedHashMap<String, LinkedHashMap<String, Double>> = linkedMapOf()

    fun addAllPlayerInfo(player: Player) {
        informacoesEquipe[player.nome] = player.informcoes
    }

    fun average() {
        val nomes: MutableSet<String> = informacoesEquipe.keys

        println("A media de: ")
        println("Dano Total: ${getAverageOfEachInfomation(nomes, "DanoTotal")}")
        println("Dano Médio: ${getAverageOfEachInfomation(nomes, "DanoMedio")}")
        println("Dano Sofrido Médio: ${getAverageOfEachInfomation(nomes, "danoSofrido")}")
        println("Distância Percorrida: ${getAverageOfEachInfomation(nomes, "numMortes")}")
        println("Dano Total: ${getAverageOfEachInfomation(nomes, "numAbates")}")
    }

    fun getAverageOfEachInfomation(keys: MutableSet<String>, codToAcessPlayerInfo: String): Double {
        var total: Double = 0.0;
        for (key in keys) {
            total = (informacoesEquipe.get(key)?.get(codToAcessPlayerInfo) ?: 0.0) + total
        }
        return total / keys.size
    }

}

class Player(val nome: String) {
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
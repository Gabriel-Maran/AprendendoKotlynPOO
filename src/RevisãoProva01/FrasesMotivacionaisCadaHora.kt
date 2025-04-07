package RevisãoProva01

import java.util.*
val frasesMotivacionais = listOf(
    "Acredite em você e tudo será possível! ✨",
    "Cada passo, por menor que seja, te aproxima do seu objetivo. 🚶♂️",
    "O sucesso é a soma de pequenos esforços repetidos dia após dia. 💪",
    "Você é mais forte do que imagina. Não desista! 🔥",
    "Grandes coisas nunca vêm de zonas de conforto. 🌟",
    "Hoje é o dia para começar algo novo! 🌱"
)

fun main() {
    while(true) {
        val calendar = Calendar.getInstance()
        val min = 60 - calendar.get(Calendar.MINUTE)
        val seg = 60 - calendar.get(Calendar.SECOND)
        val tempoEspera = (min*60 + seg)*1000L//Se nn colocar o "L" no fim, não aceita, pois o Thread.sleep so aceita Long
        Thread.sleep(tempoEspera)
        println(frasesMotivacionais.random())
    }
}
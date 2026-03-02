import java.util.Optional
import kotlin.collections.ArrayDeque

//EM DESENVOLVIMENTO
// TODO(
//  - Reconhecer '(' como prioridade (função extra para resolver parenteses)
//  - Trabalhar com números negativos
//  )
//55 + 72 * 9 / 2 * (5 - 4) * 2
fun main() {
    val result = calcInteligente("55 + 72 * 9 / 2 * 5 - 4 * 2")
    println(result.get())
}

// 48 == '0'; 57 == '9'
// 42 == '*'; 43 == '+'; 45 == '-'; 47 == '/'
// 32 == ' '
//Min 9 chars && com parenteses
fun calcInteligente(sOperacoes: String): Optional<Double> {
//    if (sOperacoes.length < 9 || !sOperacoes.contains('(')) return Optional.empty()
    val nums = ArrayDeque<Double>()
    val sinais = ArrayDeque<Operacao>()
    val charsOpr = sOperacoes.trim().toCharArray()
    sinais.add(Operacao.VAZIO)
    var index = 0
    do {
        while (charsOpr[index] == ' ') index++
        val lastSignal = sinais.last()
        var isPositive = true
        var numAtual = 0
        var hasNum = false
        while (index < charsOpr.size && charsOpr[index] - '0' >= 0 && charsOpr[index] - '0' <= 9) {
            hasNum = true
            numAtual = numAtual * 10 + (charsOpr[index] - '0')
            index++
        }
        if (lastSignal == Operacao.MULTIPLICACAO || lastSignal == Operacao.DIVISAO) {
            when (lastSignal) {
                Operacao.MULTIPLICACAO -> { sinais.removeLast(); nums.add(nums.removeLast() * numAtual) }
                Operacao.DIVISAO -> { sinais.removeLast(); nums.add(nums.removeLast() / numAtual) }
                else -> ""
            }
        }
        else if (hasNum) { nums.add((numAtual).toDouble()) }
        else {
            index++
            if (index < charsOpr.size) {
                val sinalAtual = salvaSinal(charsOpr[index] - '0')
                if(sinalAtual != Operacao.VAZIO) sinais.add(sinalAtual)
            }
        }
    } while (index < charsOpr.size)

    sinais.removeFirst()
    do {
        val sinalAtual = sinais.removeFirst()
        when (sinalAtual) {
            Operacao.SOMA -> nums.addFirst(nums.removeFirst() + nums.removeFirst())
            Operacao.SUBTRACAO -> nums.addFirst(nums.removeFirst() - nums.removeFirst())
            else -> ""
        }
    } while (nums.size != 1)
    return Optional.of(nums.removeLast())
}

fun salvaSinal(sinal: Int):Operacao{
    return when (sinal) {
        -6 -> Operacao.MULTIPLICACAO
        -5 -> Operacao.SOMA
        -3 -> Operacao.SUBTRACAO
        -1 -> Operacao.DIVISAO
        else -> Operacao.VAZIO
    }
}
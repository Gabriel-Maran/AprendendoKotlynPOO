//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// TODO(
//  - Abstrair codigo
//  )
fun main() {
    println("111 * 111 = " + calcInteligenteDoisNums("111 * 111"))
    println("111 - 111 = " +calcInteligenteDoisNums("111 - 111"))
    println("111 + 111 = " +calcInteligenteDoisNums("111 + 111"))
    println("111 / 111 = " +calcInteligenteDoisNums("111 / 111"))
    println("(-17) * (-15) = " + calcInteligenteDoisNums("(-17) * (-15)"))
    println("(-17) - (-15) = " +calcInteligenteDoisNums("(-17) - (-15)"))
    println("(-17) + (-15) = " +calcInteligenteDoisNums("(-17) + (-15)"))
    println("(-30) / (-15) = " +calcInteligenteDoisNums("(-30) / (-15)"))
}

fun calcInteligenteDoisNums(sOperacao: String): Int {
    // 48 == '0'; 57 == '9'
    // 42 == '*'; 43 == '+'; 45 == '-'; 47 == '/'
    // 32 == ' '
    var num1 = 0;
    var firstIsPositive = 1;
    var num2 = 0;
    var secondIsPositive = 1;
    var operacao: Operacao = Operacao.VAZIO
    val charArray = sOperacao.trim().toCharArray()
    var init = 0
    var it: Int = charArray[init] - '0'
    while (it < -1){
        if (it == -3) firstIsPositive = -1
        init++
        it = charArray[init] - '0'
    }

    for (i in init..sOperacao.length - 1) {
        it = charArray[i] - '0'
        if (it > -1 && it < 10) {
            if (operacao == Operacao.VAZIO) {
                num1 = num1 * 10 + it
            } else {
                num2 = num2 * 10 + it
            }
        } else if (it != -16 /*(' ' - '0')*/) {
            if (operacao != Operacao.VAZIO && it == -3) {
                secondIsPositive = -1
            } else {
                when (it) {
                    -6 -> operacao = Operacao.MULTIPLICACAO
                    -5 -> operacao = Operacao.SOMA
                    -3 -> operacao = Operacao.SUBTRACAO
                    -1 -> operacao = Operacao.DIVISAO
                }
            }
        }
    }
    num1 = num1 * firstIsPositive
    num2 = num2 * secondIsPositive
    return when (operacao) {
        Operacao.SOMA -> num1 + num2
        Operacao.SUBTRACAO -> num1 - num2
        Operacao.MULTIPLICACAO -> if (num2 == 0) 0 else num1 * num2
        Operacao.DIVISAO -> num1 / num2
        else -> 0
    }
}
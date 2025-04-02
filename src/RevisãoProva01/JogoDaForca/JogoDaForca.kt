package RevisãoProva01.JogoDaForca

var vitoriasPlayerForca = 0
var derrotasPlayerForca = 0
val regexOnlyWordsUsuario = Regex("^[A-Za-z]+\$")
val regexOnlyCharUsuario = Regex("^[A-Za-z]\$")
var win = false
var limiteErros = 8


fun main() {
    val regexEscolha = Regex(pattern = "^[^1-4]$")
    var escUsuario = " "
    do {
        do {
            println("=== Bem vindo ao Jogo da Foca ===")
            println("Digite 1 para jogar")
            println("Digite 2 para ser informado do funcionamento do jogo")
            println("Digite 3 para ver o placar")
            println("Digite 4 para sair")
            escUsuario = readlnOrNull() ?: "-1"
            if(escUsuario.matches(regexEscolha)){
                println("ERRO! Digite um valor valido, de 1-4")
            }
        } while (escUsuario.matches(regexEscolha))
        when (escUsuario) {
            "1" -> jogarForca()
            "2" -> comoJogarForca()
            "3" -> placarForca()
            "4" -> println("Saindo...")
        }
    } while (escUsuario != "4")
}

fun placarForca() {
    println("=========== Placar do Game ===========")
    println("Quantidade de vitorias: $vitoriasPlayerForca")
    println("Quantidade de derrotas: $derrotasPlayerForca")
    println("======================================")
}

fun jogarForca() {
    //Pega uma palavra aleatorio(com dificuldade variada) ou uma palavra escrita por um usuário
    val palavra = userSetWord().uppercase()

    val auxCharArray = CharArray(palavra.length) { '_' }
    var diminuirTentativas = true
    var palavraChute = " "
    var erros = 0
    var charChute = ' '
    var escolhaDigita = 0
    println("========== PALAVRA: =============")
    println(auxCharArray)
    println("=================================")
    do {
        println("======== Jogo ========")
        println("Erros: $erros/$limiteErros")
        do {
            println("Digite 1 para chutar uma letra ou 2 para chutar uma palavra")
            escolhaDigita = readlnOrNull()?.toIntOrNull() ?: 0
            if(escolhaDigita < 1 || escolhaDigita > 2){
                println("ERRO! Digite um valor valido, de 1-2")
            }
        } while (escolhaDigita < 1 || escolhaDigita > 2)
        when (escolhaDigita) {
            1 -> {
                do {
                    println("Digite a letra: ")
                    val input = readlnOrNull() ?: ""
                    charChute = input.firstOrNull() ?: ' '

                    // Verifica se o input tem 1 caractere E se é uma letra
                    if (input.length != 1 || !charChute.toString().matches(regexOnlyCharUsuario)) {
                        println("Erro: Digite apenas UMA letra (A-Z). Tente novamente!")
                    }
                } while (!charChute.toString().matches(regexOnlyCharUsuario))
                //Este for percorre a palavra, em forrmato charArray e tenta achar o char digitado pelo usuario dentro do array
                //Caso ache, ele troca a posição encontrada na palavra no auxCharArray pela letra
                //Ex: "Palavra" -> usuario digita 'p' -> sistema encontra na posição '0' -> substitui 'p' na posição 0 do auxCharArray
                for((index:Int, letra:Char) in palavra.toCharArray().withIndex()) {
                    charChute = charChute.uppercaseChar()
                    if(letra == charChute){
                        auxCharArray[index] = letra
                        diminuirTentativas = false
                    }
                }
                //Verifica se todas as letras da variavel apalvra e o auxCharArray são iguais, caso seja, o jogo acaba
                win = auxCharArray.contentEquals(palavra.toCharArray())
                //Se a letra não for encontrada, será aumetada a quantidade de erros em +1
                if(diminuirTentativas) erros += 1
                //printa como o jogo está no momento, para visualização do usuário
                println("========== PALAVRA: =============")
                println(auxCharArray)
                println("=================================")
                diminuirTentativas = true
            }

            2 -> {
                do {
                    println("Digite a letra: ")
                    palavraChute = readlnOrNull() ?: " "

                    // Verifica se o input tem 1 caractere E se é uma letra
                    if (!palavraChute.matches(regexOnlyWordsUsuario)) {
                        println("Erro: Digite UMA palavra. Tente novamente!")
                    }
                } while (!palavraChute.matches(regexOnlyWordsUsuario))
                //compara as duas variaveis são iguais, caso sejam, o jogo acaba
                if (palavraChute.uppercase() == palavra.uppercase()) {
                    win = true
                    println("Vitoria")
                } else { // caso elas não sejam iguais, a quantidade de erros aumenta
                    erros += 1
                }
            }
        }
    } while (erros < limiteErros && !win)
    if (erros == limiteErros) {
        println("Você perdeu, a palavra era $palavra")
        derrotasPlayerForca += 1
    } else {
        println("Parabéns, você ganhou!!!")
        vitoriasPlayerForca += 1
    }
}

fun userSetWord(): String {
    var gerarWord = Words()
    var escolhaJogo = 0
    var palavra: String = "Vazio"
    do {
        println("Escolha o modo de Jogo:(1 ou 2)")
        println(" 1 -Usuário digita a palavra")
        println(" 2 -Palavra gerada aleatóriamente")
        //Pega o estilo de jogo, como random word ou written word
        escolhaJogo = readlnOrNull()?.toIntOrNull() ?: 0
    } while (escolhaJogo < 1 || escolhaJogo > 2)
    when (escolhaJogo) {
        1 -> {
            //Usuário escreve uma palavra
            palavra = gerarWord.usuarioDigita()
            return palavra
        }

        2 -> {
            do {
                println("Escolha a dificuldade da palavra que será gerada:(1,2 ou 3)")
                println(" 1 - Facil")
                println(" 2 - Medio")
                println(" 3 - Dificil")
                //Pega a dificuldade escolhida pelo usuario
                escolhaJogo = readlnOrNull()?.toIntOrNull() ?: 0
            } while (escolhaJogo < 1 || escolhaJogo > 3)
            when (escolhaJogo) {
                1 -> {
                    //Gera palavra dificuldade facil
                    palavra = gerarWord.gerarFacil()
                    limiteErros = 8
                    return palavra
                }

                2 -> {
                    //Gera palavra dificuldade media
                    palavra = gerarWord.gerarMedio()
                    limiteErros = 6
                    return palavra
                }

                3 -> {
                    //Gera palavra dificuldade dificil
                    palavra = gerarWord.gerarDificil()
                    limiteErros = 4
                    return palavra
                }
            }
        }
    }
    return palavra
}

fun comoJogarForca() {
    //Instruções
    println("Como funciona?")
    println(" - O usuário terá a opção de colocar uma palavra aleatória ")
    println("   OU pedir para o computador escolher uma palavra aleatória")
    println(" - O jogador irá poder escolher entre digitar uma palavra OU letra e testa-la!")
    println(" - O jogo não trabalha com acentos, ç ou qualuquer caracter especial, evite-os!")
    println("    - Ex: informação, seria inforrmacao")
    println(" - O jogo acaba quando o número de tentativas acabar ou o jogador acertar a palavra!")
    println(" - Boa sorte!")
}

class Words() {
    private val easyWords = listOf(
        "casa", "gato", "sol", "lua", "mar", "flor", "mesa", "pao", "rio", "aviao",
        "livro", "cafe", "chave", "porta", "bola", "cama", "fogo", "agua", "lapis", "mapa",
        "vela", "sino", "tigre", "dedo", "nuvem", "fruta", "vento", "noite", "dia", "mae",
        "pai", "irma", "amigo", "escola", "carro", "rua", "peixe", "prato", "copo", "sapato",
        "ceu", "terra", "leite", "arroz", "feijao", "bolo", "doce", "sal", "pente", "relogio",
        "giz", "musica", "filme", "luz", "tempo", "cor", "praia", "arvore", "navio", "rosa",
        "limao", "pessego", "melao", "cavalo", "barco", "treno", "luvas", "chapeu", "boneca",
        "jogo", "tinta", "caneta", "quadro", "janela", "pedra", "chuva", "neve", "calor", "frio",
        "letra", "numero", "mao", "pe", "olho", "nariz", "boca", "orelha", "cao", "rato",
        "urso", "lobo", "pato", "galo", "vaca", "porco", "milho", "trigo", "ferro", "vidro"
    )

    private val mediumWords = listOf(
        "computador", "bicicleta", "elefante", "hospital", "restaurante", "supermercado",
        "biblioteca", "universidade", "professor", "estudante", "medico", "policia",
        "aeroporto", "caminhao", "helicoptero", "planeta", "montanha", "vulcao", "oceano",
        "deserto", "floresta", "cachoeira", "ilha", "historia", "geografia", "matematica",
        "ciencia", "literatura", "teatro", "danca", "internet", "smartphone", "mensagem",
        "fotografia", "direcao", "personagem", "misterio", "aventura", "fantasia", "documentario",
        "jornal", "pesquisa", "maquina", "sistema", "chocolate", "crocodilo", "girafa", "abacaxi",
        "abobora", "borboleta", "camaleao", "dinossauro", "esmeralda", "diamante", "energia",
        "viagem", "tradutor", "eleicao", "governo", "sociedade", "cultura", "familia", "natureza",
        "tecnologia", "instrumento", "violino", "saxofone", "telescopio", "microscopio", "arcoiris",
        "tempestade", "furacao", "terremoto", "esqueleto", "musculo", "respiração", "alimentacao",
        "transporte", "construcao", "arquitetura", "poesia", "romance", "suspense", "estrategia",
        "solucao", "problema", "felicidade", "tristeza", "coragem", "liberdade", "justica",
        "educacao", "comunicacao", "informacao", "desenho", "invencao"
    )

    private val hardWords = listOf(
        "arqueologo", "psicologo", "xilofone", "quilometro", "paralelepipedo",
        "pneumoultramicroscopicossilicovulcanoconiotico", "oftalmologista", "ornitologo",
        "paleontologo", "astrofisica", "nanotecnologia", "criptografia", "fotossintese",
        "termodinamica", "eletrocardiograma", "desoxirribonucleico", "heterossexualidade",
        "parapsicologia", "anticoncepcional", "desidratacao", "gastroenterologista",
        "dermatologista", "neurologista", "psiquiatria", "radiografia", "ecossistema",
        "biodiversidade", "reciclagem", "sustentabilidade", "meteorologia", "cartografia",
        "magnetohidrodinamica", "espectrofotometro", "antropologia", "filantropia",
        "paradoxalmente", "hieroglifo", "onomatopeia", "hipopotamo", "estegossauro",
        "triceratops", "pterodactilo", "esfincter", "hemoglobina", "mitocondria",
        "cromossomo", "clorofila", "cinematografia", "constitucional", "internacional",
        "multicultural", "transcendental", "irreconhecivel", "incompreensivel",
        "desoxigenacao", "desintegracao", "desumidificador", "interdisciplinar",
        "eletromagnetismo", "radiocomunicacao", "ultrasonografia", "estroboscopio",
        "caleidoscopio", "estereotipo", "arqueopteryx", "paleolitico", "neolitico",
        "mesopotamia", "esquizofrenia", "paranoia", "hipocondriaco", "megalomania",
        "claustrofobia", "agorafobia", "onisciente", "onipresente", "onipotente",
        "inquestionavel", "imprevisivel", "inconstitucional", "desproporcional",
        "desorientacao", "desclassificacao", "deslumbrante", "extraordinario",
        "incomensuravel", "irrevogavel", "indestrutivel", "inatingivel", "inconsequente",
        "despretensioso", "descomplicado", "contraditorio", "inconformado", "desajeitado",
        "desalinhado", "desconcertante", "desencontrado", "desenraizado"
    )

    fun gerarFacil(): String {
        //retorna uma palavra aleatoria random da lista "easyWords"
        return easyWords.random()
    }

    fun gerarMedio(): String {
        //retorna uma palavra aleatoria random da lista "mediumWords"
        return mediumWords.random()
    }

    fun gerarDificil(): String {
        //retorna uma palavra aleatoria random da lista "hardWords"
        return hardWords.random()

    }

    fun usuarioDigita(): String {
        var palavraUsuario = " "
        do {
            println("Digite a palavra que deseja que o Player descubra!")
            //recolhe a palava que o usuario digita para ser usada no jogo
            palavraUsuario = readlnOrNull() ?: ""
        } while (!palavraUsuario.matches(regexOnlyWordsUsuario))
        //retorna a palavra que um dos usuarios escolheu para o jogo
        return palavraUsuario
    }
}
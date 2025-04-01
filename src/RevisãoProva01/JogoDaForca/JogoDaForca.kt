package RevisãoProva01.JogoDaForca

var vitoriasPlayerForca = 0
var derrotasPlayerForca = 0
//Em desenvolvimento....
fun main() {
    val regexForca = Regex(pattern = "^[^1-4]$")
    var escUsuario = " "
    do {

        do {
            println("=== Bem vindo ao Jogo da Foca ===")
            println("Digite 1 para jogar")
            println("Digite 2 para ser informado do funcionamento do jogo")
            println("Digite 3 para ver o placar")
            println("Digite 4 para sair")
            escUsuario = readlnOrNull() ?: "-1"
        } while (escUsuario.equals(regexForca))
        when (escUsuario) {
            "1" -> jogarForca()
            "2" -> comoJogarForca()
            "3" -> placarForca()
            "4" -> println("Saindo...")
        }
    } while (escUsuario != "4")
}

fun placarForca(){
        println("=========== Placar do Game ===========")
        println("Quantidade de vitorias: $vitoriasPlayerForca")
        println("Quantidade de derrotas: $derrotasPlayerForca")
        println("======================================")
}

fun jogarForca(){

}

fun comoJogarForca() {
    println("Como funciona?")
    println(" - O usuário terá a opção de colocar uma palavra aleatória ")
    println("   OU pedir para o computador escolher uma palavra aleatória")
    println(" - O jogador irá poder escolher entre digitar uma palavra OU letra e testa-la!")
    println(" - O jogo não trabalha acentos, evite-os!")
    println(" - O jogo acaba quando o número de tentativas acabar ou o jogador acertar a palavra!")
    println(" - Boa sorte!")
}

private class Words(){
    val easyWords = listOf(
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

    val mediumWords = listOf(
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

    val hardWords = listOf(
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

    fun gerarFacil():String{
        return easyWords.random()
    }

    fun gerarMedio():String{
        return mediumWords.random()
    }

    fun gerarDificil():String{
        return hardWords.random()

    }

    fun usuarioDigita():String{
        val regexPalavraUsuario = Regex("^[A-Za-z]+\$")
        var palavraUsuario = " "
        do{
            println("Digite a palavra que deseja que o Player descubra!")
            palavraUsuario =  readlnOrNull() ?: ""
        }while(!palavraUsuario.matches(regexPalavraUsuario))
        return palavraUsuario

    }
}
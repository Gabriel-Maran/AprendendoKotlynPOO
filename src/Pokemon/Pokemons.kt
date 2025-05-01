package Pokemomons

import RevisãoProva01.listPositivos

val vantagensTipos = mapOf(
    "fogo" to listOf("grama", "inseto", "gelo"),
    "água" to listOf("fogo", "pedra", "terra"),
    "grama" to listOf("água", "terra", "pedra"),
    "elétrico" to listOf("água", "voador"),
    "terra" to listOf("fogo", "elétrico", "venenoso"),
    "pedra" to listOf("fogo", "inseto", "voador"),
    "lutador" to listOf("pedra", "normal", "gelo"),
    "voador" to listOf("inseto", "lutador", "grama"),
    "psíquico" to listOf("lutador", "venenoso"),
    "inseto" to listOf("grama", "psíquico"),
    "gelo" to listOf("dragão", "grama", "terra", "voador"),
    "dragão" to listOf("dragão")
)
var pokemonsPlayer1 = mutableListOf<Pair<String, Map<String, List<String>>>>()
var pokemonsPlayer2 = mutableListOf<Pair<String, Map<String, List<String>>>>()
val pokemons = Pokemons()
val pokedex = mapOf(
    1 to pokemons.bulbasaur,
    2 to pokemons.ivysaur,
    3 to pokemons.venusaur,
    4 to pokemons.charmander,
    5 to pokemons.charmeleon,
    6 to pokemons.charizard,
    7 to pokemons.squirtle,
    8 to pokemons.wartortle,
    9 to pokemons.blastoise,
    10 to pokemons.caterpie,
    11 to pokemons.metapod,
    12 to pokemons.butterfree,
    13 to pokemons.weedle,
    14 to pokemons.kakuna,
    15 to pokemons.beedrill,
    16 to pokemons.pidgey,
    17 to pokemons.pidgeotto,
    18 to pokemons.pidgeot,
    19 to pokemons.rattata,
    20 to pokemons.raticate,
    21 to pokemons.spearow,
    22 to pokemons.fearow,
    23 to pokemons.ekans,
    24 to pokemons.arbok,
    25 to pokemons.pikachu,
    26 to pokemons.raichu,
    27 to pokemons.sandshrew,
    28 to pokemons.sandslash,
    29 to pokemons.nidoranF,
    30 to pokemons.nidorina,
    31 to pokemons.nidoqueen,
    32 to pokemons.nidoranM,
    33 to pokemons.nidorino,
    34 to pokemons.nidoking,
    35 to pokemons.clefairy,
    36 to pokemons.clefable,
    37 to pokemons.vulpix,
    38 to pokemons.ninetales,
    39 to pokemons.jigglypuff,
    40 to pokemons.wigglytuff,
    41 to pokemons.zubat,
    42 to pokemons.golbat,
    43 to pokemons.oddish,
    44 to pokemons.gloom,
    45 to pokemons.vileplume,
    46 to pokemons.paras,
    47 to pokemons.parasect,
    48 to pokemons.venonat,
    49 to pokemons.venomoth,
    50 to pokemons.diglett,
    51 to pokemons.dugtrio,
    52 to pokemons.meowth,
    53 to pokemons.persian,
    54 to pokemons.psyduck,
    55 to pokemons.golduck,
    56 to pokemons.mankey,
    57 to pokemons.primeape,
    58 to pokemons.growlithe,
    59 to pokemons.arcanine,
    60 to pokemons.poliwag,
    61 to pokemons.poliwhirl,
    62 to pokemons.poliwrath,
    63 to pokemons.abra,
    64 to pokemons.kadabra,
    65 to pokemons.alakazam,
    66 to pokemons.machop,
    67 to pokemons.machoke,
    68 to pokemons.machamp,
    69 to pokemons.bellsprout,
    70 to pokemons.weepinbell,
    71 to pokemons.victreebel,
    72 to pokemons.tentacool,
    73 to pokemons.tentacruel,
    74 to pokemons.geodude,
    75 to pokemons.graveler,
    76 to pokemons.golem,
    77 to pokemons.ponyta,
    78 to pokemons.rapidash,
    79 to pokemons.slowpoke,
    80 to pokemons.slowbro,
    81 to pokemons.magnemite,
    82 to pokemons.magneton,
    83 to pokemons.farfetchd,
    84 to pokemons.doduo,
    85 to pokemons.dodrio,
    86 to pokemons.seel,
    87 to pokemons.dewgong,
    88 to pokemons.grimer,
    89 to pokemons.muk,
    90 to pokemons.shellder,
    91 to pokemons.cloyster,
    92 to pokemons.gastly,
    93 to pokemons.haunter,
    94 to pokemons.gengar,
    95 to pokemons.onix,
    96 to pokemons.drowzee,
    97 to pokemons.hypno,
    98 to pokemons.krabby,
    99 to pokemons.kingler,
    100 to pokemons.voltorb,
    101 to pokemons.electrode,
    102 to pokemons.exeggcute,
    103 to pokemons.exeggutor,
    104 to pokemons.cubone,
    105 to pokemons.marowak,
    106 to pokemons.hitmonlee,
    107 to pokemons.hitmonchan,
    108 to pokemons.lickitung,
    109 to pokemons.koffing,
    110 to pokemons.weezing,
    111 to pokemons.rhyhorn,
    112 to pokemons.rhydon,
    113 to pokemons.chansey,
    114 to pokemons.tangela,
    115 to pokemons.kangaskhan,
    116 to pokemons.horsea,
    117 to pokemons.seadra,
    118 to pokemons.goldeen,
    119 to pokemons.seaking,
    120 to pokemons.staryu,
    121 to pokemons.starmie,
    122 to pokemons.mrMime,
    123 to pokemons.scyther,
    124 to pokemons.jynx,
    125 to pokemons.electabuzz,
    126 to pokemons.magmar,
    127 to pokemons.pinsir,
    128 to pokemons.tauros,
    129 to pokemons.magikarp,
    130 to pokemons.gyarados,
    131 to pokemons.lapras,
    132 to pokemons.ditto,
    133 to pokemons.eevee,
    134 to pokemons.vaporeon,
    135 to pokemons.jolteon,
    136 to pokemons.flareon,
    137 to pokemons.porygon,
    138 to pokemons.omanyte,
    139 to pokemons.omastar,
    140 to pokemons.kabuto,
    141 to pokemons.kabutops,
    142 to pokemons.aerodactyl,
    143 to pokemons.snorlax,
    144 to pokemons.articuno,
    145 to pokemons.zapdos,
    146 to pokemons.moltres,
    147 to pokemons.dratini,
    148 to pokemons.dragonair,
    149 to pokemons.dragonite,
    150 to pokemons.mewtwo,
    151 to pokemons.mew
)
val listaNomesPokemons = mapOf(
    1 to "bulbasaur",
    2 to "ivysaur",
    3 to "venusaur",
    4 to "charmander",
    5 to "charmeleon",
    6 to "charizard",
    7 to "squirtle",
    8 to "wartortle",
    9 to "blastoise",
    10 to "caterpie",
    11 to "metapod",
    12 to "butterfree",
    13 to "weedle",
    14 to "kakuna",
    15 to "beedrill",
    16 to "pidgey",
    17 to "pidgeotto",
    18 to "pidgeot",
    19 to "rattata",
    20 to "raticate",
    21 to "spearow",
    22 to "fearow",
    23 to "ekans",
    24 to "arbok",
    25 to "pikachu",
    26 to "raichu",
    27 to "sandshrew",
    28 to "sandslash",
    29 to "nidoranF",
    30 to "nidorina",
    31 to "nidoqueen",
    32 to "nidoranM",
    33 to "nidorino",
    34 to "nidoking",
    35 to "clefairy",
    36 to "clefable",
    37 to "vulpix",
    38 to "ninetales",
    39 to "jigglypuff",
    40 to "wigglytuff",
    41 to "zubat",
    42 to "golbat",
    43 to "oddish",
    44 to "gloom",
    45 to "vileplume",
    46 to "paras",
    47 to "parasect",
    48 to "venonat",
    49 to "venomoth",
    50 to "diglett",
    51 to "dugtrio",
    52 to "meowth",
    53 to "persian",
    54 to "psyduck",
    55 to "golduck",
    56 to "mankey",
    57 to "primeape",
    58 to "growlithe",
    59 to "arcanine",
    60 to "poliwag",
    61 to "poliwhirl",
    62 to "poliwrath",
    63 to "abra",
    64 to "kadabra",
    65 to "alakazam",
    66 to "machop",
    67 to "machoke",
    68 to "machamp",
    69 to "bellsprout",
    70 to "weepinbell",
    71 to "victreebel",
    72 to "tentacool",
    73 to "tentacruel",
    74 to "geodude",
    75 to "graveler",
    76 to "golem",
    77 to "ponyta",
    78 to "rapidash",
    79 to "slowpoke",
    80 to "slowbro",
    81 to "magnemite",
    82 to "magneton",
    83 to "farfetchd",
    84 to "doduo",
    85 to "dodrio",
    86 to "seel",
    87 to "dewgong",
    88 to "grimer",
    89 to "muk",
    90 to "shellder",
    91 to "cloyster",
    92 to "gastly",
    93 to "haunter",
    94 to "gengar",
    95 to "onix",
    96 to "drowzee",
    97 to "hypno",
    98 to "krabby",
    99 to "kingler",
    100 to "voltorb",
    101 to "electrode",
    102 to "exeggcute",
    103 to "exeggutor",
    104 to "cubone",
    105 to "marowak",
    106 to "hitmonlee",
    107 to "hitmonchan",
    108 to "lickitung",
    109 to "koffing",
    110 to "weezing",
    111 to "rhyhorn",
    112 to "rhydon",
    113 to "chansey",
    114 to "tangela",
    115 to "kangaskhan",
    116 to "horsea",
    117 to "seadra",
    118 to "goldeen",
    119 to "seaking",
    120 to "staryu",
    121 to "starmie",
    122 to "mrMime",
    123 to "scyther",
    124 to "jynx",
    125 to "electabuzz",
    126 to "magmar",
    127 to "pinsir",
    128 to "tauros",
    129 to "magikarp",
    130 to "gyarados",
    131 to "lapras",
    132 to "ditto",
    133 to "eevee",
    134 to "vaporeon",
    135 to "jolteon",
    136 to "flareon",
    137 to "porygon",
    138 to "omanyte",
    139 to "omastar",
    140 to "kabuto",
    141 to "kabutops",
    142 to "aerodactyl",
    143 to "snorlax",
    144 to "articuno",
    145 to "zapdos",
    146 to "moltres",
    147 to "dratini",
    148 to "dragonair",
    149 to "dragonite",
    150 to "mewtwo",
    151 to "mew"
)
var player1 = ""
var player2 = ""

fun main() {
    getNomePlayers()
    pokemonsPlayer1 = formarTime(player1);
    pokemonsPlayer2 = formarTime(player2);
    determinaVencedor()
}

//Com base no resultado de batalha, determina o vencedor
fun determinaVencedor() {
    var vitoriasP1 = 0
    var vitoriasP2 = 0
    for (i in 0..2) {
        println("========= ${i + 1}ª batalha =========")
        val (nome1, tipos1) = pokemonsPlayer1[i]
        val (nome2, tipos2) = pokemonsPlayer2[i]
        println("${pokemonsPlayer1[i].first} VS ${pokemonsPlayer2[i].first}")

        val resultado = batalha(tipos1, tipos2)

        when (resultado) {
            1 -> {
                println("Vencedor $player1")
                vitoriasP1++
            }

            2 -> {
                println("Vencedor $player2")
                vitoriasP2++
            }

            else -> println("Empate")
        }
    }
    println("=========== Resultado Final ===========")
    when {
        vitoriasP1 > vitoriasP2 -> println("Vencedor $player1")
        vitoriasP1 < vitoriasP2 -> println("Vencedor $player2")
        else -> println("Empate")
    }
    println("=======================================")
}

//Realiza a batalha entre os pokemons, para ver quem irá ganhar
fun batalha(tipos1: Map<String, List<String>>, tipos2: Map<String, List<String>>): Int {
    var v1 = 0
    var v2 = 0

    for (listaSuper in tipos1.values) {
        for (t2 in tipos2.keys) {
            if (listaSuper.contains(t2)) v1++
        }
    }
    for (listaSuper in tipos2.values) {
        for (t1 in tipos1.keys) {
            if (listaSuper.contains(t1)) v2++
        }
    }
    return when {
        v1 > v2 -> 1
        v2 > v1 -> 2
        else -> 0
    }
}

//Cada vez que chamada, monta um time, baseado nas escolhas dos jodaores
//Utilizada para definir os pokemons que participarão das batalhas
fun formarTime(player: String): MutableList<Pair<String, Map<String, List<String>>>> {
    getListaPokemons()
    val pokemonsEscolhidos = mutableListOf<Pair<String, Map<String, List<String>>>>()
    var num: Int
    repeat(3) {
        do {
            println("$player, digite o pokemons que deseja, entre os número 1–151.: ")
            println("Ex: 1 - Bulbasaur")
            num = readLine()?.toIntOrNull() ?: -1
        } while (num < 1 || num > 151)
        val nome = listaNomesPokemons[num]!!
        var tipoMap = emptyMap<String, List<String>>()
        if (pokedex[num] != null) {
            tipoMap = pokedex[num]!!.mapValues { it.value!! }
        }
        pokemonsEscolhidos.add(nome to tipoMap)
    }
    return pokemonsEscolhidos
}

//Recebe os nomes dos players que irão jogar
fun getNomePlayers() {
    val regex = Regex("^[A-Za-z]+\$")
    do {
        println("Digite o nome do primeiro player:")
        player1 = readlnOrNull() ?: "-1"
    } while (!(player1.matches(regex)))
    do {
        println("Digite o nome do segundo player:")
        player2 = readlnOrNull() ?: "-1"
    } while (!(player2.matches(regex)))
}

//Printa a lista com todos os pokemons
fun getListaPokemons() {
    println("====== Pokemons Disponiveis para o time =======")
    val listEscolha = mutableListOf<String>()
    for (i in 1..151) {
        println("$i : ${listaNomesPokemons[i]}")
    }
    println("===============================================")
}

//Classe responsavel por guardar a informação de superEfetivo e tipo de cada pokemon
class Pokemons {

    private val superEfetivo = mapOf(
        //Isso aqui é basicamente um mapa com a key sendo o tipo
        //e o valor sendo no que ele é super efetivo
        "NORMAL" to emptyList<String>(),
        "FOGO" to listOf("GRAMA", "GELO", "INSETO"),
        "ÁGUA" to listOf("FOGO", "TERRA", "PEDRA"),
        "ELÉTRICO" to listOf("ÁGUA", "VOADOR"),
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "GELO" to listOf("GRAMA", "TERRA", "VOADOR", "DRAGÃO"),
        "LUTADOR" to listOf("NORMAL", "GELO", "PEDRA"),
        "VENENO" to listOf("GRAMA", "INSETO"),
        "TERRA" to listOf("FOGO", "ELÉTRICO", "VENENO", "PEDRA"),
        "VOADOR" to listOf("GRAMA", "LUTADOR", "INSETO"),
        "PSÍQUICO" to listOf("LUTADOR", "VENENO"),
        "INSETO" to listOf("GRAMA", "VENENO", "PSÍQUICO"),
        "PEDRA" to listOf("FOGO", "GELO", "VOADOR", "INSETO"),
        "FANTASMA" to listOf("PSÍQUICO", "FANTASMA"),
        "DRAGÃO" to listOf("DRAGÃO")
    )
//como funciona para os maps pegarem o(s) seu(s) respectivo(s) valor(es) (super efetivo(s))?
//basicamente é chamado o map "superEfeivo", referenciado qual o tipo é o seu.
//Ex: Abaixo temos a criação de um map, sendo o bulbasaur
//
//val bulbasaur = mapOf(
//    "GRAMA" to Pokemon.superEfetivo["GRAMA"], //O seu tiop é "GRAMA", logo, ele recebe no seu valor, todos os tipos que "GRAMA" é super efetivo
//    "VENENO" to Pokemon.superEfetivo["VENENO"]
//)

    val bulbasaur = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val ivysaur = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val venusaur = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val charmander = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val charmeleon = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val charizard = mapOf(
        "FOGO" to superEfetivo["FOGO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val squirtle = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val wartortle = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val blastoise = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val caterpie = mapOf(
        "INSETO" to superEfetivo["INSETO"]
    )

    val metapod = mapOf(
        "INSETO" to superEfetivo["INSETO"]
    )

    val butterfree = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val weedle = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val kakuna = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val beedrill = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val pidgey = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val pidgeotto = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val pidgeot = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val rattata = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val raticate = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val spearow = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val fearow = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val ekans = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val arbok = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val pikachu = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val raichu = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val sandshrew = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val sandslash = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val nidoranF = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val nidorina = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val nidoqueen = mapOf(
        "VENENO" to superEfetivo["VENENO"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val nidoranM = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val nidorino = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val nidoking = mapOf(
        "VENENO" to superEfetivo["VENENO"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val clefairy = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val clefable = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val vulpix = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val ninetales = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val jigglypuff = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val wigglytuff = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val zubat = mapOf(
        "VENENO" to superEfetivo["VENENO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val golbat = mapOf(
        "VENENO" to superEfetivo["VENENO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val oddish = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val gloom = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val vileplume = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val paras = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "GRAMA" to superEfetivo["GRAMA"]
    )

    val parasect = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "GRAMA" to superEfetivo["GRAMA"]
    )

    val venonat = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val venomoth = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val diglett = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val dugtrio = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val meowth = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val persian = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val psyduck = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val golduck = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val mankey = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val primeape = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val growlithe = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val arcanine = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val poliwag = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val poliwhirl = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val poliwrath = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val abra = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val kadabra = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val alakazam = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val machop = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val machoke = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val machamp = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val bellsprout = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val weepinbell = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val victreebel = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val tentacool = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val tentacruel = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val geodude = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val graveler = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val golem = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val ponyta = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val rapidash = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val slowpoke = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val slowbro = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val magnemite = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val magneton = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val farfetchd = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val doduo = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val dodrio = mapOf(
        "NORMAL" to superEfetivo["NORMAL"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val seel = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val dewgong = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "GELO" to superEfetivo["GELO"]
    )

    val grimer = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val muk = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val shellder = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val cloyster = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "GELO" to superEfetivo["GELO"]
    )

    val gastly = mapOf(
        "FANTASMA" to superEfetivo["FANTASMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val haunter = mapOf(
        "FANTASMA" to superEfetivo["FANTASMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val gengar = mapOf(
        "FANTASMA" to superEfetivo["FANTASMA"],
        "VENENO" to superEfetivo["VENENO"]
    )

    val onix = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "TERRA" to superEfetivo["TERRA"]
    )

    val drowzee = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val hypno = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val krabby = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val kingler = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val voltorb = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val electrode = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val exeggcute = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val exeggutor = mapOf(
        "GRAMA" to superEfetivo["GRAMA"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val cubone = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val marowak = mapOf(
        "TERRA" to superEfetivo["TERRA"]
    )

    val hitmonlee = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val hitmonchan = mapOf(
        "LUTADOR" to superEfetivo["LUTADOR"]
    )

    val lickitung = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val koffing = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val weezing = mapOf(
        "VENENO" to superEfetivo["VENENO"]
    )

    val rhyhorn = mapOf(
        "TERRA" to superEfetivo["TERRA"],
        "PEDRA" to superEfetivo["PEDRA"]
    )

    val rhydon = mapOf(
        "TERRA" to superEfetivo["TERRA"],
        "PEDRA" to superEfetivo["PEDRA"]
    )

    val chansey = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val tangela = mapOf(
        "GRAMA" to superEfetivo["GRAMA"]
    )

    val kangaskhan = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val horsea = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val seadra = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val goldeen = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val seaking = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val staryu = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )


    val starmie = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val mrMime = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val scyther = mapOf(
        "INSETO" to superEfetivo["INSETO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val jynx = mapOf(
        "GELO" to superEfetivo["GELO"],
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val electabuzz = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val magmar = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val pinsir = mapOf(
        "INSETO" to superEfetivo["INSETO"]
    )

    val tauros = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val magikarp = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val gyarados = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val lapras = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"],
        "GELO" to superEfetivo["GELO"]
    )

    val ditto = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val eevee = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val vaporeon = mapOf(
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val jolteon = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"]
    )

    val flareon = mapOf(
        "FOGO" to superEfetivo["FOGO"]
    )

    val porygon = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val omanyte = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val omastar = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val kabuto = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val kabutops = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "ÁGUA" to superEfetivo["ÁGUA"]
    )

    val aerodactyl = mapOf(
        "PEDRA" to superEfetivo["PEDRA"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val snorlax = mapOf(
        "NORMAL" to superEfetivo["NORMAL"]
    )

    val articuno = mapOf(
        "GELO" to superEfetivo["GELO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val zapdos = mapOf(
        "ELÉTRICO" to superEfetivo["ELÉTRICO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val moltres = mapOf(
        "FOGO" to superEfetivo["FOGO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val dratini = mapOf(
        "DRAGÃO" to superEfetivo["DRAGÃO"]
    )

    val dragonair = mapOf(
        "DRAGÃO" to superEfetivo["DRAGÃO"]
    )

    val dragonite = mapOf(
        "DRAGÃO" to superEfetivo["DRAGÃO"],
        "VOADOR" to superEfetivo["VOADOR"]
    )

    val mewtwo = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )

    val mew = mapOf(
        "PSÍQUICO" to superEfetivo["PSÍQUICO"]
    )
}
package Pokemon

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
class Pokemons {

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
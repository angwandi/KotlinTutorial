fun main(args: Array<String>) {
    //todo Kotlin class
    val tim = Player("Tim")
    /* println(tim.name)
     println(tim.lives)
     println(tim.level)
     println(tim.score)*/
    tim.show()

    val louise = Player("Louise", 5)
    louise.show()

    val dems = Player("Dems", 4, 8)
    val kris = Player("Kris", 2, 5, 1000)
    dems.show()
    kris.show()
}

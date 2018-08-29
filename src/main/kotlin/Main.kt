fun main(args: Array<String>) {
    //todo Kotlin class
    val tim = Player("Tim")
    tim.show()
/*Instances from our Player class*/
    val louise = Player("Louise", 5)
    val dems = Player("Dems", 4, 8)
    val kris = Player("Kris", 2, 5, 1000)
    louise.show()
    dems.show()
    kris.show()
    println(tim.weapon.name.toUpperCase())
    println(tim.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    kris.weapon = axe
    println(kris.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(kris.weapon.damageInflicted)

    dems.weapon = Weapon("Sword", 10)
    println(dems.weapon.name)

    dems.weapon = Weapon("Spear", 14)
    println(dems.weapon.name)

}

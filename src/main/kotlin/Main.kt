fun main(args: Array<String>) {
    //todo Kotlin class
    val tim = Player("Tim")
    tim.show()
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
    dems.show()

    louise.weapon = dems.weapon
    louise.show()

    dems.weapon = Weapon("Spear", 14)

    println(dems.weapon.name)

    dems.show()

    val redPortion = Loot("Red Position", LootType.POSITION, 7.50)
    dems.getLoot(redPortion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    dems.getLoot(chestArmor)
    dems.showInventory()

    dems.getLoot((Loot("Ring of protection", LootType.RING, 40.25)))
    dems.getLoot((Loot("Invisibility Potion", LootType.POSITION, 35.95)))
    dems.showInventory()

    if (dems.dropLoot(redPortion)) {
        dems.showInventory()
    } else {
        println("you don't have a ${redPortion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POSITION, 56.36)
    if (dems.dropLoot(bluePotion)) {
        dems.showInventory()
    } else {
        println("you don't have ${bluePotion.name}")
    }

    if (dems.dropLoot("Invisibility Potion")) {
        dems.showInventory()
    } else {
        println("You don't have an Invisibility potion")
    }
}

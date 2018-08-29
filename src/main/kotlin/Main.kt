fun main(args: Array<String>) {

    // for (i in 1..10) {
    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.lives = 0
    do {
        if (dracula.dodges()) {
            dracula.lives += 1
            continue
        }
        if (dracula.runAway()) {
            println("Dracula run away")
            break
        } else {
            dracula.takeDamage(80)
        }
    } while (dracula.lives > 0)
    println("-------------------------------------------------")

    //  }

//    val conan = Player("Conan")
//    conan.getLoot(Loot("Invisibility", LootType.ARMOR, 4.00))
//    conan.getLoot(Loot("Hightail", LootType.ARMOR, 183.00))
//    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.00))
//    conan.getLoot(Loot("Brass Ring", LootType.RING, 12.00))
//    conan.getLoot(Loot("Chain Mail", LootType.POSITION, 4.00))
//    conan.getLoot(Loot("Gold Ring", LootType.RING, 3.00))
//    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.00))
//    conan.showInventory()
}

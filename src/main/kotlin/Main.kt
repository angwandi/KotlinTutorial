fun main(args: Array<String>) {
    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.ARMOR, 4.00))
    conan.getLoot(Loot("Hightail", LootType.ARMOR, 183.00))
    conan.getLoot(Loot("Ring of speed", LootType.RING, 25.00))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 12.00))
    conan.getLoot(Loot("Chain Mail", LootType.POSITION, 4.00))
    conan.getLoot(Loot("Chain Mail", LootType.POSITION, 4.00))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 3.00))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 3.00))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.00))
    conan.showInventory()

    conan.dropLoot("Gold Ring")
    conan.showInventory()
    conan.dropLoot("Silver Ring")
    conan.showInventory()

    val dropped = conan.dropLoot("Something not present ")
    println(dropped)

    println(conan.dropLoot("Something else"))

    if (conan.dropLoot("A bit of junk")) {
        println("junk dropped")
    } else {
        println("You do not have any junk")
    }
}

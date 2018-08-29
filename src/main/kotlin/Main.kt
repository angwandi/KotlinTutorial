fun main(args: Array<String>) {
///*    //todo Kotlin class
//    val tim = Player("Tim")
//    tim.show()
//*//*Instances from our Player class*//*
//    val louise = Player("Louise", 5)
//    val dems = Player("Dems", 4, 8)
//    val kris = Player("Kris", 2, 5, 1000)
//    louise.show()
//    dems.show()
//    kris.show()
//    println(tim.weapon.name.toUpperCase())
//    println(tim.weapon.damageInflicted)
//
//    val axe = Weapon("Axe", 12)
//    kris.weapon = axe
//    println(kris.weapon.name)
//    println(axe.name)
//
//    axe.damageInflicted = 24
//    println(axe.damageInflicted)
//    println(kris.weapon.damageInflicted)
//
//    dems.weapon = Weapon("Sword", 10)
//    dems.show()
//
//    louise.weapon = dems.weapon
//    louise.show()
//
//    dems.weapon = Weapon("Spear", 14)
//*//*
//    println(dems.weapon.name)
//*//*
//    dems.show()
//
//    val redPortion = Loot("Red Position", LootType.POSITION, 7.50)
//    dems.inventory.add(redPortion)
//    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
//    dems.inventory.add(chestArmor)
//    dems.showInventory()
//
//    dems.inventory.add(Loot("Ring of protection", LootType.RING, 40.25))
//    dems.inventory.add(Loot("Invisibility Position",LootType.POSITION,35.95))
//    dems.showInventory()
//
//    println(dems.toString())*/
    for (i in 0..10) { //includes 10 todo
        println("$i squared is ${i * i}")
    }
    println("##############################")

    for (i in 0 until 10) { //does not include 10 todo
        println("$i squared is ${i * i}")
    }
    println("##############################")

    for (i in 10 downTo 0) { //reversed order todo
        println("$i squared is ${i * i}")
    }
    println("##############################")
    for (i in 10 downTo 0 step 2) { //reversed order todo
        println("$i squared is ${i * i}")
    }
    println("##############################")
    //Todo Challenge
    /*Create a loop that prints out all the numbers from 0 to 100 that are divisible by both
    * 3 and 5
    * Hints: include if inside the loop and modulus operator which returns the remainder
    * after dividing one number into another.
    * */
    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            println(value)
        }
    }
}

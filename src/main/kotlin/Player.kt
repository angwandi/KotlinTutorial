class Player(private val name: String, private var level: Int = 1, private var lives: Int = 3, private var score: Int = 0) {
    //Object of class Weapon
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    /*Show method*/
    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: $weapon"""
    }

    //Encapsulating data
    fun getLoot(item: Loot) {
        inventory.add(item)
        //Code to save the inventory goes here
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun showInventory() {
        println("$name's Inventory")
        for (item in inventory) {
            println(item)
        }
        println("=============================")
    }
}

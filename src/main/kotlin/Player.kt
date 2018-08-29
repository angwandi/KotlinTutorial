class Player(private val name: String, private var level: Int = 1, private var lives: Int = 3, private var score: Int = 0) {
    //Object of class Weapon
    var weapon: Weapon = Weapon("Fist", 1)

    /*Show method*/
    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score""")
    }
}

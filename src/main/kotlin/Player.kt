class Player(private val name: String, private var level: Int = 1, private var lives: Int = 3, private var score: Int = 0) {
    /*var level = 1
    var lives = 3
    var score = 0*/
    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score""")
    }
}

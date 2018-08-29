fun main(args: Array<String>) {
    //todo if statement
    /* val lives = 0
     var isGameOver = (lives < 1)
     println(isGameOver)
 *//*Condition is an expression that evaluates a true or false (@ isGameOver) *//*
    if (isGameOver) {
        println("Game over!")
    } else {
        print("You're still alive!")
    }*/

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")
/*When from if automatic Kotlin */
    val message: String
    message = when {
        age < 18 -> "You are too young to vote"
        age == 100 -> "Congratulations"
        else -> "You can vote"
    }
    println(message)

    /*  message = if (age < 18) {
          "You are too young to vote"
      } else if (age == 100) {
          "Congratulations"
      } else {
          "You can vote"
      }
      println(message)*/

}

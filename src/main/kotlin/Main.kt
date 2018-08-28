fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")
    /*Variable: name given to an area of memory so that we can refer to content by name */
    val jim = "James T Kirt"
    val tim = "Tim Butchalka"
    /*Type of variable tim is a String */
    println(tim)
    val timsWeeklySalary = 32
    val timsMonthlySalary = timsWeeklySalary * 4
    println(timsWeeklySalary)
    println(timsMonthlySalary)
    /*Variable types*/
    /*Kotlin convention: start function and variable names with lower case and follow the camelCase*/

    println()
    val apples = 6
    val oranges = 5
    val fruits = apples - oranges
    println(fruits)
    println(apples / 4)

    println()
    val weeks = 234
    val years = weeks / 52.0
    /*String Concatenation and Interpolation*/
    println("130 weeks in year is: $years")
    println("My name is $tim")
/*
    Interpolation in Kotlin
*/
    println("My name is $tim")
    println("$weeks weeks in year $years years")
    println("A quarter of the apple is ${apples / 4}")
/*Challenges */
    println("$tim has a weekly salary of : $timsWeeklySalary$")
    println()
    println("$tim has a monthly salary of : \$${timsWeeklySalary * 4}$")
    println()
    println("The difference between 6 apples and 5 oranges is : ${apples - oranges}")
    println("$apples apples - $oranges oranges leaves $fruits piece(s) of fruits")

    /*val and var: Variable declaration
    * val used for variable we are not prepared to change or reassigned throughout the application and
    * var can be modified
    * */

    println("$jim is the CEO")
}

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")
    /*Variable: name given to an area of memory so that we can refer to content by name */
    var tim: String
    /*Type of variable tim is a String */
    tim = "Tim Butchalka"
    println(tim)
    var timsWeeklySalary: Int = 32
    var timsMonthlySalary: Int = timsWeeklySalary * 4
    println(timsWeeklySalary)
    println(timsMonthlySalary)
    /*Variable types*/
    /*Kotlin convention: start function and variable names with lower case and follow the camelCase*/

    println()
    val apples: Int = 6
    val oranges: Int = 5
    val fruits: Int = apples - oranges
    println(fruits)
    println(apples / 4)

    println()
    val weeks: Int = 234
    val years: Double = weeks / 52.0
    println("130 weeks in year is: " + years)
    /*String Concatenation and Interpolation*/
    println("My name is " + tim)
/*
    Interpolation in Kotlin
*/
    println("My name is $tim")
    println("$weeks weeks in year $years years")
    println("A quarter of the apple is ${apples / 4}")



}

import java.util.*

fun main(args: Array<String>) {

    // MISC: Let’s repeat the same with a different problem.
    // Take two inputs from the user, name and age. Print that.
    var read = Scanner(System.`in`)
    println("Enter your name!")
    var name = readLine()!!
    println("Enter your age!")
    var age = read.nextInt()

    println("Name: $name")
    println("Age: $age")


}
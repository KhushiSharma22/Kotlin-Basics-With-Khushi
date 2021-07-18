import java.util.*

fun main(args: Array<String>) {

   //1. Print your name and a fun fact about yourself
    println("Name: Khushi Sharma")
    print("Fun Fact: I am a big PotterHead!")
    println("ABC")
    
   //2. Store the content in variables permanently and print the variables
    var var1 = "Khushi"
    val var2 = "I am a big Potterhead"
    var1="Khushi Sharma"
    println("$var1" + " " + "$var2")
    
   //3. Read Input from the User
   println("Enter your name and age")
   var read = Scanner(System.`in`)
   var name = readLine()!!
   var age = read.nextInt()
   println("$name")
   println("$age")

}

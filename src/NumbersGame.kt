import kotlin.random.Random

fun main() {
    val goal = Random.nextInt(11)
    var i = 1

    while (i <= 3){
        print("Guss a number between 0 and 10: ")
        val input_number = readLine()
        try {
            when{
                input_number == "quit" -> {
                    println("Exiting")
                    break
                }
                input_number!!.toInt() !in 0..10 -> println("Please enter number between 0 and 10")
                input_number.toInt() == goal -> {
                    println("You got it!")
                    break
                }
                i == 3 -> println("Wrong guss, you lose :(")
            }
            i++
        } catch (e: Exception){
                println("Please enter numbers only")
        }
    }
}


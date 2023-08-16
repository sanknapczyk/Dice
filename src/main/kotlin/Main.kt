fun main() {
    val users = mapOf("Sandra1" to "qwerty1", "Sandra2" to "qwerty2")
    var maxAttempts = 3

    println("Welcome to DICE GAME!")
    while (true) {
        println("Enter your login: ")
        val username = readlnOrNull()
        println("Enter your password: ")
        val password = readlnOrNull()

        if (username != null && password != null) {
            val storedPassword = users[username]
            if(password==storedPassword){
                println("Login successful.\nHow many time does it take to roll number 6? Let's find out!")
                diceGame()
                break
            }else{
                maxAttempts--
                if(maxAttempts>0){
                    println("Invalid password or username. Please try again\nAttempts to try left: $maxAttempts")
                }else{
                    println("Max amount of attempts to login exceeded.")
                    break
                }
            }
        }
    }
}

fun diceGame(){
    var diceFace: Int
    var rollCount=1
    diceFace  = (1..6).random()

    if (diceFace!=6) {
        println("Dice number is: $diceFace. To roll again press enter. ")
        readlnOrNull()
        while (diceFace!=6){
            println("Dice number is: $diceFace")
            diceFace  = (1..6).random()
            rollCount++
        }
        println("Dice number is: $diceFace. Congrats you rolled 6!\nGame over")
        println("It took $rollCount times to roll 6.")
    } else{
        println("Dice number is: $diceFace. You rolled 6!")
    }
}


package com.mdtech.rockpaperscissor

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()

    if (randomNumber == 1) {
        computerChoice = "Rock"
    } else if (randomNumber == 2) {
        computerChoice = "Paper"
    } else if (randomNumber == 3) {
        computerChoice = "Scissors"
    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie"){
        println("It's a Tie")
    }else if(winner == "Player"){
        println("Player Won!")
    }else{
        println("Computer Won!")
    }

}
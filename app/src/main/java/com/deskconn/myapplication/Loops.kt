package com.deskconn.myapplication

fun main(){
    //While loop executes a block of code repeatedly as long as given condition is true
    var x = 100
    while (x >= 0){
        print(x)
        x -= 2
     }
    println("\n While loop is done!")

    x = 11
    do {
        println("$x")
        x++
    }while (x <= 10)
    println("\n While loop is done!")

    var feltTemp = "Cold"
    var roomTemp = 10
    while(feltTemp == "Cold"){
        roomTemp++
        if (roomTemp >= 20){
            feltTemp = "Comfy"
            println("It's comfy now")
        }
    }

    for (num in 1..10){
        print("$num")
    }
    for(i in 10 downTo 1 step 2){   //same as - for(i in 10.down(1).step(2)
        print(" $i ")
    }
}
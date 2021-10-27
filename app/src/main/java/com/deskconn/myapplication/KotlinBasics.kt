package com.deskconn.myapplication

fun main(){
    //var is mutable variable
    //val is immutable variable
    var myName = "Abdul Rehman Jamil"
    myName = "Ahsan"
    println("Hye Dear! $myName")

         // Integer Types: Byte (8bit), Short (16 bit),//
        // Int (32 bit), Long (64 bit)//

    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

        //Floating point number types: Float (32 bit), Double (64 bit)//

    // Float is used if care about the space
    val myFloat: Float = 1.1F
    //if we don't put this F at the end of value it seems like double on next time declaring
    //val myFloat: Float
    //myFloat = 1.1 here it will consider this myFloat variable as a double
    // Double is used if don't care about the space for flexibility
    val myDouble: Double = 3.23534632654642435

        //Boolean is used to represent the logical values (true or false)//

    var isSunny: Boolean = true
    //var isSunny = true
    isSunny = false

        //Characters 'char' // It only contain the single character or digit or symbol//

    val letterCharacter: Char = 'A'
    //val letterCharacter = 'A'
    val digitCharacter: Char = '1'
    //val digitCharacter = '1'

        //String//

    val myString: String = "Hello World!"
    //val myString = "Hello World!"
        //For accessing the single letter of string we use
    var firstLetterOfStr = myString[0]
    //println(firstLetterOfStr)
    var lastStr = myString[myString.length - 1]
    //or
    //println("Last Character is $lastStr")

          //Arithmetic Operators (+, -, *, /, %)Doctor//

    var result = 10
    result = 15 % 2
    result *= 2
    result = 2
    val a = 6
    //val a = 5.0
    val b = 3
    result = (a / b).toInt()
    //println(result)
   /* var resultDouble: Double
    resultDouble = a / b
    println(resultDouble)*/

        //Comparison operators (==, !=, <, >, <=, >=)//

    val isEqual = 5==5
    //println("isEqual is $isEqual")

    val isNotEqual = 5!=5
    //Use of "$" is called String interpolation
    //println("isNotEqual is $isNotEqual")

    //println("is5Greater3 ${-5 > 3}")   //for writing the complete expression we use curly braces with $ sign
    //println("is5LowerEqual3 ${5 <= 3}")
    //println("is5GreaterEqual3 ${5 >= 5}")

        //Assignment Operator (+=, -=, *=, /=, %=)//

    var myNum = 5
    //myNum += 3
    //myNum -= 3
    myNum *= 3
    //myNum /= 3
    //myNum %= 4
    //println("myNum is $myNum")

        //Increment and Decrement Operator (++, --)//
    myNum++
    //println("myNum is $myNum")
    myNum--
    //println("myNum is $myNum")
    //println("myNum is ${myNum++}") //It will print the value before increment and then add new value Prints(15)
    //println("myNum is ${++myNum}")  // It will print 17 because 1 is added in previous post increment
    //println("myNum is ${myNum--}")
    //println("myNum is ${--myNum}")

        //If Conditions//
    var heightPerson1 = 170
    var heightPerson2 = 170

    if (heightPerson1 > heightPerson2){
        //println("Use raw force")
    }else if (heightPerson1 == heightPerson2){
        //println("Use your power technique 1337")
    }else{
        //println("Use technique")
    }
        //if using integer values
    val age = -1
    if (age >= 21){
        //println("Now you may drink in US")
    }else if (age >= 18){
        //println("You may vote now")
    }else if (age >= 17){
        //println("You may drive now")
    }else{
        //println("You are too young!")
    }

    //if using string
    var name = "Rehman"
    if(name == "Rehman"){
        //println("Welcome Home Rehman")
    }else{
        //println("Who are you!")
    }
    var isRainy = true
    if(isRainy){
        //println("It's Rainy")
    }
    else{
        //println("It's Sunny")
    }

            //When Expression
    var season = 4
    when (season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 2
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
        else -> println("Invalid Season")
    }
    when(age){
        !in 0..20 -> println("Now you may drink in US")
        in 18..20 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else -> println("You are too young!")
    }
    var x: Any = "13.37f"
    when(x){
        is Int -> println("$x is an Int")
        //!is Double -> println("$x is not a Double")
        is String -> println("$x is String")
        else -> println("$x is the none of above")
    }
}
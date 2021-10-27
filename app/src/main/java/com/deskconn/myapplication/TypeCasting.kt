package com.deskconn.myapplication

import kotlin.math.floor

fun main() {
    val stringList: List<String> = listOf(
    "ARJ", "Ajmal", "Tanvir", "Aqdas")
    val mixedTypeList: List<Any> = listOf("Abdul Rehman",
    31, 5, "BDay", 70.5, "Weighs", "KM")

    for (value in mixedTypeList){
        if (value is Int){
            println("Integer: $value")
        }else if (value is Double){
            println("Double: '$value' with floor value ${floor(value)}")
        }else if (value is String){
            println("String: '$value' of length ${value.length}")
        }else{
            println("Unknown Type")
        }
    }

    // Alternatively
    for (value in mixedTypeList){
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: '$value' with floor value ${floor(value)}")
            is String ->  println("String: '$value' of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //Smart Cast
    val obj1: Any = "I have a dream"
    if (obj1 !is String){
        println("Not a string")
    }else{
        // Obj is automatically cast to a string in this scope
        println("Found a String of length ${obj1.length}")
    }

    //Explicit (Unsafe) Casting using the "as" keyword - can go wrong
    val str1: String = obj1 as String
    println(str1.length)

    //This code block will generate the error as value behind Any '1337' is integer not a string
    val obj2: Any = 1337
    val str2: String = obj2 as String
    println(str2)

    //Explicit (safe) casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String //work
    println(str3) //prints null
}
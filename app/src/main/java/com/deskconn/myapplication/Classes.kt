package com.deskconn.myapplication

import java.lang.IllegalArgumentException

var b = 5
fun main() {
    myFunction(5)

    //Creating Instances / Object of class/ Classes
    var name = Person("Abdul", "Rehman", 30)
    name.hobby = "to Skateboard"
    name.age = 23
    println("abdul is ${name.age} years old")
    name.stateHobby()
    var abdul = Person()
    abdul.hobby = "Play Video Games"
    abdul.stateHobby()
    //var lastName = Person(firsName = "Malik AR ")
    b = 4

    var myCar = Car()
    println("My Brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 500    // setting the value
    println("MaxSpeed is: ${myCar.maxSpeed}")   // getting the value here

    println("My Model is: ${myCar.myModel}") // We can get the value of myModel because its not private
}

// This 'a' is a parameter
fun myFunction(a: Int){
    //This 'a' is a variable
    //var a = 5
    b = a //Parameter 'a' will be passed to variable 'a'
    println("a is $a")
}

    // Primary Constructor
class Person(firsName: String = "Abdul Rehman ", secondName: String = "Jamil"){
    //Member Variables or Properties: Is a variable within a class
    var age: Int? = null
    var hobby : String = "Watch Netflix"
        var firstName: String? = null
    //Initializer Block
    init {
        this.firstName = firsName
        println("Initialize a new Person Object with FirstName = $firsName and LastName = $secondName")
    }
        // Secondary Constructor//
        constructor(firsName: String, secondName: String, age: Int): this(firsName, secondName){
            // These parameters coming from primary constructor
            this.age = age //'this' keyword means variable could be from this class
            println("Initialize a new Person Object with FirstName = $firsName and LastName = $secondName and age is $age")
        }
    //Member Function/ Methods: is a function within a class
    fun stateHobby(){
        println("$firstName\'s Hobby is $hobby")
    }
}

class Car(){
    //Late Initializer
    lateinit var owner: String

    val myBrand: String = "BMW"
        //here we create a custom getter
    get() {
        return field.lowercase()
    }
    var maxSpeed: Int = 250
        // by default generated in the background we don't need to write
    // get() = field   //This is not the custom field its only return the default getter
    set(value) {
        field = if(value > 0) value else throw IllegalArgumentException("Max Speed can't bless than 0")
    }

    var myModel: String = "M5"
    private set //we cannot set the value of myModel in main function
    init {
        myModel = "M3" //but here we can
        owner = "ARJ"
        println("owner of car is $owner")
    }

}
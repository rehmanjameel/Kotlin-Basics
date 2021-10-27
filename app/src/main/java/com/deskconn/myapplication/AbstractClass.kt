package com.deskconn.myapplication

// An abstract class cannot be instantiated
// We cannot create objects of an abstract class)
// However, we can inherit subclasses from an abstract class

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){  //Concrete non abstract properties
    // Abstract property (must be overridden by subclasses)
    abstract var maxSpeed: Double

    // Abstract Method (Must be implemented by subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete Non abstract Method
    fun displayDetails(){
        println("name: $name, Origin: $origin, Weight: $weight, Max speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){
    override fun run() {
        // code to run
        println("run on two legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){
    override fun run() {
        // code to run
        println("run on four legs")
    }

    override fun breath() {
        // Code to breath
        println("Breath through trunk")
    }
}

fun main() {
    val human = Human("Abdul Rehman", "Pakistan", 70.0, 28.0)
    val elephant = Elephant("Rosy", "Pakistan", 5000.0, 25.0)

    // Error occurs: cannot create the instance of abstract class in main function
    //val mammal = Mammal("ARJ", "Pakistan", 50.0, 30.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}
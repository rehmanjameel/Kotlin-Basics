package com.deskconn.myapplication

// The class that inherits the features of other
// class is called the sub class or child class or
// Derived class, and the class whose features are
// inherited is called the super class or parent class
// or base class

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The Drivable is braking")
    }
}

// Super class, Parent class, Base Class of vehicles
open class Cars(override val maxSpeed:Double, val name: String, val brand: String): Drivable{
    open var carRange: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0){
            carRange += amount
        }
    }

    //override fun drive(): String = "driving the interface drive"
    override fun drive(): String {
        return "driving the interface drive"
    }
    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}
// SUb class, child class, or derived class of Cars
// must pass the parameters of super class
// we can add more parameters in child class
class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Cars(maxSpeed, name, brand){

    var chargerType = "Type1"
    override var carRange = batteryLife * 6

    override fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $carRange KM on electricity"
    }

    override fun brake() {
        super.brake() // (Method) Execute brake from super
        println("Brake inside of electric car")
    }
}

fun main() {
    //Creating object of class car
    var audiA3 = Cars(200.0,"A3", "Audi")
    //Creating object of class car
    var teslaS = ElectricCar(240.0,"S-Model", "Tesla", 85.0)

    teslaS.chargerType = "Type2"
    //teslaS.extendRange(200.0)

    //teslaS.drive()
    teslaS.brake()
    audiA3.brake()

    //Polymorphism
    //audiA3.drive(200.0)
    //teslaS.drive(150.0)
}
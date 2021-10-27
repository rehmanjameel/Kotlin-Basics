package com.deskconn.myapplication

//     Data classes work/deal/compare with data not with objects

//The compiler automatically derives the following members from all properties declared in the primary constructor:
//
//    equals()/ hashCode() pair
//
//    toString() of the form "User(name=John, age=42)"
//
//    componentN() functions corresponding to the properties in their order of declaration.
//
//    copy() function (see below).

//    The primary constructor needs to have at least one parameter.
//
//    All primary constructor parameters need to be marked as val or var.
//
//    Data classes cannot be abstract, open, sealed, or inner.
data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Abdul")

   /* val name = user1.name
    println(name)*/

    user1.name = "Rehman"

    val user2 = User(1, "Rehman")
    println(user1 == user2)

    println("User Details: $user1")

    val updateUser = user1.copy(name = "ARJ") //It will copy the same data present in the user1 but can change the value by parameter
    println(user1)
    println(updateUser)

    println(updateUser.component1())  // Prints the id 1
    println(updateUser.component2())  // Prints the name ARJ

    val (id, name) = updateUser
    println("Id = $id, Name = $name")
}
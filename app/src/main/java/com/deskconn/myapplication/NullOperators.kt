package com.deskconn.myapplication

fun main(){
    //Nullable operation//

    //var name: String = "Abdul"
    //name = null //-> Compilation Error

    var nullableName: String? = "Abdul"     // This '?' question mark is nullable operator
   // nullableName = null //Here nullable value is null
    //var len = name.length
    var len2 = nullableName?.length
    println("$len2")
    //println(nullableName?.lowercase())

         //This '?:' question mark and colon is elvis operator
    val name = nullableName ?: "Rehman" //This line state that prints Rehman if nullable variable is null other wise print variable's value
    println("Name is $name")
    /* if (nullableName != null){
         var len2 = nullableName.length
     }else{
         null
     }*/

        // Not nullable '!!' sign
    println(nullableName!!.lowercase())

    //val wifesAge: String? = user?.wife?.age ?: 0
}
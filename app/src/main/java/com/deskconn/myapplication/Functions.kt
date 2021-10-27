package com.deskconn.myapplication

import java.util.function.DoubleUnaryOperator

fun main(){
    myFunc()
    //Arguments
    /*var result = addup(3, 5)
    println("result is $result")*/
   /* var avg = avg(8.0, 50.0)
    println("Result is $avg")*/


}
//Method: a method is function within a class
//Parameter (Input)
fun addUp(a: Int, b: Int): Int{
    return a+b
}
fun avg(a: Double, b: Double): Double{
    return (a + b)/2
}

fun myFunc(){
    println("My Function is called")
}


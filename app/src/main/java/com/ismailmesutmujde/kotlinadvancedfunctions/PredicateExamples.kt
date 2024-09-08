package com.ismailmesutmujde.kotlinadvancedfunctions

fun main() {
    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)

    val allCheck = myNumberList.all { it > 5 }
    println(allCheck)

    val anyCheck = myNumberList.any { it > 5 }
    println(anyCheck)

    val totalCount = myNumberList.count { it > 5 }
    println(totalCount)

    val findNum = myNumberList.find { it > 5 }
    println(findNum)

    val findLastNum = myNumberList.findLast { it > 5 }
    println(findLastNum)

    val myPredicate = {num : Int -> num > 5}
    val allCheckWithPredicate = myNumberList.all(myPredicate)
    println(allCheckWithPredicate)
}
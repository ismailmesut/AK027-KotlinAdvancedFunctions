package com.ismailmesutmujde.kotlinadvancedfunctions

fun main() {
    val myNumberList = listOf<Int>(1,3,5,7,9,11,13,15)

    // filter

    /*
    val smallNumberList = myNumberList.filter { num -> num < 6}
    for(num in smallNumberList) {
        println(num)
    }*/
    val smallNumberList = myNumberList.filter { it < 6}
    for(num in smallNumberList) {
        println(num)
    }

    // map
    /*
    val squaredNumbers = myNumberList.map { num -> num * num }
    for(num in squaredNumbers) {
        println(num)
    }*/
    val squaredNumbers = myNumberList.map { it * it }
    for(num in squaredNumbers) {
        println(num)
    }
}
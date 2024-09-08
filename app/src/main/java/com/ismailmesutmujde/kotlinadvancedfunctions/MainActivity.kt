package com.ismailmesutmujde.kotlinadvancedfunctions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var myInt : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(myInt != null) {
            val num = myInt!! + 1
        }

        myInt?.let {
            val num = it + 1
        }

        /*
        val myNum = myInt?.let {
            it + 1
        }?:0
         */

        // also
        val ismail = Person("ismail", 35)
        val mesut = Person("mesut", 10)
        val mujde = Person("mujde",25)

        val people = listOf<Person>(ismail,mesut,mujde)
        people.filter { it.age > 18 }.also {
            for(person in it) {
                println(person.name)
            }
        }

        // apply
        val intent = Intent()
        intent.putExtra("","")
        intent.putExtra("","")
        intent.`package` = ""
        intent.action = ""

        val intentWithApply = Intent().apply {
            putExtra("","")
            putExtra("","")
            `package` = ""
            action = ""
        }

        //with
        Person("barley",4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("bar", 4).apply {
            name = "Barley"
        }
        println(newBarley.name)

        val anotherBarley = with(Person("arley", 4)) {
            name = "Barley"
        }
        println(anotherBarley)

        val withBarley = Person("arley", 4)
        with(withBarley) {
            name = "Barley"
            age = 4
        }
        println("last barley : " + withBarley.name)
    }
}

data class Person(var name: String, var age: Int)
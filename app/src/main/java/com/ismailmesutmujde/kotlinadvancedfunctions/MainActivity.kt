package com.ismailmesutmujde.kotlinadvancedfunctions

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
        
    }
}

data class Person(var name: String, var age: Int)
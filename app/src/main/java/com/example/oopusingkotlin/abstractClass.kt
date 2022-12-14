package com.example.oopusingkotlin

abstract class Mammal(private val name: String,private val origin:String, private val weight: Double){
abstract var maxSpeed: Double
abstract fun run()
abstract fun breath()

fun displayDetails(){
    println("name $name origin $origin weight $weight max speed $maxSpeed")

}


}

class Human(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight) {

    override fun run() {
        println("runs on two legs")
    }

    override fun breath() {
        println("breath through mouth and nose")
    }



}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double)
    : Mammal(name, origin, weight)
{

    override fun breath() {
        println("breath through trunk")
    }

    override fun run() {
        println("run on four legs")
//mustafa
    }



}


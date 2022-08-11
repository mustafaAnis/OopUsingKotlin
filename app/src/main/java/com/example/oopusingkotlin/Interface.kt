package com.example.oopusingkotlin

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("the drivable is breaking")
    }
}

open class Car(override val maxSpeed: Double,val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange( amount: Double ){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String = "driving the interface drive"

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }
}

class electricCar(maxSpeed: Double,name: String, brand: String, batteryLife: Double)
    : Car (maxSpeed,name, brand) {
    var chargerType = "Type1"

    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }
    override fun drive(): String {
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("print inside of a electric car")
    }
}
fun main(){
    var audiA3 = Car(20.20,"A3","Audi")
    var teslaS = electricCar(30.30,"S-Model","Tesla",85.0)


    teslaS.extendRange(200.0)
    teslaS.chargerType = "Type2"

//    teslaS.drive()

    teslaS.brake()
    audiA3.brake()

//    audiA3.drive(200.0)
//    teslaS.drive(200.0)
}
//update
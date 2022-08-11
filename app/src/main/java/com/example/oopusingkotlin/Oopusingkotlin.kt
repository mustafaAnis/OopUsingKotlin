package com.example.oopusingkotlin

import android.graphics.ColorSpace

//fun main(){
//    var mustafa = Person("Mustafa","Anis",32)
//    mustafa.age = 35
//    println("Mustafa is ${mustafa.age} years old")
//    mustafa.stateHobby()





//    mustafa.hobby = "Cricket"
//    var john = Person()
//    john.hobby = "football"
//    john.stateHobby()
//    var johncorner = Person(lastName = "petterson")

//}
class Person1(firstName: String = "john", lastName: String = "Doe"){
    var age : Int? = null
    var hobby : String = "Watch Netflix"
    var firstName: String? = null
    init {
        this.firstName = firstName
     println("person created")
     println("firstname = $firstName lastname = $lastName")
 }
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName,lastName){
        this.age = age
        println("firstname = $firstName lastname = $lastName , age = $age")

    }

    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }


}
//
//fun main(){
//    var samsung = MobilePhone("android","samsung","A21s")
//    var iphone  = MobilePhone("ios","iphone","7plus")
//    var huawei = MobilePhone ("huawei_software","huawei","nova7i")
//
//}
//class MobilePhone(osName: String,brand: String,model: String){
//
//    init {
//        println("OsName = $osName brand = $brand model = $model")
//    }
//
//}
//update
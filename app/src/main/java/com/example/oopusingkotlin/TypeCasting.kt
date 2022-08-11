package com.example.oopusingkotlin

fun main(){
    var Stringlist: List<String> = listOf("hello","world")
    var MixedTypeList: List<Any> = listOf(23,"hello",9.2,true,"world")

    for (value in MixedTypeList)
    {
        if (value is String) {
            println("String = $value and the length off string is ${value.length}")
        }
            else if (value is Int) {
            println("Integer = $value")
        }
            else if (value is Double) {
            println("Double = $value with floor value = ${Math.round(value)}")
        }
            else{
            println("Value is not recognise")
        }
    }
    println("_________________________")

    for (value in MixedTypeList)
    {
        when(value){
            is String -> println("String = $value and the length off string is ${value.length}")
            is Int -> println("Integer = $value")
            is Double -> println("Double = $value with floor value = ${Math.round(value)}")
            is Boolean -> println("Value is not recognise")
        }



}
    val obj : Any = 64
    if (obj !is String){
        println("not an string")
    } else{
        println("string with length of ${obj.length}")
    }

//    val str1: String = obj as String
//    println(str1.length)

    val str2: String? = obj as? String
    println(str2)


}
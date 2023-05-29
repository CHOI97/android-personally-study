//package com.example.kotlin_study_coroutine_flow
//
//import kotlinx.coroutines.*
//
//suspend fun foo(): List<Int>{
//    delay(1000)
//    return listOf(1,2,3)
//}
//
//fun main() = runBlocking<Unit>{
//
//    foo().forEach{
//        value -> println(value)
//    }
//}
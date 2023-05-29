package com.example.kotlin_study_coroutine_flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun simple(): Flow<Int> = flow {
    for (i in 1..3) {
        delay(100)
        println("delay(100)")
        emit(i)
    }
}

fun main() = runBlocking<Unit> {
    simple().collect{
        value -> println(value)
    }
}
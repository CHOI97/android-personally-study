package com.example.kotlin_study_coroutine_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// collectLatest
//
fun main() = runBlocking<Unit> {

    flow {
        emit(1)
        delay(50)
        emit(2)
    }.collectLatest { value ->
        println("Collecting $value")
        // delay(30) // Emulate work
        delay(80) // Emulate work
        println("$value collected")
    }

}
package com.example.kotlin_study_coroutine_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

// Flow builders

fun main() = runBlocking<Unit> {
    (1..3).asFlow().collect {
            value -> println(value)
    }
}
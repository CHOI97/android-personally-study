package com.example.kotlin_study_coroutine_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() = runBlocking<Unit> {

    (1..5).asFlow()
        .filter {
            it % 2 == 0
        }.collect {
            println("Collect $it")
        }
}
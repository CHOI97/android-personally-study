package com.example.kotlin_study_coroutine_flow

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

suspend fun performRequest(request: Int): String {
    delay(1000) // imitate long-running asynchronous work
    val cnt = request * request
    return "$cnt"
}

fun main() = runBlocking<Unit> {
    (1..3).asFlow() // a flow of requests
        .map {
                request -> performRequest(request)
        }
        .collect {
                response -> println(response)
        }

}
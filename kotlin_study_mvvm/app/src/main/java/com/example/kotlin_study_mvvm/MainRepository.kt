package com.example.kotlin_study_mvvm

class MainRepository(){

    // 일반적으로 local db나 api 데이터를 호출해온다.
    // 이번 예제에서는 간단히 repository의 프로퍼티 값을 호출하는 방식으로 작성해보았다.
    private val data: String = "Data 호출 성공"

    fun getData(): String {
        return data
    }
}

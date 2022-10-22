package com.cookandroid.kotlin_study_dataclass

data class User(
    var user_id: String, var user_name: String, var user_data: String
){
    fun helloUser(message: String): String{
        return "hello my name is $message"
    }
}

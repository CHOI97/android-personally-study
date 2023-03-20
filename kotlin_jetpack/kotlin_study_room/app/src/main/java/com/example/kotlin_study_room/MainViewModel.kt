package com.example.kotlin_study_room

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin_study_room.db.TextDatabase
import com.example.kotlin_study_room.entity.TextEntity
import com.example.kotlin_study_room.entity.WordEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {

    val context = getApplication<Application>().applicationContext
    val db = TextDatabase.getDatabase(context)

    // viewModelScope 는 Dispatchers.Main 이기 때문에 Dispatchers.IO 를 사용 할 수 없다.
    // viewModelScope.launch() ->  viewModelScope.launch(Dispatchers.IO)

    fun getData() = viewModelScope.launch(Dispatchers.IO) {
        Log.d("MainViewModel",db.textDao().getAllData().toString())
        Log.d("MainViewModel",db.wordDao().getAllData().toString())
    }

    fun insertData(text: String)= viewModelScope.launch(Dispatchers.IO) {
        db.textDao().insert(TextEntity(0,text))
        db.wordDao().insert(WordEntity(0,text))
    }

    fun removeData() = viewModelScope.launch(Dispatchers.IO) {
        db.textDao().deleteAllData()
        db.wordDao().deleteAllData()
    }
}
package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

// State
// Compose 중요한 역할 @Composable
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(viewModel: MainViewModel = viewModel()) {
    var text1: MutableState<String> = remember {
        mutableStateOf("Hello World")
    }
    var text2: String by remember {
        mutableStateOf("Hello World")
    }

    var (text: String, setText: (String) -> Unit) = remember {
        mutableStateOf("Hello World")
    }

    val text3: State<String> = viewModel.liveData.observeAsState("Hello World")

    Column() {
        Text("Hello World")
        Button(onClick = { }) {
            text1.value = "변경"
            print(text1.value)
            text2 = "변경"
            print(text2)
            Text("클릭")
            viewModel.changeValue("변경")
        }
        TextField(value = text, onValueChange = setText)
    }
}

class MainViewModel: ViewModel() {

    private val _value: MutableState<String> = mutableStateOf("Hello World")
    val value: State<String> = _value

    private val _liveData = MutableLiveData<String>()
    val liveData: LiveData<String> = _liveData
    fun changeValue(value: String) {
        _value.value = value
    }
}

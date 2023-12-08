package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Compose 영역이 아님
        setContent { // Compose 영역
            val scrollState = rememberScrollState()
            LazyColumn(
                modifier = Modifier
                    .background(color = androidx.compose.ui.graphics.Color.Green)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                item{
                    Text("Header")
                }
                items(50){index ->
                    Text("글씨 $index")
                }
                item{
                    Text("Footer")
                }
            }
//            Column (
//                modifier = Modifier
//                    .background(color = androidx.compose.ui.graphics.Color.Green)
//                    .verticalScroll(scrollState)
//            ){
//                for( i in 1..50){
//                    Text("글씨 $i")
//                }
//            }
        }
    }
}

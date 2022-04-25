package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun getSimpleButton(){
    var text by remember { mutableStateOf("Click") }
    Button(
        modifier = Modifier.fillMaxWidth()
        .wrapContentHeight(),
        onClick = {
        text = "Clicked"
    }){
        Text(text = text,modifier = Modifier.wrapContentSize())
    }
}

package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*

@Composable
fun getMyTextField(updatedText: (String)->Unit) {
    var textValue by remember {
        mutableStateOf("")
    }
    TextField(
        value = textValue,
        label = {
            Text(text = "Enter your name")
        },
        onValueChange = {
            updatedText.invoke(it)
            textValue = it
        }
    )
}
package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.`fun`.composeactivity.R

@Composable
fun getSimpleButton(){
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp),
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(2.dp, Color.Red), onClick = {}
    ){
        Text(text = stringResource(R.string.simple_button),modifier = Modifier.wrapContentSize())
    }
}

@Composable
fun getRoundedCornerButton(onclick: ()->Unit){
    val context = LocalContext.current
    var text by remember { mutableStateOf("Click") }
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .border(2.dp, Color.Green, shape = CircleShape),
        shape = CircleShape,
        onClick = {
            text = context.getString(R.string.rounded_button)
            onclick.invoke()
        }){
        Text(text = text,modifier = Modifier.wrapContentSize())
    }
}

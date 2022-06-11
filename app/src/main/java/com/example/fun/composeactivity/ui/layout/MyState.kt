package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun getColorBox(modifier: Modifier = Modifier){
    val color = remember {
        mutableStateOf(Color.Green)
    }
    Box(modifier = modifier.background(
        color.value)
        /* There is no margin available in compose.
        * You need to give margin with the help of border*/
        .border(5.dp, Color.White)
        .clickable{
        color.value = Color(
            Random.nextFloat(),
            Random.nextFloat(),
            Random.nextFloat(),
            1f
        )
    })
}
package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun getSimpleList() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..30) {
            Text(text = "Item $i")
        }
    }
}

@Composable
fun getSimpleListWithLazyColumn() {
    LazyColumn {
        items(30) {
            Text(text = "Item $it")
        }
    }
}
package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.`fun`.composeactivity.R

/*
* Do experiment with text views
* Check android article : https://developer.android.com/jetpack/compose/text
* */

@Preview
@Composable
fun getSimpleText() {
    Text(
        stringResource(R.string.app_name),
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            fontSize = 25.sp
        )
    )
}

@Composable
fun getMultipleStylesInText() {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color.Blue)) {
                append("H")
            }
            append("ello ")

            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)) {
                append("W")
            }
            append("orld")
        },
        fontFamily = FontFamily.Serif,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
}
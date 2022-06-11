package com.example.`fun`.composeactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.`fun`.composeactivity.ui.layout.*
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Column(Modifier.wrapContentSize()) {
                        getSimpleText()
                        getMultipleStylesInText()
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Column(Modifier.wrapContentSize()) {
                        getSimpleButton()
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Column(Modifier.wrapContentSize()) {
                        getColorBox(
                            Modifier
                                .fillMaxWidth()
                                .height(30.dp)
                        )
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Column(Modifier.wrapContentSize()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(10.dp)
                        ) {
                            getCustomImageView(
                                painter = painterResource(id = R.drawable.images),
                                title = "This is Compose Demo",
                                contentDescription = "Application consists compose component demos."
                            )
                        }
                    }
                    Column(Modifier.wrapContentSize()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .height(200.dp)
                                .padding(10.dp)
                        ) {
                            getSimpleListWithLazyColumn()
                        }
                    }
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    Column(Modifier.wrapContentSize()) {
                        getConstraintLayout()
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    val scaffoldState = rememberScaffoldState()
                    var textValue by remember {
                        mutableStateOf("")
                    }
                    val scope = rememberCoroutineScope()
                    Scaffold(
                        modifier = Modifier.fillMaxSize(),
                        scaffoldState = scaffoldState
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                        ) {
                            getMyTextField {
                                textValue = it
                            }
                            getRoundedCornerButton {
                                scope.launch {
                                    scaffoldState.snackbarHostState.showSnackbar("Hello $textValue")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
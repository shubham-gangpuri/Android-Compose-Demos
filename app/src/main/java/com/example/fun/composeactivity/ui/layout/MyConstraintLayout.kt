package com.example.`fun`.composeactivity.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Composable
fun getConstraintLayout() {
    val constraints = ConstraintSet {
        val box1 = createRefFor("box1")
        val box2 = createRefFor("box2")

        constrain(box1) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }

        constrain(box2) {
            top.linkTo(parent.top)
            start.linkTo(box1.end)
            end.linkTo(parent.end)
            width = Dimension.value(100.dp)
            height = Dimension.value(100.dp)
        }
        createHorizontalChain(box1, box2, chainStyle = ChainStyle.Packed)
    }

    ConstraintLayout(
        constraintSet = constraints,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier.background(Color.Red)
                .layoutId("box1")
        )
        Box(
            modifier = Modifier.background(Color.Black)
                .layoutId("box2")
        )
    }
}
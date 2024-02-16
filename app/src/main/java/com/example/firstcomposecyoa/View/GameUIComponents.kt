package com.example.firstcomposecyoa.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun GamplayUI(drawableResID: Int, mainBodyText:String, modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(15.dp, bottom = 5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = drawableResID),
            contentDescription = null,
            modifier = modifier
                .padding(10.dp)
                .weight(.5f)
        )
        Text(
            text = mainBodyText,
            color = Color.White,
            modifier = Modifier
                .padding(10.dp)
                .weight(.25f)
        )
    }
}

@Composable
fun PlayerControls (
    modifier: Modifier,
    button1Text:String,
    button2Text:String,
    button3Text:String,
    button4Text:String,
    onClick1: () -> Unit,
    onClick2: () -> Unit,
    onClick3: () -> Unit,
    onClick4: () -> Unit,
) {
    Column (modifier = modifier.padding(10.dp, top = 5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = onClick1,
            modifier = modifier.weight(.07f).padding(2.dp),
            enabled = button1Text.isNotEmpty(),
            ) {
            Text(text = button1Text)
        }
        Button(
            modifier = modifier.weight(.07f).padding(2.dp),
            onClick = onClick2,
            enabled = button2Text.isNotEmpty(),
        ) {
            Text(text = button2Text)
        }
        Button(
            modifier = modifier.weight(.07f).padding(2.dp),
            onClick = onClick3,
            enabled = button3Text.isNotEmpty(),
        ) {
            Text(text = button3Text)
        }
        Button(
            modifier = modifier.weight(.07f).padding(2.dp),
            onClick = onClick4,
            enabled = button4Text.isNotEmpty(),) {
            Text(text = button4Text)
        }
    }
}
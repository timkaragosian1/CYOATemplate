package com.example.firstcomposecyoa.View

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.firstcomposecyoa.Model.initGameData
import com.example.firstcomposecyoa.Model.initPlayerData
import com.example.firstcomposecyoa.Model.loadGargoyleScene
import com.example.firstcomposecyoa.Model.loadGateScene
import com.example.firstcomposecyoa.ViewModel.GameplayViewModel
import com.example.firstcomposecyoa.ViewModel.PlayerViewModel

var playerViewModel = PlayerViewModel()
var gameplayViewModel = GameplayViewModel()


@Composable
fun CYOAGameApp(context: Context) {
    initPlayerData(playerViewModel, context)
    initGameData(gameplayViewModel, context)

    Surface(
        modifier = Modifier
        .fillMaxSize(),
        color = Color.Black,
        ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            //PlayerDataUI()
            GamplayUI(
                modifier = Modifier.weight(.65f),
                drawableResID = gameplayViewModel.imageResId,
                mainBodyText = gameplayViewModel.bodyText
            )
            PlayerControls(
                modifier = Modifier.weight(.30f),
                button1Text = gameplayViewModel.button1Text,//gameplayViewModel.button1Text,
                button2Text = gameplayViewModel.button2Text,//gameplayViewModel.button2Text,
                button3Text = gameplayViewModel.button3Text,//gameplayViewModel.button3Text,
                button4Text = gameplayViewModel.button4Text,//gameplayViewModel.button4Text,

                onClick1 = { handleOnClick1(playerViewModel, gameplayViewModel, context) },
                onClick2 = { handleOnClick2(playerViewModel, gameplayViewModel, context) },
                onClick3 = { handleOnClick3(playerViewModel, gameplayViewModel, context) },
                onClick4 = { handleOnClick4(playerViewModel, gameplayViewModel, context) },
            )
        }
    }
}

fun handleOnClick1(playerViewModel: PlayerViewModel, gameplayViewModel: GameplayViewModel, context:Context){
    /*
    Logic for figuring out what to load next needs to go here

    Needs a logic engine that is decided in the Model section

    After Model decides what to load, call the method in the model to modify the ViewModel

    Changes to the ViewModel change the scene
     */
    if (gameplayViewModel.eventName=="Starting Point") {
        loadGateScene(gameplayViewModel, context)
    } else {
        initGameData(gameplayViewModel,context)
    }
}

fun handleOnClick2(playerViewModel: PlayerViewModel, gameplayViewModel: GameplayViewModel, context:Context){
    if (gameplayViewModel.eventName=="Starting Point") {
        loadGargoyleScene(gameplayViewModel, context)
    } else {
        initGameData(gameplayViewModel,context)
    }
}

fun handleOnClick3(playerViewModel: PlayerViewModel, gameplayViewModel: GameplayViewModel, context:Context){

}

fun handleOnClick4(playerViewModel: PlayerViewModel, gameplayViewModel: GameplayViewModel, context:Context){

}
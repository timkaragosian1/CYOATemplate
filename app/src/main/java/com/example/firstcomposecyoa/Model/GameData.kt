package com.example.firstcomposecyoa.Model

import android.content.Context
import com.example.firstcomposecyoa.R
import com.example.firstcomposecyoa.ViewModel.GameplayViewModel

fun initGameData(gameplayViewModel: GameplayViewModel, context: Context) {
    gameplayViewModel.changeEventName("Starting Point")
    gameplayViewModel.changeImageResId(R.drawable.trail)
    gameplayViewModel.changeBodyText("Hello Everyone! This Works!")
    gameplayViewModel.changeButtonText1("Travel Somewhere")
    gameplayViewModel.changeButtonText2("Go Somewhere else")
    gameplayViewModel.changeButtonText3("")
    gameplayViewModel.changeButtonText4("")
}

fun loadGateScene(gameplayViewModel: GameplayViewModel, context: Context){
    gameplayViewModel.changeEventName("Gate")
    gameplayViewModel.changeImageResId(R.drawable.gate)
    gameplayViewModel.changeBodyText("You walk up to the gate. You are even more confident that this works correctly. dlhjsdfhoisdfhjohdfjklsjlhrghlkgdfhjklshjuifjghjidfsghjnjnidlfghjkljnkdlgjnkjnkldsfjnklgjnkldgsfj")
    gameplayViewModel.changeButtonText1("Go Back")
    gameplayViewModel.changeButtonText2("")
    gameplayViewModel.changeButtonText3("")
    gameplayViewModel.changeButtonText4("")
}

fun loadGargoyleScene(gameplayViewModel: GameplayViewModel, context: Context){
    gameplayViewModel.changeEventName("Gargoyle")
    gameplayViewModel.changeImageResId(R.drawable.gargoyle)
    gameplayViewModel.changeBodyText("You walk up to the gargoyle and he tears a whole through your heart. You are now a zombie so you can still continue playing you cold, heartless bastard.")
    gameplayViewModel.changeButtonText1("Go Back")
    gameplayViewModel.changeButtonText2("")
    gameplayViewModel.changeButtonText3("")
    gameplayViewModel.changeButtonText4("")
}
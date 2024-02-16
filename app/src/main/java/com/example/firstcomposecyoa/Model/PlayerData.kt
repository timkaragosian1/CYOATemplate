package com.example.firstcomposecyoa.Model

import android.content.Context
import android.content.res.Resources
import com.example.firstcomposecyoa.R
import com.example.firstcomposecyoa.ViewModel.PlayerViewModel

fun initPlayerData(playerViewModel: PlayerViewModel, context:Context) {
    playerViewModel.changePlayerName(getRandomHumanName("", context))
    playerViewModel.changeStrength(1)
    playerViewModel.changeIntelligence(1)
    playerViewModel.changeDexterity(1)
    playerViewModel.changeDefense(1)
    playerViewModel.changeCurrentHp(5)
    playerViewModel.changeMaxHp(5)
    playerViewModel.changeCurrentMp(3)
    playerViewModel.changeMaxMp(3)
    playerViewModel.changeLevel(1)
    playerViewModel.changeXp(0)
}

fun getRandomHumanName(gender:String, context: Context):String{
    var namesListId = R.array.list_of_human_neutral_names

    if (gender == "M"){
        namesListId = R.array.list_of_human_male_names
    } else if (gender == "F"){
        namesListId = R.array.list_of_human_female_names
    }
    val namesList = context.resources.getStringArray(namesListId)

    return namesList.random()
}

fun changePlayerDataExample(playerViewModel: PlayerViewModel, context:Context) {
    playerViewModel.changePlayerName("Billy Bob the 5th")
    playerViewModel.changeStrength(6)
    playerViewModel.changeIntelligence(9)
    playerViewModel.changeDexterity(7)
    playerViewModel.changeDefense(3)
    playerViewModel.changeCurrentHp(5)
    playerViewModel.changeMaxHp(100)
    playerViewModel.changeCurrentMp(5)
    playerViewModel.changeMaxMp(3000)
    playerViewModel.changeLevel(54)
    playerViewModel.changeXp(8009)
}
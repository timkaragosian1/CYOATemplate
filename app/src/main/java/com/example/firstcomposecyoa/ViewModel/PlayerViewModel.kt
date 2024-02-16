package com.example.firstcomposecyoa.ViewModel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PlayerViewModel(): ViewModel() {
    var playerName by mutableStateOf("")
        private set
    var strength by mutableStateOf(0)
        private set
    var intelligence by mutableStateOf(0)
        private set
    var dexterity by mutableStateOf(0)
        private set
    var defense by mutableStateOf(0)
        private set
    var currentHp by mutableStateOf(0)
        private set
    var maxHp by mutableStateOf(0)
        private set
    var currentMp by mutableStateOf(0)
        private set
    var maxMp by mutableStateOf(0)
        private set
    var level by mutableStateOf(0)
        private set
    var xp by mutableStateOf(0)
        private set


    fun changePlayerName(name:String){
        playerName = name
    }

    fun changeStrength(newValue:Int){
        strength = newValue
    }

    fun changeIntelligence(newValue:Int){
        intelligence = newValue
    }

    fun changeDexterity(newValue:Int){
        dexterity = newValue
    }

    fun changeDefense(newValue:Int){
        defense = newValue
    }

    fun changeCurrentHp(newValue:Int){
        currentHp = newValue
    }

    fun changeMaxHp(newValue:Int){
        maxHp = newValue
    }

    fun changeCurrentMp(newValue:Int){
        currentMp = newValue
    }

    fun changeMaxMp(newValue:Int){
        maxMp = newValue
    }

    fun changeLevel(newValue:Int){
        level = newValue
    }

    fun changeXp(newValue:Int){
        xp = newValue
    }
}
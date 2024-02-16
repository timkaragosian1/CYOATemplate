package com.example.firstcomposecyoa.ViewModel

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GameplayViewModel : ViewModel() {
    var eventName by mutableStateOf("")
        private set
    var eventTotalCount by mutableStateOf(0)
        private set
    var imageResId by mutableStateOf(0)
        private set
    var bodyText by mutableStateOf("")
        private set
    var button1Text by mutableStateOf("")
        private set
    var button2Text by mutableStateOf("")
        private set
    var button3Text by mutableStateOf("")
        private set
    var button4Text by mutableStateOf("")
        private set


    fun changeEventName(name:String){
        eventName = name
    }

    fun changeEventTotalCount(newValue:Int){
        eventTotalCount = newValue
    }

    fun changeImageResId(newValue:Int){
        imageResId = newValue
    }

    fun changeBodyText(newValue:String){
        bodyText = newValue
    }

    fun changeButtonText1(newValue:String){
        button1Text = newValue
    }

    fun changeButtonText2(newValue:String){
        button2Text = newValue
    }

    fun changeButtonText3(newValue:String){
        button3Text = newValue
    }

    fun changeButtonText4(newValue:String){
        button4Text = newValue
    }
}
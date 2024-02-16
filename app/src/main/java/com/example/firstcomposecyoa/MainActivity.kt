package com.example.firstcomposecyoa

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcomposecyoa.View.CYOAGameApp
import com.example.firstcomposecyoa.ui.theme.FirstComposeCYOATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeCYOATheme {
                CYOAGameApp(this)
            }
        }
    }
}


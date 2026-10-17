package com.example.fit30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.fit30.ui.FitnessApp
import com.example.fit30.ui.theme.Fit30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Fit30Theme {
                FitnessApp()
            }
        }
    }
}

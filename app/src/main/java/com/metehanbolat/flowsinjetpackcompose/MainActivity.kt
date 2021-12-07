package com.metehanbolat.flowsinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.flowsinjetpackcompose.ui.theme.FlowsInJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowsInJetpackComposeTheme {
                
            }
        }
    }
}

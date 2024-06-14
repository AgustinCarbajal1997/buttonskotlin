package com.example.buttonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.buttonsapp.ui.theme.ButtonsAppTheme
import com.example.buttonsapp.components.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // pongo = y no by porque en este caso quiero acceder al valor mediante .value
            val darkMode = remember {
                mutableStateOf(false)
            }
            ButtonsAppTheme(
                darkTheme = darkMode.value
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content(darkMode = darkMode)
                }

            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        FloatingAction()
    }
}


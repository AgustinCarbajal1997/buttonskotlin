package com.example.buttonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buttonsapp.ui.theme.ButtonsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentSize(Alignment.Center)
            ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BotonNormal()
        Space()
        BotonNormal2()
        Space()
        BotonTexto()
        Space()
        BotonOutline()
    }
}

@Composable
fun BotonOutline() {
   OutlinedButton(onClick = { /*TODO*/ }, border = BorderStroke(3.dp, Color.Blue)) {
       Text(text = "Mi boton", fontSize = 30.sp)
   }
}

@Composable
fun BotonNormal() {
    Button(onClick = {}, enabled = false) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}
@Composable
fun BotonNormal2() {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(
        containerColor = Color.Red
    )) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun BotonTexto() {
    TextButton(onClick = {}) {
        Text(text = "Mi boton", fontSize = 30.sp)
    }
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(10.dp))
}

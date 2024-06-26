package com.example.buttonsapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FloatingAction() {
    FloatingActionButton(
        onClick = {},
        containerColor = Color.Blue,
        contentColor = Color.White
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
            modifier = Modifier.size(30.dp)
        )

    }
}

@Composable
fun DarkMode(darkMode: MutableState<Boolean>) {
    Button(
        onClick = { darkMode.value = !darkMode.value }, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red
        )
    ) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "DarkMode")
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Darkmode", fontSize = 30.sp)
    }
}

@Composable
fun BotonSwitch() {
    var switched by remember {
        mutableStateOf(false)
    }
    Switch(checked = switched, onCheckedChange = { switched = it })
}

@Composable
fun BotonIcono() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            Icons.Filled.Home,
            contentDescription = "Icono",
            tint = Color.Red,
            modifier = Modifier.size(50.dp)
        )
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
    Button(
        onClick = {}, colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red
        )
    ) {
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
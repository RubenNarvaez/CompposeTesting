package com.myapp.compposetesting.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable

fun RubenComponent() {
    var name by rememberSaveable {
        mutableStateOf("Ruben")
    }
    Column(Modifier.fillMaxSize()) {
        TextField(value = name, onValueChange = { name = it })
        Text(text = "your name is $name", modifier = Modifier.testTag("textComponent1"))
        Text(text = "Pepe", modifier = Modifier.testTag("textComponent2"))

        Image(Icons.Default.Send, contentDescription = "superImage")

    }
}
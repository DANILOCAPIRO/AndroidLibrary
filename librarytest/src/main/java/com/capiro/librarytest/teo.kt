package com.capiro.librarytest

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TeoLibrary( algo : ()->Unit ) {
    Button(onClick = algo ) {
        Text("chupa monda")
    }
}

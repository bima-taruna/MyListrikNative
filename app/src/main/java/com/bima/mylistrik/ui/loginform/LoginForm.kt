package com.bima.mylistrik.ui.loginform

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginForm(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Field(label = "Email", type = KeyboardType.Email, isPassword = false, modifier = Modifier.padding(vertical = 8.dp))
        Field(label = "Password", type = KeyboardType.Password, isPassword = true)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    LoginForm()
}
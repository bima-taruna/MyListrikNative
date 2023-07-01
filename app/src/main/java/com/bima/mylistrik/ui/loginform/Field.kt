package com.bima.mylistrik.ui.loginform

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Field(
    modifier: Modifier = Modifier,
    label:String,
    type:KeyboardType,
    isPassword:Boolean
) {
    var text by rememberSaveable {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = {
            Text(text = label)
        },
        placeholder = {
            Text(text = label)
        },
        keyboardOptions = KeyboardOptions(keyboardType = type),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None
        ,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun FieldPreview() {
    Field(label = "Email", type = KeyboardType.Email, isPassword = false)
}


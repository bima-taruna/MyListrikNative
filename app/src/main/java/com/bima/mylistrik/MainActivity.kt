@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.bima.mylistrik

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.bima.mylistrik.ui.loginform.Field
import com.bima.mylistrik.ui.loginform.LoginForm
import com.bima.mylistrik.ui.theme.MyListrikTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginActivity()
        }
    }
}

@Composable
fun LoginActivity() {
    MyListrikTheme {
        Scaffold(){padding->
            LoginForm(Modifier.padding(padding))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    MyListrikTheme {
        Scaffold(){padding->
            LoginForm(Modifier.padding(padding))
        }
    }
}
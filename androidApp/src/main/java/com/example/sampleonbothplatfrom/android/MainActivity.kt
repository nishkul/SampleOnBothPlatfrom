package com.example.sampleonbothplatfrom.android

import LoginField
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleonbothplatfrom.Greeting
import com.example.sampleonbothplatfrom.LoginForm
import com.example.sampleonbothplatfrom.compose.PasswordField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Column(modifier = Modifier) {
//                            GreetingView(Greeting().greet())
                            LoginForm()
                        }
                    }
                }

            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}

@Preview
@Composable
fun LoginPreview() {
    MyApplicationTheme {
        LoginField(value = "", modifier = Modifier, onChange = {})
    }
}

@Preview
@Composable
fun PasswordPreview() {
    MyApplicationTheme {
        PasswordField(value = "", modifier = Modifier, onChange = {}, submit = {})
    }
}

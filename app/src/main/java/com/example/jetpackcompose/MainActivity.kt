package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalData(name = "Angel")
        }
    }

    @Composable
    private fun PersonalData(name: String) {
        MaterialTheme() {

            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MyImage()
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Mi nombre es $name", style = MaterialTheme.typography.h6, color = MaterialTheme.colors.error)
                Text(text = "Estoy aprendiendo jetpack Compose", style = MaterialTheme.typography.h6)
                Text(text = "Lo organizo en columna", style = MaterialTheme.typography.h6, color = MaterialTheme.colors.primaryVariant)
            }
        }
    }
    @Composable
    private fun MyImage(){
        Image(
            painter = painterResource(id = R.drawable.jetlogo),
            contentDescription = "Jetpack Compose logo",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )
    }

    @Preview
    @Composable
    fun PreviewPersonalData() {
        PersonalData(name = "Angel")
    }
}


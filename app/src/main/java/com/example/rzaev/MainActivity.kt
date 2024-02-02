package com.example.rzaev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Rzaev.ui.theme.RzaevTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.Image
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RzaevTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                Image(
                    bitmap = ImageBitmap.imageResource(R.drawable.img),
                    contentDescription = "пятак"
                )




            }


        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Добро пожаловать!",
            modifier = modifier.fillMaxWidth(1f),
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )
        Text(text = "Войдите, чтобы пользоваться функциями приложения", modifier = Modifier.fillMaxWidth(1f),  fontSize=22.sp, textAlign = TextAlign.Justify)


        Text(text = "Вход по Email", modifier = Modifier.fillMaxWidth(1f),  fontSize=22.sp, textAlign = TextAlign.Start, color = Color.Gray)

    }



}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RzaevTheme {
        Greeting("Android")
    }
}

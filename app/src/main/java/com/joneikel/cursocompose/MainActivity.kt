package com.joneikel.cursocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.joneikel.cursocompose.ui.theme.CursoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.fragata),
                    contentDescription = null,

                    )
                Column {
                    nameCard()
                    mensageCard(name = "Joneikel")
                }
            }


        }
    }
}

@Composable
fun nameCard(name: String = "Joneikel") {
    Text(text = "$name")

}

@Composable
fun mensageCard(name: String) {
    Text(text = "Hola Mundo con compose $name")
}

@Preview
@Composable
fun PreviewMensageCard() {
    mensageCard(name = "Joneikel")
}

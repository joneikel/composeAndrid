package com.joneikel.cursocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joneikel.cursocompose.ui.theme.CursoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            Row(modifier = Modifier.padding(all = 16.dp)) {
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    painter = painterResource(id = R.drawable.fragata),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)

                )
                Spacer(modifier = Modifier.width(5.dp))
                Column {
                    nameCard()
                    Spacer(modifier = Modifier.height(10.dp))
                    mensageCard(Mensaje("Joneikel", "Mensaje de Joneikel"))

                }
            }


        }
    }
}

data class Mensaje(val name: String, val desc: String)

@Composable
fun nameCard(name: String = "Joneikel") {
    Text(text = "$name")

}

@Composable
fun mensageCard(msg: Mensaje) {
    Text(msg.name)
    Text(msg.desc)
}

@Preview
@Composable
fun PreviewMensageCard() {
    mensageCard(msg = Mensaje("Joneikel", "Mensaje de Joneikel")    )
}

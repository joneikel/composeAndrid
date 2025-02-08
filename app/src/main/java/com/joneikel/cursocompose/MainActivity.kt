package com.joneikel.cursocompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joneikel.cursocompose.ui.theme.CursoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            CursoComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column {
                    mensageCard(
                        Mensaje(
                            "Joneikel",
                            "Mis saludos campeon, vas para la reunion? a que hora es? yo no podre ir, estoy en otra reunion"
                        )
                    )
                    mensageCard(
                        Mensaje(
                            "Joneikel",
                            "Por favor avisarme cuando termine tu reunion"
                        )
                    )
                    mensageCard(
                        Mensaje(
                            "Joneikel",
                            "Me puedes dar una sintesis de la reunion?"
                        )
                    )
                    mensageCard(
                        Mensaje(
                            "Joneikel",
                            "Lista de puntos a seguir: \n" +
                                    "1.- Planificar\n" +
                                    "2.- Organizar\n" +
                                    "3.- Delegar\n" +
                                    "4.- Terminar\n"
                        )
                    )}

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
    Row(modifier = Modifier.padding(all = 16.dp)) {
        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(id = R.drawable.fragata),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)

        )
        Spacer(modifier = Modifier.width(5.dp))
        Column {
            Text(
                msg.name,
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(10.dp))
            Surface(shape = MaterialTheme.shapes.medium, shadowElevation = 1.dp) {
                Text(
                    text = msg.desc,
                    modifier = Modifier.padding(all = 4.dp),
                    style = MaterialTheme.typography.bodySmall
                )
            }

        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)

@Preview
@Composable
fun PreviewMensageCard() {
    CursoComposeTheme {
        Surface {
            mensageCard(
                Mensaje(
                    "Joneikel",
                    "Mis saludos campeon, vas para la reunion? a que hora es? yo no podre ir, estoy en otra reunion"
                )
            )
        }
    }
}

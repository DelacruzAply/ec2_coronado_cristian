package pe.edu.idat.ec2_coronado

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainMenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.tierra),
            contentDescription = "Globe Image"
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = { /*TODO: Handle Registro click*/ }) {
            Text(text = "REGISTRO")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO: Handle Formulario click*/ }) {
            Text(text = "FORMULARIO")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO: Handle Listado click*/ }) {
            Text(text = "LISTADO")
        }
    }
}

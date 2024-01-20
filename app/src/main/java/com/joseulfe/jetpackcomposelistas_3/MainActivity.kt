package com.joseulfe.jetpackcomposelistas_3

import android.content.res.Configuration
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.joseulfe.jetpackcomposelistas_3.ui.theme.JetpackComposeListas_3Theme

private val messages:List<MyMessage> = listOf(
    MyMessage("Hola JetpackCompose 1", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 2",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 3", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 4",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 5", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 6",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 7", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 8",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 9", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 10",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 11", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 12",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 13", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 14",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 15", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 16",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 17", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 18",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 19", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 20",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 21", "¿Preparado?"),
    MyMessage("Hola JetpackCompose 22",  "¿Preparado?"),
    MyMessage("Hola JetpackCompose 23", "¿Preparado?"),


)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            JetpackComposeListas_3Theme {
                MyMessages(messages)
            }

        }

    }
}




data class MyMessage(val title: String, val body: String)

@Composable
fun MyMessages(messages: List<MyMessage>){
    LazyColumn(){
        items(messages){ message ->
            MyComponent(message)
        }
    }


}

@Composable
fun MyComponent(message: MyMessage){
    Row(modifier = Modifier
        .background(MaterialTheme.colorScheme.background)
        .padding(8.dp)) {
        MyImage()
        MyTexts(message)
    }
}

@Composable
fun MyImage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        contentDescription = "Mi imagen de prueba",
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}

@Composable
fun MyTexts(message: MyMessage){
    Column (modifier = Modifier.padding(start = 8.dp)) {
        MyText(
            message.title,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))
        MyText(
            message.body,
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.bodySmall)
    }

}

@Composable
fun MyText(text:String, color: Color, style: TextStyle){
    Text(text, color = color, style = style)
}

@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewComponent(){
    JetpackComposeListas_3Theme {
        MyMessages(messages)

        }

    }

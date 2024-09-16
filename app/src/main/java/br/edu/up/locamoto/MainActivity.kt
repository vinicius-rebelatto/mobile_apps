package br.edu.up.locamoto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.up.locamoto.ui.theme.LocaMotoTheme



@Preview
@Composable
fun MeuApp(){

    val state = rememberDrawerState(
        initialValue = DrawerValue.Open
    )

    ModalNavigationDrawer(
        drawerState = state,
        drawerContent = {
            Column (
                modifier = Modifier
                    .width(300.dp)
                    //.fillMaxWidth()
                    .fillMaxHeight()
                    .background(Color.Cyan)
            ){
                Text(text = "Item 1")
                Text(text = "Item 2")
                Text(text = "Item 3")
            }
        },
        content = {
            PlannerApp()
        }
    )
}
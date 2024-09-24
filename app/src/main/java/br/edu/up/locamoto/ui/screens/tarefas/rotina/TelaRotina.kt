package br.edu.up.locamoto.ui.screens.tarefas.rotina

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import br.edu.up.locamoto.ui.screens.util.PlannerTopBar


@Composable
fun TelaRotina(state: DrawerState, bottonNavBar: @Composable ()-> Unit){
    Scaffold(
        topBar = { PlannerTopBar(state) },
        content = { iPad -> iPad
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Tela rotina", fontSize = 50.sp)
            }
        },
        //floatingActionButton = { FloatingButton() },
        bottomBar = { bottonNavBar() }
    )
}

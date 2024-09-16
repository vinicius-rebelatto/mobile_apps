package br.edu.up.locamoto

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    interactionSource: MutableInteractionSource? = null,
    content: @Composable () -> Unit
): Unit {
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PlannerApp(){
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = {
                Row {

                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        modifier = Modifier
                            .size(40.dp)
                            .fillMaxHeight()
                            .padding(8.dp)
                            .background(Color.Yellow)
                    )
                    Text(text = "Planner",
                        fontWeight = FontWeight(600),
                        color = Color.White,
                        modifier = Modifier
                            .padding(8.dp)


                    )}
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Menu",
                            modifier = Modifier
                                .size(40.dp)
                                .fillMaxHeight()
                                .padding(8.dp)
                                .background(Color.Yellow)
                        )
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Menu",
                            modifier = Modifier
                                .size(40.dp)
                                .fillMaxHeight()
                                .padding(8.dp)
                                .background(Color.Yellow)
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(Color(0xFF2196F3))
            )
        }) { innerPadding ->
        Text(text = "Planner", Modifier.padding(innerPadding))
    }
}
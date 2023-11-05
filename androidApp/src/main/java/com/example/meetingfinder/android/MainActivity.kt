package com.example.meetingfinder.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.res.stringResource
import com.example.meetingfinder.android.ui.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView {
                TopAppBar(
                    title = {
                        when (it) {
                            0 -> Text(text = stringResource(R.string.world_clocks))
                            else -> Text(text = stringResource(R.string.findmeeting))
                        }
                    }, backgroundColor = MaterialTheme.colors.primary
                )
            }
        }
    }
}
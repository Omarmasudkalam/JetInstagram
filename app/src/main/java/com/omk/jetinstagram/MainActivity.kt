package com.omk.jetinstagram

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.omk.jetinstagram.ui.MainScreen
import com.omk.jetinstagram.ui.theme.JetInstagramTheme

class MainActivity : AppCompatActivity() {

  @ExperimentalFoundationApi
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    this.setContent {
      JetInstagramTheme {
        Surface(color = MaterialTheme.colors.background) {
          MainScreen()
        }
      }
    }
  }

}
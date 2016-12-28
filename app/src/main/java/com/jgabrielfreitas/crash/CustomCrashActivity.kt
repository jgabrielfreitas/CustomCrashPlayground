package com.jgabrielfreitas.crash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class CustomCrashActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_custom_crash)
  }

  override fun onBackPressed() {
    super.onBackPressed()
    startActivity(Intent(this, MainActivity::class.java))
  }
}

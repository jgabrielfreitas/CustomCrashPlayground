package com.jgabrielfreitas.crash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cat.ereza.customactivityoncrash.CustomActivityOnCrash

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //Install CustomActivityOnCrash
    CustomActivityOnCrash.install(this);

  }
}

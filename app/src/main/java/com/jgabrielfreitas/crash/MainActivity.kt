package com.jgabrielfreitas.crash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cat.ereza.customactivityoncrash.CustomActivityOnCrash
import kotlinx.android.synthetic.main.activity_main.crashButton

class MainActivity : AppCompatActivity() {


  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //Install CustomActivityOnCrash
    CustomActivityOnCrash.install(this)
    CustomActivityOnCrash.setShowErrorDetails(false)
    CustomActivityOnCrash.setRestartActivityClass(CustomCrashActivity::class.java)

    crashButton.setOnClickListener { throw RuntimeException("FUUUUUCK") }
  }
}

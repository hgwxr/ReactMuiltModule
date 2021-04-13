package com.hgwxr.reactmuiltmodule

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.facebook.soloader.SoLoader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SoLoader.init(this,  /* native exopackage */false)
        findViewById<View>(R.id.btnSample1)
            .setOnClickListener {
                ContainerActivity.start(this, "rnsample1", "RnSample1")
            }
        findViewById<View>(R.id.btnSample2)
            .setOnClickListener {
                ContainerActivity.start(this, "rnsample2", "RnSample2")
            }
    }
}
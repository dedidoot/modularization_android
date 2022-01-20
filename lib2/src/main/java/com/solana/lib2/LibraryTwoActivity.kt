package com.solana.lib2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_library_two.*

class LibraryTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_two)
        btn1.setOnClickListener {
            val intent = Intent().apply {
                setClassName(this@LibraryTwoActivity, "com.solana.lib1.LibraryOneActivity")
            }
            startActivity(intent)
        }
    }
}
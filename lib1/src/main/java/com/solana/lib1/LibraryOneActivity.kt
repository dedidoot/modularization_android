package com.solana.lib1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.solana.lib2.LibraryTwoActivity
import kotlinx.android.synthetic.main.activity_library_one.*

class LibraryOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_one)

        btn2.setOnClickListener {
            startActivity(Intent(this, LibraryTwoActivity::class.java))
        }
    }
}
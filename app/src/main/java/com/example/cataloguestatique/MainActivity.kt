package com.example.cataloguestatique


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCatalogue = findViewById<Button>(R.id.btnCatalogue)

        btnCatalogue.setOnClickListener {
            val intent = Intent(this, CatalogueActivity::class.java)
            startActivity(intent)
        }
    }
}

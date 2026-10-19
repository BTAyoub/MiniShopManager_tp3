
package com.example.cataloguestatique


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CatalogueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        findViewById<Button>(R.id.btnProduit1)
            .setOnClickListener {
                ouvrirOptions("Chaussures")
            }

        findViewById<Button>(R.id.btnProduit2)
            .setOnClickListener {
                ouvrirOptions("Accessoires")
            }

        findViewById<Button>(R.id.btnProduit3)
            .setOnClickListener {
                ouvrirOptions("Cosmétiques")
            }
    }

    private fun ouvrirOptions(categorie: String) {
        val intent = Intent(this, OptionsActivity::class.java)
        intent.putExtra("categorie", categorie)
        startActivity(intent)
    }
}

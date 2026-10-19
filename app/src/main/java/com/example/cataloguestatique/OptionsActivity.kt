package com.example.cataloguestatique


import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val categorie = intent.getStringExtra("categorie") ?: "Produits"

        val titre = findViewById<TextView>(R.id.txtTitreOptions)
        val listView = findViewById<ListView>(R.id.listViewOptions)

        titre.text = "Options : $categorie"

        val options = when (categorie) {
            "Chaussures" -> arrayOf(
                "Nike",
                "Adidas",
                "Puma"
            )

            "Accessoires" -> arrayOf(
                "Montre",
                "Lunettes",
                "Sac"
            )

            "Cosmétiques" -> arrayOf(
                "Parfum",
                "Crème hydratante",
                "Nettoyant visage"
            )

            else -> arrayOf("Option 1", "Option 2")
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            options
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val optionChoisie = options[position]

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("categorie", categorie)
            intent.putExtra("option", optionChoisie)

            startActivity(intent)
        }
    }
}

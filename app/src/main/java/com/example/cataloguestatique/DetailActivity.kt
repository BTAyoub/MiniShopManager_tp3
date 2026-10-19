package com.example.cataloguestatique


import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val categorie = intent.getStringExtra("categorie") ?: ""
        val option = intent.getStringExtra("option") ?: ""

        val titre = findViewById<TextView>(R.id.txtDetailTitre)
        val description =
            findViewById<TextView>(R.id.txtDetailDescription)
        val prix = findViewById<TextView>(R.id.txtDetailPrix)
        val image = findViewById<ImageView>(R.id.imgDetail)
        val btnRetour = findViewById<Button>(R.id.btnRetourCatalogue)

        titre.text = option

        when (categorie) {
            "Chaussures" -> image.setImageResource(
                R.drawable.chaussures
            )

            "Accessoires" -> image.setImageResource(
                R.drawable.accessoires
            )

            "Cosmétiques" -> image.setImageResource(
                R.drawable.cosmetiques
            )
        }

        when (option) {
            "Nike" -> {
                description.text =
                    "Chaussures de sport adaptées aux activités sportives."
                prix.text = "Prix indicatif : 250 DT"
            }

            "Adidas" -> {
                description.text =
                    "Chaussures sportives pour un usage quotidien."
                prix.text = "Prix indicatif : 230 DT"
            }

            "Puma" -> {
                description.text =
                    "Chaussures confortables pour le sport et les loisirs."
                prix.text = "Prix indicatif : 200 DT"
            }

            "Montre" -> {
                description.text =
                    "Montre pour consulter l'heure au quotidien."
                prix.text = "Prix indicatif : 80 DT"
            }

            "Lunettes" -> {
                description.text =
                    "Accessoire pratique pour compléter votre style."
                prix.text = "Prix indicatif : 50 DT"
            }

            "Sac" -> {
                description.text =
                    "Sac pratique pour transporter vos affaires."
                prix.text = "Prix indicatif : 70 DT"
            }

            "Parfum" -> {
                description.text =
                    "Parfum pour une utilisation quotidienne."
                prix.text = "Prix indicatif : 90 DT"
            }

            "Crème hydratante" -> {
                description.text =
                    "Crème destinée à hydrater la peau."
                prix.text = "Prix indicatif : 35 DT"
            }

            "Nettoyant visage" -> {
                description.text =
                    "Produit destiné au nettoyage du visage."
                prix.text = "Prix indicatif : 30 DT"
            }

            else -> {
                description.text = "Détails du produit sélectionné."
                prix.text = "Prix non disponible"
            }
        }

        btnRetour.setOnClickListener {
            finish()
        }
    }
}

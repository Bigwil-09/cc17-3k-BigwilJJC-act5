package com.example.artspace

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var currentIndex: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageList = arrayOf(
            R.drawable.god1,
            R.drawable.god2,
            R.drawable.god3,
            R.drawable.god4,
            R.drawable.god5
        )

        val descriptionList = arrayOf(
            "The God of Freedom, The Anemo Archon, Barbatos (Venti)",
            "The God of Contract, The Geo Archon, Morax (Zhongli)",
            "The God of Eternity, The Electro Archon, Beelzebub (Ei)",
            "The God of Wisdom, The Dendro Archon, Buer (Nahida)",
            "The God of Justice, The Hydro Archon, Focalor/Furina"
        )

        val imageView = findViewById<ImageView>(R.id.imageView)
        val description = findViewById<TextView>(R.id.description)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val prevButton = findViewById<Button>(R.id.prevButton)

        imageView.setImageResource(imageList[currentIndex])
        description.text = descriptionList[currentIndex]

        nextButton.setOnClickListener {
            if (currentIndex < imageList.size - 1) {
                currentIndex++
                imageView.setImageResource(imageList[currentIndex])
                description.text = descriptionList[currentIndex]

    }
}
        prevButton.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                imageView.setImageResource(imageList[currentIndex])
                descriptionList[currentIndex].also { description.text = it }
            }
        }
    }
}
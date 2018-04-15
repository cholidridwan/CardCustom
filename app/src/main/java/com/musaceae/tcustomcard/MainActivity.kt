package com.musaceae.tcustomcard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.setText("wrwer")

        card_one.cardText.setText("duck")
        val c = applicationContext
        val id = c.resources.getIdentifier("drawable/" + "tiger", null, c.packageName)
        card_one.cardImage.setImageResource(id)
        card_one.cardButton.setText("duck")

        card_two.cardText.setText("tiger")
        val idr = c.resources.getIdentifier("drawable/" + "duck", null, c.packageName)
        card_two.cardImage.setImageResource(idr)
        card_two.cardButton.setText("tiger")
    }
}

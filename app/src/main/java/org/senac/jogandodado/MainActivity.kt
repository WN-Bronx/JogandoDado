package org.senac.jogandodado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var dado : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dado = findViewById<ImageView>(R.id.iViewDado)
    }

    fun jogarDado(view: View){
        val resetDado = Random.nextInt(1,7)

        var jdado: Int = R.drawable.dice_1;

        when (resetDado) {
            1 -> {
                jdado = R.drawable.dice_1
            }
        }
        when (resetDado) {
            2 -> {
                jdado = R.drawable.dice_2
            }
        }
        when (resetDado) {
            3 -> {
                jdado = R.drawable.dice_3
            }
        }
        when (resetDado) {
            4 -> {
                jdado = R.drawable.dice_4
            }
        }
        when (resetDado) {
            5 -> {
                jdado = R.drawable.dice_5
            }
        }
        when (resetDado) {
            6 -> {
                jdado = R.drawable.dice_6
            }
        }

        dado.setImageResource(jdado)
    }
}
package com.example.apapapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtcom = findViewById<TextView>(R.id.txtCom)
        val txtresult = findViewById<TextView>(R.id.txtresult)
        val btnscissors = findViewById<ImageButton>(R.id.imbtnscissor)
        val btnrock = findViewById<ImageButton>(R.id.imbtnrock)
        val btnpaper = findViewById<ImageButton>(R.id.imbtnpaper)

        btnrock.setOnClickListener{
            val icomplay = Random.nextInt(3) + 1


            when(icomplay){
                1->{
                    txtcom.setText(R.string.scissors)
                    txtresult.setText(getString(R.string.win))
                }
                2->{
                    txtcom.setText(R.string.rock)
                    txtresult.setText(getString(R.string.draw))
                }
                3->{
                    txtcom.setText(R.string.paper)
                    txtresult.setText(getString(R.string.lose))
                }
            }
        }
        btnscissors.setOnClickListener{
            val icomplay = Random.nextInt(3) + 1


            when(icomplay){
                1->{
                    txtcom.setText(R.string.scissors)
                    txtresult.setText(getString(R.string.draw))
                }
                2->{
                    txtcom.setText(R.string.rock)
                    txtresult.setText(getString(R.string.lose))
                }
                3->{
                    txtcom.setText(R.string.paper)
                    txtresult.setText(getString(R.string.win))
                }
            }
        }
        btnpaper.setOnClickListener{
            val icomplay = Random.nextInt(3) + 1


            when(icomplay){
                1->{
                    txtcom.setText(R.string.scissors)
                    txtresult.setText(getString(R.string.lose))
                }
                2->{
                    txtcom.setText(R.string.rock)
                    txtresult.setText(getString(R.string.win))
                }
                3->{
                    txtcom.setText(R.string.paper)
                    txtresult.setText(getString(R.string.draw))
                }
            }
        }

    }
}
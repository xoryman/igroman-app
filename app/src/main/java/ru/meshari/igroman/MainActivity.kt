package ru.meshari.igroman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTruthOrDrink.setOnClickListener {
            val intent = Intent(this, TordActivity::class.java)
            startActivity(intent)
        }

        btnINeverDoIt.setOnClickListener {
            val intent = Intent(this, NeverActivity::class.java)
            startActivity(intent)
        }

        btnCrocodile.setOnClickListener {
            val intent = Intent(this, CrocodileActivity::class.java)
            startActivity(intent)
        }
        btnMovie.setOnClickListener {
            Toast.makeText(this, "Игра временно недоступна", Toast.LENGTH_SHORT).show()
        }

    }

}

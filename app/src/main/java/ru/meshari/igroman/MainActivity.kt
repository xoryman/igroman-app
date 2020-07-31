package ru.meshari.igroman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truthCount.text = resources.getString(R.string.card_count) + " " + resources.getStringArray(R.array.questions).size.toString()
        truthPayers.text = resources.getString(R.string.player_count) + " 2+"
        truthAlco.text = resources.getString(R.string.alcohol) + " да"

        neverCount.text = resources.getString(R.string.card_count) + " " + resources.getStringArray(R.array.strings).size.toString()
        neverPayers.text = resources.getString(R.string.player_count) + " 3+"
        neverAlco.text = resources.getString(R.string.alcohol) + " да"

        aliasCount.text = resources.getString(R.string.card_count) + " " + resources.getStringArray(R.array.words).size.toString()
        aliasPayers.text = resources.getString(R.string.player_count) + " 4+"
        aliasAlco.text = resources.getString(R.string.alcohol) + " нет"

        crocoCount.text = resources.getString(R.string.card_count) + " " + resources.getStringArray(R.array.words).size.toString()
        crocoPayers.text = resources.getString(R.string.player_count) + " 2+"
        crocoAlco.text = resources.getString(R.string.alcohol) + " нет"

        movieCount.text = resources.getString(R.string.card_count) + " 0"
        moviePayers.text = resources.getString(R.string.player_count) + " 4+"
        movieAlco.text = resources.getString(R.string.alcohol) + " нет"

        truthDiv.setOnClickListener {
            val intent = Intent(this, TordActivity::class.java)
            startActivity(intent)
        }

        neverDiv.setOnClickListener {
            val intent = Intent(this, NeverActivity::class.java)
            startActivity(intent)
        }

        aliasDiv.setOnClickListener {
            val intent = Intent(this, AliasActivity::class.java)
            startActivity(intent)
        }

        crocoDiv.setOnClickListener {
            val intent = Intent(this, CrocodileActivity::class.java)
            startActivity(intent)
        }

        movieDiv.setOnClickListener {
            Toast.makeText(this, "Игра еще в разработке", Toast.LENGTH_LONG).show()
        }


    }

}

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

        mainGameCount1.text = "Вопросов: " + resources.getStringArray(R.array.questions).size.toString()
        mainGameCount2.text = "Вопросов: " + resources.getStringArray(R.array.strings).size.toString()
        mainGameCount3.text = "Слов: " + resources.getStringArray(R.array.words).size.toString()

        mainGameDiv1.setOnClickListener {
            val intent = Intent(this, TordActivity::class.java)
            startActivity(intent)
        }

        mainGameDiv2.setOnClickListener {
            val intent = Intent(this, NeverActivity::class.java)
            startActivity(intent)
        }

        mainGameDiv3.setOnClickListener {
            val intent = Intent(this, CrocodileActivity::class.java)
            startActivity(intent)
        }

        mainGameDiv4.setOnClickListener {
            Toast.makeText(this, "Игра еще в разработке", Toast.LENGTH_SHORT).show()
        }


    }

}

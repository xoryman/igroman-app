package ru.meshari.igroman

import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_crocodile.*
import java.sql.Time

class CrocodileActivity : AppCompatActivity() {

    var words = ArrayList<String>() // Массив слов

    // ON CREATE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crocodile)
        // Инициализируем массив строк
        words = resources.getStringArray(R.array.words).toCollection(ArrayList())
        // Вешаем слушателя на кнопку
        crocodileTwWord.setOnClickListener {
            crocodileTwWord.text = getWord()
        }

    }
    // Метод получения нового слова
    private fun getWord(): String {
        if (words.size <= 0) return "Слова закончились :("
        val rand = (0 until words.size).random()
        val word = words[rand]
        words.removeAt(rand)
        return word
    }
}

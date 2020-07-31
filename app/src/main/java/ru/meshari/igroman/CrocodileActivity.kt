package ru.meshari.igroman

import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_crocodile.*

class CrocodileActivity : AppCompatActivity() {

    var words = ArrayList<String>() // Массив слов

    // ON CREATE
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crocodile)
        // Инициализируем массив строк
        words = resources.getStringArray(R.array.words).toCollection(ArrayList())
        // Вешаем слушателя на кнопку
        crocodileBg.setOnClickListener {
            crocodileTwWord.gravity = Gravity.CENTER
            crocodileTwWord.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
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

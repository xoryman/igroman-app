package ru.meshari.igroman

import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_alias.*

class AliasActivity : AppCompatActivity() {

    var aliases = ArrayList<String>() // Массив слов

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alias)

        // Инициализируем массив строк
        aliases = resources.getStringArray(R.array.words).toCollection(ArrayList())
        // Вешаем слушателя на кнопку
        aliasBg.setOnClickListener {
            aliasTwWord.gravity = Gravity.CENTER
            aliasTwWord.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
            aliasTwWord.text = getAlias()
        }

    }

    // Метод получения нового слова
    private fun getAlias(): String {
        if (aliases.size <= 0) return "Слова закончились :("
        val rand = (0 until aliases.size).random()
        val word = aliases[rand]
        aliases.removeAt(rand)
        return word
    }
}
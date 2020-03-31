package ru.meshari.igroman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_never.*

class NeverActivity : AppCompatActivity() {

    private var strings = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_never)

        //@TODO: Вопросы для игры
        strings = resources.getStringArray(R.array.strings).toCollection(ArrayList())

        neverBg.setOnClickListener {
            neverTwChange.text = getString()
        }
    }

    private fun getString(): String {
        if (strings.size <= 0) return "Вопросы закончились :("
        val rand = (0 until strings.size).random()
        val str = strings[rand]
        strings.removeAt(rand)
        return str
    }
}

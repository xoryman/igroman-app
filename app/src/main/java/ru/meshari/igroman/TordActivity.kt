package ru.meshari.igroman

import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tord.*

class TordActivity : AppCompatActivity() {

    private var questions = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tord)

        questions = resources.getStringArray(R.array.questions).toCollection(ArrayList())
        twCount.text = "Вопросов: ${questions.size}"

        tordBg.setOnClickListener {
            tordTw.text = getQuestion()
            tordTw.setTextSize(TypedValue.COMPLEX_UNIT_SP, 26F)
            tordTw.gravity = Gravity.CENTER
            twCount.text = "Вопросов: ${questions.size}"
        }
    }

    private fun getQuestion(): String {
        if (questions.size <= 0) return "Вопросы закончились :("
        val rand = (0 until questions.size).random()
        val str = questions[rand]
        questions.removeAt(rand)
        return str
    }

}

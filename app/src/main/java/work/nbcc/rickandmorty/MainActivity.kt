package work.nbcc.rickandmorty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val questionBank = listOf(
        Question(R.string.question_1, false),
        Question(R.string.question_2, true),
        Question(R.string.question_3, true),
        Question(R.string.question_4, false),
        Question(R.string.question_5, false),
        Question(R.string.question_6, true),
        Question(R.string.question_7, false),
        Question(R.string.question_8, true),
        Question(R.string.question_9, false),
        Question(R.string.question_10, false),
        Question(R.string.question_11, false),
        Question(R.string.question_12, true),
        Question(R.string.question_13, false),
        Question(R.string.question_14, true),
        Question(R.string.question_15, false),
        Question(R.string.question_16, false),
        Question(R.string.question_17, true),
        Question(R.string.question_18, false),
        Question(R.string.question_19, false),
        Question(R.string.question_20, true))

    private var questionIndex = 0
    private lateinit var questionView : TextView
    private lateinit var nextButton: ImageButton
    private lateinit var lastButton: ImageButton
    private lateinit var trueButton:Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionView = findViewById(R.id.questions_view)
        questionView.setText(questionBank[questionIndex].textResId)


        trueButton = findViewById(R.id.button_True)
        trueButton.setOnClickListener{
            if(questionBank[questionIndex].answer){
                Toast.makeText(applicationContext, "You are right!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "You are wrong!",Toast.LENGTH_SHORT).show()
            }
        }

        falseButton = findViewById(R.id.button_False)
        falseButton.setOnClickListener{
            if(questionBank[questionIndex].answer){
                Toast.makeText(applicationContext, "You are right!",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "You are wrong!",Toast.LENGTH_SHORT).show()
            }
        }

        nextButton = findViewById(R.id.imageButton_next)
        nextButton.setOnClickListener{
            questionIndex = (questionIndex + 1) % 20
            questionView.setText(questionBank[questionIndex].textResId)
        }

        lastButton = findViewById(R.id.imageButton_previous)
        lastButton.setOnClickListener{
            questionIndex = (questionIndex + 19) % 20
            questionView.setText(questionBank[questionIndex].textResId)
        }
    }


}

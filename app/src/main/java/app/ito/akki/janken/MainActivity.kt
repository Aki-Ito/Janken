package app.ito.akki.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener{
            player.text = "あなたの手はグーです"
            val number:Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133616)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#ffd900"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133617)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133618)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }

        chokiButton.setOnClickListener{
            val number: Int = Random.nextInt(3)
            player.text = "あなたの手はチョキです"
            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133616)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#ffd900"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133617)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133618)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }

        paaButton.setOnClickListener{
            val number: Int = Random.nextInt(3)
            player.text = "あなたの手はパーです"
            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133616)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#ffd900"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133617)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#f44336"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.sozai_image_133618)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                }
            }
        }
    }
}
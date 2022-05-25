package ork.liesa.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image4Activity : AppCompatActivity() {
    lateinit var btnPrev4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image4)
        btnNext4=findViewById(R.id.btnPrev4)
        btnNext4.setOnClickListener {
            val intent= Intent(this, Image3Activity::class.java)
            startActivity(intent)
        }
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this, Image5Activity::class.java)
            startActivity(intent)
        }
    }
}
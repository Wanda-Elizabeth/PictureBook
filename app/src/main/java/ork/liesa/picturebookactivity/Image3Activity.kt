package ork.liesa.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image3Activity : AppCompatActivity() {
    lateinit var btnPrev3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image3)
        btnPrev3=findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            val intent= Intent(this, Image2Activity::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent= Intent(this, Image4Activity::class.java)
            startActivity(intent)
        }
    }
}
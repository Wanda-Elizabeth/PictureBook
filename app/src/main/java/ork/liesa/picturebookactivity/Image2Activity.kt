package ork.liesa.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Image2Activity : AppCompatActivity() {
        lateinit var btnPrev1:Button
        lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image2)
        btnPrev1=findViewById(R.id.btnPrev1)
        btnPrev1.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
           startActivity(intent)
       }
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent= Intent(this, Image3Activity::class.java)
            startActivity(intent)
        }

    }
}
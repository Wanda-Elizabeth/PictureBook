package ork.liesa.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPic:Button
    lateinit var  btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPic=findViewById(R.id.btnPic)
        btnPic.setOnClickListener {
            val intent= Intent(this, Image2Activity::class.java)
            startActivity(intent)
        }

    }
}

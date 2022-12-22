package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* ใน Subclass เราโอเวอร์ไรด์สมาชิกตัวใดไปแล้ว แต่ต้องการกลับไปใช้รูปแบบเดิมใน
   Superclass ให้อ้างถึงสมาชิกตัวนั้นด้วยคีย์เวิร์ด super  */
        setContentView(R.layout.activity_main)
        cmdShow.setOnClickListener{ view ->
            tvOutput.text = "สวัสดี Android-Kotlin"
            Toast.makeText(this, "สวัสดี Android-Kotlin", Toast.LENGTH_LONG).show()
        }
        fabShow.setOnClickListener {view ->
            Snackbar.make(view, "Hello Snackbar", Snackbar.LENGTH_LONG).show()
        }
    }
}
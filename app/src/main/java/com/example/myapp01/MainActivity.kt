package com.example.myapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
    }
    /*
    *  เมธอด onCreate() ใน class MainActivity ถูกสั่งให้ทำงานเป็นลำดับแรกโดย
    * อัตโนมัติ
    * เมธอด setContentView() สั่งให้ใช้ส่วนแสดงผลที่ชื่อว่า activity_main.xml แสดง
    * ออกมาเป็นหน้าจอแรก (setContentView(R.layout.activity_main))
    *
    *
    *
    *  */
}
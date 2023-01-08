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
//        cmdShow.setOnClickListener{ view ->
//            tvOutput.text = "สวัสดี Android-Kotlin"
//            Toast.makeText(this, "สวัสดี Android-Kotlin", Toast.LENGTH_LONG).show()
//        }
//        fabShow.setOnClickListener {view ->
//            Snackbar.make(view, "Hello Snackbar", Snackbar.LENGTH_LONG).show()
//        }
    }
    /*  การระบุตำแหน่งด้วย Guideline
       - Guideline เป็นแนวทางที่สมมติขึ้นมา ทำหน้าที่ช่วยยืนยันตำแหน่งใน ConstraintLayout ง่ายยิ่งขึ้น ซึ้งมี
         2 ประเภทคือ
           - อ้างอิงตามแนวนอน (แกน x) เรียกว่า Vertical Guideline
           - อ้างอิงตามแนวตั้ง (แกน y) เรียกว่า Horizontal Guideline
           - การอ้างอิงตามแนวนอนเข้ากับ Vertical Guideline และ Horizontal Guideline อ้างอิงตามแนวตั้ง
           ครอบแล้วไม่ต้องอ้างอิง ConstraintLayout ก็ได้ ถือว่าการอ้างอิงตำแหน่งสมบูรณ์
    * */
}
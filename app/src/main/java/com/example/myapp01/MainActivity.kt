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
    *  เมื่อผู้ใช้งานคลิกปุ่ม cmdShow จะมีเหตุการณ์ setOnClickListener() ขึ้นมา
    *  การทำงานภายในเหตุการณ์มี 2 อย่างคือ
    *  1. กำหนดให้ TextView ที่ชื่อว่า tvOutput แสดงข้อความ "สวัสดี Android-Kotlin"
    *  2. กำหนดให้แสดงข้อความแจ้งเตือนแบบ Toast ระยะเวลาปรากฏข้อความแบบ Toast สามารถกำหนดได้
    *     2 แบบคือ ระยะเวลานาน (LENGTH_LONG) กับ ระยะสั้น (LENGTH_SHORT)
    *  3. สามารถระบุ widget ต่างๆ ได้ ที่อยู่ในไฟล์ activity_main.xml ได้โดย code ของ
    *     ภาษา Kotlin เกิดจาก Package ที่ชื่อว่า kotlinx.android.synthetic.main.activity_main.*
    *
    *  */
}
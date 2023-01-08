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
    /* การกำหนดขนาด widget
       - มีวิธีการ 3 แบบที่ใช้
         1. wrap_content มีขนาดเท่ากับเนื้อหาที่ตัวเองแสดงอยู่ wrap_content (android:layout_width="wrap_
         content")
         2. match_parent กำหนดให้ widget มีขนาดเท่ากับตัวบรรจุที่ตัวเองอาศัยอยู่ เช่น
           widget TextView ตัวนี้อยู่ใน ConstraintLayout จะใช้พื้นที่เต็มส่วนแสดงผลทั้งความกว้าง
           และ ความยาว ถ้ากำหนด ให้ TextView มีความกว้างแบบ match_parent จะทำให้ TextView
           ใช้่ความกว้างของ ConstraintLayout ที่ตัวเองอาศัยอยู่

          3. แบบกำหนดขนาดในหน่วย dp
             - การกำหนดขนาดตายตัวในหน่วย dp เป็นการกำหนดขนาดเป็นตัวเลขตายตัว มีขนาดเป็นไปตามความละเอียดของ
             หน้าจอที่กำลังแสดงผลอยู่ เช่น กำหนดความกว้าง 150dp (android:layout_width="150dp")
    * */
}
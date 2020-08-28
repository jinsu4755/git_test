package com.antilog.nuteekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var user_id:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            user_id = et_login_id.text.toString()
            Toast.makeText(this,user_id,Toast.LENGTH_SHORT).show()
        }

        text_signUp.setOnClickListener {
            et_login_id.setText("register")
            text_first.text = "회원가입 하세요"
        }

        text_forget_id_pw.setOnClickListener {
            val intent = Intent(this, UserFindActivity::class.java)
            startActivity(intent)
        }

    }
}


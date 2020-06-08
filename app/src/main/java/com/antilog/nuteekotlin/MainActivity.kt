package com.antilog.nuteekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //lateinit var 은 여기
    lateinit var lastname:String
    lateinit var firstname:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //변수는 여기
        me(21)
        score(80)
        score(10)
        greeting(3)

    }

    //함수는 여기
    fun me(age:Int?){
        this.lastname = "Bae"
        this.firstname = "eunseo"

        Log.d("name", "name : $lastname $firstname")
        if(age==null){
            println("나이를 입력해주세요.")
        }
        else
            Log.d("age", "age : $age")
    }

    fun score(num: Int){
        when (num) {
            in 50..100 -> Log.d("score", "${num}점이네요. 참 잘했어요~")
            in 0..50 -> Log.d("score", "${num}점이네요. 좀만 더 노력하세요.")
        }
    }

    fun greeting(meet: Int){
        for(i:Int in 1..meet){
                Log.d("hi", "${i}번째 Hello")
            }
    }
}


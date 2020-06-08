package com.antilog.nuteekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //lateinit var
    lateinit var lastName:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //변수
        val year=2018 //연도

        lastName="Lim"  //성
        val status:Int=1  //1이면 재학, 0이면 휴학

        testIf(status)
        testLoop(year)
        testwhen(lastName)
    }

    //함수
    //if문 테스트
    fun testIf(status:Int?){
        if(status==1)
            Log.d("status", "재학 중 입니다.")
        else
            Log.d("status","휴학 중 입니다.")
    }

    //반복문 테스트
    fun testLoop(year:Int){
        for(i:Int in 1..4) {
            Log.d("class", " ${year+i} $i 학년입니다.")
        }
    }
    //When 테스트
    fun testwhen(lastName:String?){
        when (lastName) {
            "Lim" -> Log.d("name", "임윤휘")
            "Bae" -> Log.d("name", "배은서")
            "Park" -> Log.d("name", "박진수")
            else -> {
                Log.d("name", "blank")
            }
        }
    }
}
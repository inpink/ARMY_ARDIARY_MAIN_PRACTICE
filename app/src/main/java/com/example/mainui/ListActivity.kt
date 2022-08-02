package com.example.mainui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction
import com.example.mainui.databinding.ActivityListBinding
import kotlinx.android.synthetic.main.activity_list.* //id 가져올 때 꼭 해주기.

class ListActivity : AppCompatActivity(){

    var isBtn =1 //frag1이면 1, frag2면 2를 통해 버튼 전환
    val manager = supportFragmentManager //fragment전환은 supportFragmentManager 사용. val로 사용

    //사용할 2개의 class 이름
    lateinit var trmain1: ListDefaultFragment
    lateinit var trmain2: ListImageFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        //버튼 가져오기
        var switch_btn : ImageButton = findViewById<ImageButton>(R.id.btnSwitch)

        // 먼저 첫 탭 보여주기 (default)
        ShowTabOne()

        // 버튼 클릭 시 탭2 내용 띄우기
        btnSwitch.setOnClickListener {
            if (isBtn==1){ //frag1인 상태면 two를 불러오기
                ShowTabTwo()
            }
            else{ //frag2인 상태면 one를 불러오기
                ShowTabOne()
            }

        }

    }

    // 함수 작성
    fun ShowTabOne(){
        isBtn=1 //one이 불러와졌으면 isBtn은 1
        Log.d("1","show one ${isBtn}")

        //버튼 모양 background로 변경
        btnSwitch.setImageDrawable(getDrawable(R.drawable.ic_launcher_background))
        //frag2_imageview_trmain.setImageDrawable(getDrawable(R.drawable.ic_launcher_foreground))

        //supportFragmentManager.beginTransaction() 이용해서 frameLayout이라는 것을 ListDefaultFragment() class로 변경
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, ListDefaultFragment())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

    }

    fun ShowTabTwo(){
        isBtn=2 //two가 불러와졌으면 isBtn은 2
        Log.d("2","show Two ${isBtn}")

        //foreground 모양으로 btnSwitch라는 버튼의 모양 바꾸기
        btnSwitch.setImageDrawable(getDrawable(R.drawable.ic_launcher_foreground))
        //frag2_imageview_trmain.setImageDrawable(getDrawable(R.drawable.ic_launcher_foreground))

        //supportFragmentManager.beginTransaction() 이용해서 frameLayout이라는 것을 ListImageFragment() class로 변경
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, ListImageFragment())
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }

}
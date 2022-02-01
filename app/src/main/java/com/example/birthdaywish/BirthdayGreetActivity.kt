package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreetActivity : AppCompatActivity() {

   companion object {
       const val NAME = "name"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(NAME)
        greetingtext.text = "Happy Birthday\n$name!!"
    }
}
package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gift.*


class Gift : AppCompatActivity() {

    companion object{

        const val GIFT = "gift"
        const val NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift)



       val gift = intent.getStringExtra(GIFT)
        val name = intent.getStringExtra(NAME)
        inputgift.text = "$name will get a \n $gift!!"
    }
}
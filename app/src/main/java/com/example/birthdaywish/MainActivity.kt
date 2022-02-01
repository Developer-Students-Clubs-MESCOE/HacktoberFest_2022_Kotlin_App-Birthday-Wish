package com.example.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun birthdayCard(view: android.view.View) {

        //for creating toast messages of name
        val nameInput: EditText=findViewById<EditText>(R.id.nameInput)
        val name1 = nameInput.text.toString()
        Toast.makeText(this,"Let's Wish $name1",Toast.LENGTH_SHORT).show()


        // for creating next activity

        val name = nameInput.editableText.toString()

        val intent = Intent(this,BirthdayGreetActivity::class.java)
        intent.putExtra(BirthdayGreetActivity.NAME,name)
        startActivity(intent)
    }

    fun birthdayGift(view: android.view.View) {

        //for creating toast messages of gift
        Toast.makeText(this,"Lets see the gift",Toast.LENGTH_SHORT).show()

        //for gift activity
        val gift = giftInput.editableText.toString()
        val name = nameInput.editableText.toString()
        //val name1 = giftInput.editableText.toString()

        val intent1 = Intent(this,Gift::class.java)
        intent1.putExtra(Gift.NAME,name)
        intent1.putExtra(Gift.GIFT,gift)
        startActivity(intent1)


    }
}
package com.example.zd8_stahovskiy

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SignUpScreen : AppCompatActivity() {
private lateinit var butt1:Button
private lateinit var butt2:Button
    private lateinit var ed1:EditText
    private lateinit var ed2:EditText
    private lateinit var ed3:EditText
    private lateinit var ed4:EditText
    private lateinit var ed5:EditText
    private lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)
        butt1=findViewById(R.id.button)
        butt2=findViewById(R.id.butt1)
        ed1=findViewById(R.id.editText)
        preferences=getSharedPreferences("ACCOUNT_FILMS", MODE_PRIVATE)

       ed2=findViewById(R.id.editText2)
        ed3=findViewById(R.id.editText3)
        ed4=findViewById(R.id.editText4)
        ed5=findViewById(R.id.editText2)
        if(preferences.contains("MY_LOGIN_FILM")){
            val log=preferences.getString("MY_LOGIN_FILMS","NONE")
            ed1.setText(log)
        }


        butt1.setOnClickListener()
        {
            if(ed1.text.toString().isEmpty() || ed2.text.toString().isEmpty()||ed3.text.toString().isEmpty()|| ed4.text.toString().isEmpty()|| ed5.text.toString().isEmpty())
            {
                var alert=AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("У вас есть незаполненные поля")
                    .setPositiveButton("ОК",null)
                    .create()
                    .show()
            }
            else
            {
                var editin=preferences.edit()
                editin.putString("Films", ed1.text.toString())
                editin.apply()
                var intent = Intent(this, CollectionScreen::class.java)
                startActivity(intent)
                getSharedPreferences(ed1.text.toString(),Context.MODE_PRIVATE)





            }

            /*if(ed4.text.toString() != ed5.text.toString())
            {
                var alert=AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Неверный пароль")
                    .setPositiveButton("ОК",null)
                    .create()
                    .show()
            }*/
        }
        butt2.setOnClickListener()
        {
            var intent = Intent(this, CollectionScreen::class.java)
            startActivity(intent)
            preferences=getSharedPreferences(ed1.text.toString(),Context.MODE_PRIVATE)
        }




    }
}
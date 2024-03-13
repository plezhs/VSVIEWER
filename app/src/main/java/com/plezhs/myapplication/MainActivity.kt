package com.plezhs.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.JsonObject
import com.plezhs.myapplication.api
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lgbtn : Button = findViewById(R.id.loginbt)
        val idtxt : EditText = findViewById(R.id.riotid)
        val pwtxt : EditText = findViewById(R.id.riotpw)
        val rand : Random = Random
        val txt : TextView = findViewById(R.id.test)
        lgbtn.run {
            setOnClickListener {
                val test : String = api().generateToken(111)
                // Toast 객체를 생성한다.
//                val t1 = Toast.makeText(this@MainActivity,String.format("%s",test), Toast.LENGTH_SHORT)
//                t1.show()
                txt.setText(test)
            }
        }
    }
}
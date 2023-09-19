package com.example.synch91923

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayAccount = ArrayList<String>()
        var arrayPassword = ArrayList<String>()

        var implicit_array = arrayOf(1,2,"string_number",4,5,6)
        var explicit_array = arrayOf<Int>(1 ,2 ,3 ,4 ,5 ,6)

        var textAccount = findViewById<TextView>(R.id.txtAccount)
        var buttonAccount = findViewById<Button>(R.id.btnAccount)
        var buttonFind = findViewById<Button>(R.id.btnFind)
        var editAccount = findViewById<EditText>(R.id.edtAccount)
        var editPassword = findViewById<EditText>(R.id.edtPassword)

        buttonAccount.setOnClickListener {

            arrayAccount.add(editAccount.text.toString())
            arrayPassword.add(editPassword.text.toString())

            textAccount.setText(arrayAccount.size.toString())
            Toast.makeText(this, editAccount.text.toString(), Toast.LENGTH_SHORT).show()

            for (x in implicit_array) {
                Log.i("info", x.toString())
            }
        }
    }
}
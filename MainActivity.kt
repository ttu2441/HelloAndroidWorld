package com.example.helloandroid

/*To import the android app combat activity*/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //This shows Property must be initialized or be abstract
    internal var ans: Button? = null
    internal var num1: EditText? = null
    internal var num2: EditText? = null

    /*This shows onCreate Method for Main Activity*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.piggybank.UI.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.piggybank.R
import com.example.piggybank.UI.Fragments.MainFragments.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginFragment()
    }

    private fun loginFragment() {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, LoginFragment())
        fragmentTransaction.commit()

        println("Inicia Fragmento")
    }
}
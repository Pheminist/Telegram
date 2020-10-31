package com.example.telegram.utilits

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.telegram.R
import com.example.telegram.activities.RegisterActivity
import com.example.telegram.ui.fragments.ChatsFragment

fun Fragment.showToast(string: String){
    Toast.makeText(this.context,string,Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.replaceActivity(activity: AppCompatActivity){
    val intent= Intent(this, RegisterActivity::class.java)
    startActivity(intent)
    finish()
}

fun AppCompatActivity.replaceFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction()
        .addToBackStack(null)
        .replace(R.id.dataContainer, fragment)
        .commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    fragmentManager?.beginTransaction()
        ?.addToBackStack(null)
        ?.replace(R.id.dataContainer, fragment)
        ?.commit()
}
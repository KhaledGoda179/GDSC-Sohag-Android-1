package com.example.bk_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bk_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.BResult.setOnClickListener {
            val num1= binding.ETNum1.text.toString().toIntOrNull()?:0
            val num2= binding.ETNum2.text.toString().toIntOrNull()?:0
            val result= num1+num2
            binding.TVResult.text = result.toString()
        }


    }
}
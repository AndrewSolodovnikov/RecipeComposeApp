package com.sol.entry_form

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sol.entry_form.databinding.ActivityHelloUserBinding
import com.sol.entry_form.databinding.ActivityMainBinding

class HelloUser : AppCompatActivity() {
    private val binding by lazy { ActivityHelloUserBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val userName = intent.getStringExtra("userName")

        binding.tvHelloUser.text = userName ?: "Привет, пользователь"

    }
}
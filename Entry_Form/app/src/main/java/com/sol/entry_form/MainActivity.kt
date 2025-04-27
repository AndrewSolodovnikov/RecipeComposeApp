package com.sol.entry_form

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sol.entry_form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val login = binding.textInputEditLogin.text?.trim().toString()
            val password = binding.textInputEditPassword.text?.trim().toString()

            if (validate(login.toString(), password.toString()) != null) {
                val intent = Intent(this, HelloUser::class.java)
                intent.putExtra("userName", login)
                startActivity(intent)

            } else {
                Toast.makeText(this, "Введены неверные данные!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun validate(login: String, password: String): User? {
        return STUB.userList.find { user ->
            login == user.login &&
                    password == user.password
        }
    }

}
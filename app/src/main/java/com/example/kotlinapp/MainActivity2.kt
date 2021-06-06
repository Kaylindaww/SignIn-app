package com.example.kotlinapp
                import android.content.Intent
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
            lateinit var etEmail: EditText
            lateinit var etPassword: EditText
            lateinit var tvSignIn: TextView
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main2)

            }

            fun castView() {
                tvSignIn = findViewById(R.id.tvSignIn)
                etEmail = findViewById(R.id.etEmail)
                etPassword = findViewById(R.id.etPassword)
                tvSignIn = findViewById(R.id.tvSignIn)

            }

            private fun onClicklistener() {
                tvSignIn.setOnClickListener {
                    if (etEmail.text.toString().isEmpty() ||
                            etPassword.text.toString().isEmpty()
                    )
                        etEmail.setError("Input password is incorrect")
                    etPassword.setError("Input email is incorrect")
                }
                Toast.makeText(this, tvSignIn.toString(), Toast.LENGTH_LONG).show()

                tvSignIn.setOnClickListener {
                    var intent = Intent(this, SignupActivity2::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}
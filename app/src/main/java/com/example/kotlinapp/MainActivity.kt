package com.example.kotlinapp


        import android.content.Intent
                import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
                import android.view.View
import android.widget.*


class SignupActivity2 : AppCompatActivity() {
            lateinit var TVSignUp:TextView
            lateinit var etName:EditText
            lateinit var etEmail: EditText
            lateinit var etPhone: EditText
            lateinit var etPassword:EditText
            lateinit var spGender:Spinner

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                castViews()
                onClickListener()
            }
            fun castViews() {
                tvSignUp=findViewById(R.id.tvSignUp)
                etEmail = findViewById(R.id.etEmail)
                etPassword = findViewById(R.id.etPassword)
                etPhone = findViewById(R.id.etPhone)
                spGender = findViewById(R.id.spGender)

                var gender = arrayOf("Male", "Female", "None")
                var GenderAdapter =
                        ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_item, gender)
                GenderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spGender.adapter = GenderAdapter


            }

            fun onClickListener() {
                TVSignUp.setOnClickListener {
                    var spGender = spGender.selectedItem.toString()
                    if (etName.text.toString().isEmpty() ||
                            etEmail.text.toString().isEmpty() ||
                            etPhone.text.toString().isEmpty() ||
                            etPassword.text.toString().isEmpty()
                    ) {
                        etName.error = "Input name"
                    }
                }
            }}
    }
}
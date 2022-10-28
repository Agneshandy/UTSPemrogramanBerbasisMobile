package com.android.example.agnesbelladonashandyayocha175410123

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.android.example.agnesbelladonashandyayocha175410123.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var edInput: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        edInput = findViewById(R.id.edJariJari)

        binding.btnTekan.setOnClickListener{
            val showKedua = Intent(this, SecondActivity::class.java)
            showKedua.putExtra("jari",binding.edJariJari.text.toString())
            showKedua.putExtra("nama", binding.textNama.text.toString())
            startActivity(showKedua)
        }
    }
}


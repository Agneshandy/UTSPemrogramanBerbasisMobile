package com.android.example.agnesbelladonashandyayocha175410123

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.example.agnesbelladonashandyayocha175410123.databinding.ActivityKeduaBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivityKeduaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKeduaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intentThatStartedThisActivity = getIntent()
        var input = intentThatStartedThisActivity.getStringExtra("jari").toString()

        var phi = 3.14
        var jari = input.toDouble()
        var luas = (phi*jari*jari).toFloat().toString()
        var keliling = (2*phi*jari).toFloat().toString()

        binding.txtJari.text="Jari-jari             : "+jari
        binding.txtLuas.text="Luas lingkaran           : "+luas
        binding.txtKeliling.text="Keliling lingkaran   : "+keliling

        /*if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
        var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
        binding.txtKedua.text  = partId.toString()
        }*/
    }
}
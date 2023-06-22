package com.example.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferences.UserVipApplication.Companion.prefferences
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initUI()
        checkUserValues()
    }

    fun checkUserValues(){
        if(prefferences.getName().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUI() {
        binding.btnContinue.setOnClickListener { accesToDetail() }
    }

    fun accesToDetail() {
        if (binding.etName.text.toString().isNotEmpty()) {
            //Guardo el Usuario
            prefferences.saveName(binding.etName.text.toString())
            prefferences.saveVIP(binding.cbVip.isChecked)
            goToDetail()
        } else {
            //Otra cosa
        }
    }

    fun goToDetail(){
        startActivity(Intent(this,ResultActivity::class.java))
    }

}

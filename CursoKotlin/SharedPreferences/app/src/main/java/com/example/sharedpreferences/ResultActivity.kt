package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.sharedpreferences.UserVipApplication.Companion.prefferences
import com.example.sharedpreferences.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initUI()
    }

    fun initUI(){
        binding.btnCloseSesion.setOnClickListener {
            prefferences.wipe()
            onBackPressed()
        }
        val userName = prefferences.getName()
        binding.txtName.text = "Bienvenido ${userName}"
        if(prefferences.getVIP()){
            setVIPColorBackground()
        }else{
            setNoVIPColorBackground()
        }
    }

    fun setVIPColorBackground(){
        binding.layoutContainer.setBackgroundColor(ContextCompat.getColor(
            this,R.color.vip_yellow))
    }

    fun setNoVIPColorBackground(){
        binding.layoutContainer.setBackgroundColor(ContextCompat.getColor(
            this,R.color.no_vip_purple))
        binding.txtName.setTextColor(ContextCompat.getColor(this,R.color.white))
    }
}
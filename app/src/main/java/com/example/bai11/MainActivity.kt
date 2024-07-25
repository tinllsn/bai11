package com.example.bai11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bai11.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var list  = mutableListOf<OutData>()
        list.add(OutData(R.drawable.banghoa,"banghoa"))
        list.add(OutData(R.drawable.hoanhon,"hoanho"))
        list.add(OutData(R.drawable.giatocrong,"rong"))
        list.add(OutData(R.drawable.thanlan,"thanlan"))

        list.add(OutData(R.drawable.banghoa,"banghoa"))
        list.add(OutData(R.drawable.hoanhon,"hoanho"))
        list.add(OutData(R.drawable.giatocrong,"rong"))
        list.add(OutData(R.drawable.thanlan,"thanlan"))

        list.add(OutData(R.drawable.banghoa,"banghoa"))
        list.add(OutData(R.drawable.hoanhon,"hoanho"))
        list.add(OutData(R.drawable.giatocrong,"rong"))
        list.add(OutData(R.drawable.thanlan,"thanlan"))


        var adpt =  CustomGridView(this,list)

        binding.gvFilm.adapter = adpt

        binding.gvFilm.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"You chose "+list[position].name,Toast.LENGTH_SHORT).show()
        }
    }
}
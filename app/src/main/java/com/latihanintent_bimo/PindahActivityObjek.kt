package com.latihanintent_bimo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahActivityObjek : AppCompatActivity() {
    private lateinit var tvPenerimaObjk : TextView

    companion object {
        const val EXTRA_CARS = "extra_cars"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)

        tvPenerimaObjk = findViewById(R.id.tvObjek)

        val cars: Cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "MERK: ${cars.merk.toString()} \n " +
                   "TAHUN: ${cars.tahun.toString()} \n " +
                   "PLAT: ${cars.plat.toString()}"

        tvPenerimaObjk.text = text
    }

}
package com.adesso.mylivecodingsession

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class InsertCoordinates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_form)
        title = "Insert Data"
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {



        }
        val viewModel = ViewModelProvider(this).get(InsertCoordinatesViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {
            Log.d("hello", it.timezone)
        })
    }

    private fun getMyData() {
       val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://api.open-meteo.com/v1/")
            .build()
           .create(CoordenadesAPI::class.java)
}}
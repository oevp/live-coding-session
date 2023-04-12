package com.adesso.mylivecodingsession

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ShowWeather : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_form)
    }

inner class ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
            init {
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, ShowWeather::class.java);
                    itemView.getContext().startActivity(intent);
                }
            }
        }
}
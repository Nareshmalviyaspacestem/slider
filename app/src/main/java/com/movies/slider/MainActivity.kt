package com.movies.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.slider.RangeSlider
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

   private lateinit var  rangeSlider : RangeSlider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rangeSlider = findViewById(R.id.rangeSlider);
        rangeSlider.setLabelFormatter { value: Float ->
            val format = NumberFormat.getCurrencyInstance()
            format.maximumFractionDigits = 0
            format.currency = Currency.getInstance("USD")
            format.format(value.toDouble())
        }

    }
}
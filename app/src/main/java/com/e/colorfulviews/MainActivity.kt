package com.e.colorfulviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf<View>(
                textView_one,
                textView_two,
                textView_three,
                textView_four,
                textView_five,
                button_1,
                button_2,
                button_3,
                constraint_layout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Set color from resource
            R.id.textView_one -> view.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.textView_two -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.textView_three -> view.setBackgroundResource(android.R.color.holo_blue_bright)

            // Set color from Color class
            R.id.textView_four -> view.setBackgroundColor(Color.CYAN)
            R.id.textView_five -> view.setBackgroundColor(Color.MAGENTA)

            // Set colors when buttons are pressed
            R.id.button_1 -> textView_one.setBackgroundResource(R.color.my_red)
            R.id.button_2 -> textView_two.setBackgroundResource(R.color.my_yellow)
            R.id.button_3 -> textView_three.setBackgroundResource(R.color.my_blue)

            else -> view.setBackgroundColor(Color.YELLOW)
        }
    }
}

package com.example.geeks_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.geeks_mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    private val presenter = Injector.getPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            plusBtm.setOnClickListener {
                presenter.increment()

            }
            minusBtm.setOnClickListener {
                presenter.decrement()
            }
        }
    }


    override fun showChangeCount(count: Int) {
        binding.countTv.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
    }

    override fun showColor() {
        binding.countTv.setTextColor(ContextCompat.getColor(this, R.color.green));
    }
}
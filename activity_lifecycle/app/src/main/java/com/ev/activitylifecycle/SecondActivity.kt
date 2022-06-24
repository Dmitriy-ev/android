package com.ev.activitylifecycle

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.ev.activitylifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupAlertDialog()
    }

    private fun setupAlertDialog() {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Информационное сообщение")
        alertDialog.setMessage("Вы во втором активити, для возврата нажмите кнопку")
        alertDialog.setPositiveButton(
            "К первому активити"
        ) { _, _ -> finish() }
        alertDialog.create()
        alertDialog.show()
    }
}
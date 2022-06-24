package com.ev.activitylifecycle

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.ev.activitylifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate()")
        setupAlertDialog()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy()")
    }

    private fun setupAlertDialog() {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Информационное сообщение")
        alertDialog.setMessage("Вы во втором активити, для возврата нажмите кнопку")
        alertDialog.setPositiveButton(
            "перейти к первому активити"
        ) { _, _ -> startActivity(Intent(this@SecondActivity, FirstActivity::class.java)) }
        alertDialog.setNegativeButton(
            "перейти к первому фрагменту"
        ) { _, _ -> launchFirstFragment() }
        alertDialog.setNeutralButton("перейти ко второму фрагменту")
        { _, _ -> launchSecondFragment() }
        alertDialog.create()
        alertDialog.show()
    }

    private fun launchFirstFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, FirstFragment.getInstance())
            .commit()
    }

    private fun launchSecondFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, SecondFragment.getInstance())
            .commit()
    }

    companion object {
        private const val TAG = "SecondActivity"
    }
}
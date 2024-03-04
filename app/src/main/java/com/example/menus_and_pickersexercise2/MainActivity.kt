package com.example.menus_and_pickersexercise2

import android.app.AlertDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.menus_and_pickersexercise2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonAlert.setOnClickListener {
            showAlertDialog(this@MainActivity, "Alert","Click OK to continue. Cancel to stop")
        }
    }
}

fun showAlertDialog(context: Context, title: String, message: String) {
    val alertDialogBuilder: AlertDialog.Builder = AlertDialog.Builder(context)

    // Thiết lập tiêu đề và thông điệp cho hộp thoại
    alertDialogBuilder.setTitle(title)
    alertDialogBuilder.setMessage(message)

    // Thiết lập nút OK, cancel để đóng hộp thoại
    alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
        dialog.dismiss()
        Log.v("test", "OK")
    }
    alertDialogBuilder.setNegativeButton("CANCEL") { dialog, _ ->
        dialog.dismiss()
        Log.v("test", "CANCEL")
    }

    // Tạo và hiển thị hộp thoại
    val alertDialog: AlertDialog = alertDialogBuilder.create()
    alertDialog.show()
}
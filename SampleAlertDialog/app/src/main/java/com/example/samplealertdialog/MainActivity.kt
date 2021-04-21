package com.example.sampleaplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.samplealertdialog.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun ButtonOnClicked() {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("Judul Peringatan")
        alertDialog.setMessage("Ini pesan peringatan")
        alertDialog.setButton(
                AlertDialog.BUTTON_POSITIVE, "Yes"
        ) { dialog, i ->
            Toast.makeText(this, "Anda memilih tombol ya",
                    Toast.LENGTH_LONG).show()
        }
        alertDialog.setButton(
                AlertDialog.BUTTON_NEGATIVE, "No"
        ) { dialog, i ->
            Toast.makeText(this, "Anda memilih tombol ya",
                    Toast.LENGTH_LONG).show()
        }
        alertDialog.show()
    }
}

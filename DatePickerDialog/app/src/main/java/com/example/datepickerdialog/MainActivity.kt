package com.example.sampleaplication
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.datepickerdialog.R
import java.util.*
class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    var year:Int = 0
    var month:Int = 0
    var day:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.tanggal)
        val c = Calendar.getInstance()
        year = c.get(Calendar.YEAR)
        month = c.get(Calendar.MONTH)
        day = c.get(Calendar.DAY_OF_MONTH)
    }
    fun ButtonOnClicked(view: View){
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
            view, year, monthOfYear, dayOfMonth ->
            textView.setText("" + dayOfMonth + " " + month + ", " + year)
        }, year, month, day)
        dpd.show()
    }
}
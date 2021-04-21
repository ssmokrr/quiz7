package com.example.sampleaplication
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.timepickerdialog.R
import java.text.SimpleDateFormat
import java.util.*
class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.jam)
    }
    fun ButtonOnClicked(view: View){
        val cal = Calendar.getInstance()
        val timeSetListener = TimePickerDialog.OnTimeSetListener {
            timePicker, hour, minute ->
            cal.set(Calendar.HOUR_OF_DAY, hour)
            cal.set(Calendar.MINUTE, minute)
            textView.text = SimpleDateFormat("HH:mm").format(cal.time)
        }
        TimePickerDialog(
                this, timeSetListener,
                cal.get(Calendar.HOUR_OF_DAY),
                cal.get(Calendar.MINUTE),
                true
        ).show()
    }
}

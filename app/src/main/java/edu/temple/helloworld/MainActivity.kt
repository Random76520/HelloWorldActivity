package edu.temple.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var clickButton: Button
    lateinit var displayTextView: TextView
    lateinit var nameEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        clickButton = findViewById(R.id.clickMeButton)
        nameEdit = findViewById(R.id.nameEditText)

        // Respond to button click event per specifications
        clickButton.setOnClickListener {
            displayTextView.setText ("Hello, ${nameEdit.text}!")
        }
    }
}
package com.example.guideabull

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//* setting up our variables btn1 and btn2 */
    lateinit var btn1 : ImageButton
    lateinit var btn2 : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//* here it seems that we connect our variables to the imagebutton, so btn1 is set to button1 and btn2 is set to button 2 */
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
//* this code makes it so that the button sends us to a different activity when clicked */
        btn1.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this, settings::class.java)
            startActivity(intent)
        }




    }
}

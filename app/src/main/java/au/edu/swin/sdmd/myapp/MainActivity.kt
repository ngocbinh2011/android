package au.edu.swin.sdmd.myapp

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity(){

    companion object {

        lateinit var button: ImageButton
        lateinit var textViewImage1: TextView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById<ImageButton>(R.id.imageButton17);
        textViewImage1 = findViewById<TextView>(R.id.textView9);
        textViewImage1.setText(
            Html.fromHtml("<b>" + textViewImage1.text + "</b>" +  "<br />" +
                "<small style='color:red;'>" + 4 + "</small>" + "<br />"))
        button.setOnClickListener {
            println("CLicked");
        }

    }
}
package au.edu.swin.sdmd.myapp

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat

class MainActivity: AppCompatActivity(){

//    companion object {
//
//        lateinit var button: ImageButton
//        lateinit var textViewImage1: TextView
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<ImageButton>(R.id.imageButton20);
        var textViewImage1 = findViewById<TextView>(R.id.textView9);

        var button2 = findViewById<ImageButton>(R.id.imageButton21);
        var textViewImage2 = findViewById<TextView>(R.id.textView10);

        var button3 = findViewById<ImageButton>(R.id.imageButton17);
        var textViewImage3 = findViewById<TextView>(R.id.textView11);

        var button4 = findViewById<ImageButton>(R.id.imageButton19);
        var textViewImage4 = findViewById<TextView>(R.id.textView18);
        textViewImage1.setText(HtmlCompat.fromHtml("<b>" + Data.model1.name + "</b>" +  "<br />" +
                "<small>" + Data.model1.rate + "</small>" + "<br />",  HtmlCompat.FROM_HTML_MODE_LEGACY))
        textViewImage2.setText(HtmlCompat.fromHtml("<b>" + Data.model2.name + "</b>" +  "<br />" +
                "<small>" + Data.model2.rate + "</small>" + "<br />",  HtmlCompat.FROM_HTML_MODE_LEGACY))
        textViewImage3.setText(HtmlCompat.fromHtml("<b>" + Data.model3.name + "</b>" +  "<br />" +
                "<small>" + Data.model3.rate + "</small>" + "<br />",  HtmlCompat.FROM_HTML_MODE_LEGACY))
        textViewImage4.setText(HtmlCompat.fromHtml("<b>" + Data.model4.name + "</b>" +  "<br />" +
                "<small>" + Data.model4.rate + "</small>" + "<br />",  HtmlCompat.FROM_HTML_MODE_LEGACY))


        button1.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java);
            i.putExtra("EXTRA_DATA", Data.model1)
            startActivity(i);
        }

        button2.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java);
            i.putExtra("EXTRA_DATA", Data.model2)
            startActivity(i);
        }

        button3.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java);
            i.putExtra("EXTRA_DATA", Data.model3)
            startActivity(i);
        }

        button4.setOnClickListener {
            var i = Intent(this, MainActivity2::class.java);
            i.putExtra("EXTRA_DATA", Data.model4)
            startActivity(i);
        }

    }
}
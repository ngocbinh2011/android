package au.edu.swin.sdmd.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    companion object {
        lateinit var imageView: ImageView
        lateinit var editTextName: EditText
        lateinit var editTextDetail: EditText
        lateinit var rateBar: RatingBar
        lateinit var editTextDate: EditText
        lateinit var image: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView = findViewById<ImageView>(R.id.imageView)
        editTextName = findViewById<EditText>(R.id.editTextName);
        editTextDetail = findViewById<EditText>(R.id.editTextDetail);
        rateBar = findViewById<RatingBar>(R.id.ratingBar);
        editTextDate = findViewById<EditText>(R.id.editTextDate);


        var model = intent.getParcelableExtra<Model>("EXTRA_DATA");
        if (model != null) {
            image = model.image
            editTextName.setText(model.name)
            editTextDetail.setText(model.detail)
            editTextDate.setText(model.date)
            rateBar.rating = model.rate
        }
    }


    override fun onBackPressed() {
        var model = Model(
            image,
            editTextName.text.toString(),
            editTextDetail.text.toString(),
            rateBar.rating,
            editTextDate.text.toString()
        )
        Data.update(model)
        var i = Intent(this, MainActivity::class.java);
        startActivity(i);
    }
}
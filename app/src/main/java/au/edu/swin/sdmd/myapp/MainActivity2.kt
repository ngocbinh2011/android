package au.edu.swin.sdmd.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
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
            setImage(model)
            editTextName.setText(model.name)
            editTextDetail.setText(model.detail)
            editTextDate.setText(model.date)
            rateBar.rating = model.rate
        }
    }


    override fun onBackPressed() {
        var currentDate = editTextDate.text.toString()
       if (editTextName.text.toString().isNullOrEmpty()) {
           editTextName.error = "Name is required"
           return
       }
        if (editTextDetail.text.toString().isNullOrEmpty()) {
            editTextDetail.error = "Detail is required"
            return
        }
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
        Toast.makeText(this, "Item updated: ${model.name}", Toast.LENGTH_SHORT).show();
    }

    fun setImage(model: Model){
        if(model.image.compareTo(Data.model1.image) == 0)
            imageView.setImageResource(R.drawable.image1)
        if(model.image.compareTo(Data.model2.image) == 0)
            imageView.setImageResource(R.drawable.image2)
        if(model.image.compareTo(Data.model3.image) == 0)
            imageView.setImageResource(R.drawable.image3)
        if(model.image.compareTo(Data.model4.image) == 0)
            imageView.setImageResource(R.drawable.image4)
    }
}
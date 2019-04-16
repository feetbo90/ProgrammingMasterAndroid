package contoh.master.programming.programmingmaster01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_spinner.*

class SpinnerActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val adapter = ArrayAdapter.createFromResource(this, R.array.planets_array,
                android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        planets_spinner.adapter = adapter
        planets_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //var planets = resources.getStringArray(R.array.planets_array)
                Log.d("masuk", " ini masuk ")
                setImage("${parent!!.getItemAtPosition(position)}")
                Toast.makeText(applicationContext, "ini pilihan anda ${parent.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
            }
        }
    }
/*
    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        //var planets = resources.getStringArray(R.array.planets_array)
        Log.d("masuk", " ini masuk ")
        Toast.makeText(applicationContext, "ini pilihan anda ${parent!!.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
    }*/

    fun setImage(gambar : String) {
        if(gambar.trim() == "Earth") {
        image.setImageResource(R.drawable.bumi)
            text.setText("Bumi adalah planet ke 3")
        }
        else if(gambar.trim() == "Mercury")
            image.setImageResource(R.mipmap.ic_launcher)
        else if(gambar.trim() == "Mars")
            image.setImageResource(R.mipmap.ic_launcher_round)
    }
}

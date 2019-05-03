package contoh.master.programming.programmingmaster01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
    }

    fun checkBoxPilih(view: View) {

        if (view is CheckBox) {

            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.pilihanPertama -> {
                    if (checked) {
                        Toast.makeText(applicationContext, "Ini dari pilihan Pertama ${view.text}", Toast.LENGTH_LONG).show()

                    } else
                        Toast.makeText(applicationContext, "UnCheck dari pilihan pertama", Toast.LENGTH_LONG).show()
                }

                R.id.pilihanKedua -> {
                    if (checked)
                        Toast.makeText(applicationContext, "Ini dari pilihan yang Kedua ", Toast.LENGTH_LONG).show()
                    else
                        Toast.makeText(applicationContext, "UnCheck dari pilihan pertama", Toast.LENGTH_LONG).show()

                }
            }
        }
    }
}

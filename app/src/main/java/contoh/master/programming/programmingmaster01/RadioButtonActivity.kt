package contoh.master.programming.programmingmaster01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_pirates ->
                    if (checked) {
                        // Pirates are the best
                        Toast.makeText(applicationContext, "Ini ${view.text}", Toast.LENGTH_LONG).show()
                    }
                R.id.radio_ninjas ->
                    if (checked) {
                        // Ninjas rule
                        Toast.makeText(applicationContext, "Ini ${view.text}", Toast.LENGTH_LONG).show()

                    }
            }
        }
    }
}

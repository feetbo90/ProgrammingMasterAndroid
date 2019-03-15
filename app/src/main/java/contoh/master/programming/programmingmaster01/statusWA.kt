package contoh.master.programming.programmingmaster01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_status_w.*

class statusWA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status_w)

        humor.setOnClickListener {
            Toast.makeText(this, "Ini bagian Humor ", Toast.LENGTH_LONG).show()
        }
    }
}

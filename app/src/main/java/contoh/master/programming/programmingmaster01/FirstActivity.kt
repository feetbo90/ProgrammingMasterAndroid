package contoh.master.programming.programmingmaster01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        tekan.setOnClickListener {
            val nilai = nama.text.toString()
            val intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("nama" , nilai)
            startActivity(intent)
        }

    }
}

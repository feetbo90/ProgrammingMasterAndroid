package contoh.master.programming.programmingmaster01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_penjumlahan.*

class Penjumlahan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penjumlahan)

        tekan.setOnClickListener {
            var bilangan = bilangan1.text.toString().toInt()
            var bilanganDua = bilangan2.text.toString().toInt()
            var jumlah = bilangan + bilanganDua
            hasilJumlah.text = "Hasil Jumlah : $jumlah"
        }


    }
}

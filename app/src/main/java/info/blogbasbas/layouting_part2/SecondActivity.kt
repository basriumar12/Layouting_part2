package info.blogbasbas.layouting_part2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        button_hitung.setOnClickListener {

            //fungsi hitung
            val nilaiSatu = editText_nilai_1.text.toString()
            val nilaiDua = editText_nilai_2.text.toString()
            //buat kondisi
            if (nilaiSatu.isEmpty()){
                editText_nilai_1.setError("nilai bulum di isi")
            } else if (nilaiDua.isEmpty()){
                editText_nilai_2.setError("nilai bulum di isi")
            } else{

                val nilaiA = nilaiSatu.toDouble()
                val nilaiB = nilaiDua.toDouble()
                val hasil = nilaiDua + nilaiSatu
                val hasil2 = nilaiA + nilaiB
                Toast.makeText(this," Hasil penjumlahan $hasil dan $hasil2 ", Toast.LENGTH_LONG).show()
            }

        }





    }
}

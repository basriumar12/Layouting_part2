package info.blogbasbas.layouting_part2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Ini Method Oncreate")

        // fungsi onKlik
        btn_to_second.setOnClickListener {

            //kasih toast ketika diklik//
            Toast.makeText(this,"fungsi button klik", Toast.LENGTH_LONG).show()

            // fungsi intent untuk pindah activity
            val pindahActvity = Intent(this, SecondActivity::class.java)
            startActivity(pindahActvity)

        }


    }

    override fun onStart() {
        super.onStart()
        println("ini method onstart")
    }

    override fun onResume() {
        super.onResume()
        println("ini method on resume")
    }
    override fun onPause() {
        super.onPause()
        println("ini method onpause")
    }

    override fun onStop() {
        super.onStop()
        println("ini method onstop")
        Log.e("","test stop")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("ini method destory")
    }
}

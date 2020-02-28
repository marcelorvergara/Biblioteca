package android.vergara.bibliotec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAvancar.setOnClickListener(){ next()}
    }

    fun next(){

        var intt = Intent(this,SegTela::class.java)
        startActivity(intt)

    }
}

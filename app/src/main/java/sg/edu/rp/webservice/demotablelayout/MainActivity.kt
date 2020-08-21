package sg.edu.rp.webservice.demotablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        var msg = ""
        val btnSelect = view as Button
        when (btnSelect.id){
            btn1.id -> msg = "button 1 is clicked"
            btn2.id -> msg = "button 2 is clicked"
            btn3.id -> msg = "button 3 is clicked"
            btn4.id -> msg = "button 4 is clicked"
            btn5.id -> msg = "button 5 is clicked"

        }
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
    }
}

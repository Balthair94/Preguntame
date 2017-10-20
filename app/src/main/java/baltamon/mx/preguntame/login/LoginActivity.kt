package baltamon.mx.preguntame.login

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baltamon.mx.preguntame.MainActivity
import baltamon.mx.preguntame.R
import baltamon.mx.preguntame.splash.SplashActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.item_toolbar.*

/**
 * Created by Baltazar Rodriguez on 19/10/2017.
 */
class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupToolbar()
        setupButtons()
    }

    fun setupToolbar(){
        toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.login_title)
    }

    fun setupButtons(){
        btn_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_cancel.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
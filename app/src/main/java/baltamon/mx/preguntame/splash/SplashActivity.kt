package baltamon.mx.preguntame.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import baltamon.mx.preguntame.R
import baltamon.mx.preguntame.login.LoginActivity
import baltamon.mx.preguntame.logon.LogonActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * Created by Baltazar Rodriguez on 19/10/2017.
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            ll_buttons.visibility = View.VISIBLE
            setupButtons()
        }, 3000)
    }

    fun setupButtons(){
        btn_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_logon.setOnClickListener {
            val intent = Intent(this, LogonActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
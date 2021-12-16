package kg.kamila.abdykalykova_kamila_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.kamila.abdykalykova_kamila_final.databinding.ActivityAccountPageBinding
import kg.kamila.abdykalykova_kamila_final.databinding.ActivityMainBinding

class Accountpage : AppCompatActivity() {
    private lateinit var binding: ActivityAccountPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_page)

        binding= ActivityAccountPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}
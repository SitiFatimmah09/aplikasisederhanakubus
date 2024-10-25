package id.ac.polbeng.sifa.androidsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.sifa.aplikasisederhana.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menghubungkan elemen UI dengan kode menggunakan findViewById
        val etSisi: EditText = findViewById(R.id.etSisi)
        val btnHitungVolume: Button = findViewById(R.id.btnHitungVolume)
        val btnHitungLuas: Button = findViewById(R.id.btnHitungLuas)
        val tvHasil: TextView = findViewById(R.id.tvHasil)

        // Tombol untuk menghitung volume kubus
        btnHitungVolume.setOnClickListener {
            val sisiStr = etSisi.text.toString()

            if (sisiStr.isNotEmpty()) {
                try {
                    val sisi = sisiStr.toDouble()
                    val volume = sisi * sisi * sisi
                    tvHasil.text = "Volume Kubus: $volume"
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Masukkan sisi kubus", Toast.LENGTH_SHORT).show()
            }
        }

        // Tombol untuk menghitung luas permukaan kubus
        btnHitungLuas.setOnClickListener {
            val sisiStr = etSisi.text.toString()

            if (sisiStr.isNotEmpty()) {
                try {
                    val sisi = sisiStr.toDouble()
                    val luasPermukaan = 6 * (sisi * sisi)
                    tvHasil.text = "Luas Permukaan Kubus: $luasPermukaan"
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Masukkan sisi kubus", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

package kr.ac.kumoh.s20171050.qrcode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.journeyapps.barcodescanner.BarcodeEncoder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // QRCODE SCAN 버튼 클릭 시 scanner 화면 호출
        main_btn_scan.setOnClickListener {
            val intent = Intent(this, ScanActivity::class.java)
            startActivity(intent)
        }

        val iv = findViewById<ImageView>(R.id.imageView)
        val text = "https://www.naver.com/"

        val multiFormatWriter = MultiFormatWriter()

        try {
            val bitMatrix =
                multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200)
                                      // text : result.contents에 담길 내용 지정

            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.createBitmap(bitMatrix)
            iv.setImageBitmap(bitmap)
        } catch (e: Exception) {
        }
    }

}




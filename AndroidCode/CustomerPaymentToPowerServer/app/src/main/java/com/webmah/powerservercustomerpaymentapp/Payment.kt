package com.webmah.powerservercustomerpaymentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_payment.*
import java.text.SimpleDateFormat
import java.util.*

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val CUSTOMERINFO = intent.getStringExtra("CUSTOMERINFO")
        val CUSTOMERID = intent.getStringExtra("CUSTOMERID")

        payNow.setOnClickListener {

            val mar_id = ps_id.text.toString()
            val mar_name = ps_name.text.toString()
            val c_type  = card_type.text.toString()
            val c_b  = card_bank.text.toString()
            val c_nu = card_number.text.toString()
            val c_csv = card_csv.text.toString()
            val c_ed = card_edate.text.toString()
            val total_amount = total_amount.text.toString()
            val sdf = SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z")
            val currentDateandTime: String = sdf.format(Date())
            val CUSTOMERBILLPAYMENT = "$CUSTOMERINFO, $c_type, $c_b, $c_nu, $c_csv, $c_ed, $mar_id, $mar_name, $total_amount, $currentDateandTime"

            val intent = Intent(this, SendEncyptedData::class.java)
            intent.putExtra("CUSTOMERBILLPAYMENT", CUSTOMERBILLPAYMENT)
            intent.putExtra("CUSTOMERID", CUSTOMERID)
            startActivity(intent)
        }
    }

}
package com.webmah.powerservercustomerpaymentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_customerinfo.*

class CustomerInfo: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customerinfo)

        beginPayment.setOnClickListener {
            val tname = "CustomerPaymentTOPowerServer"
            val cid = cid.text.toString()
            val cname = cname.text.toString()
            val ctype = ctype.text.toString()
            val smid = smid.text.toString()
            val caddress = caddress.text.toString()
            val CUSTOMERINFO = "$tname, $cid, $cname, $ctype, $smid, $caddress"

            val intent = Intent(this, Payment::class.java)
            intent.putExtra("CUSTOMERINFO", CUSTOMERINFO)
            intent.putExtra("CUSTOMERID", cid)
            startActivity(intent)

        }

    }
}
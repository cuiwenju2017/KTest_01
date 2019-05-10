package com.cwj.ktest_01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.avi
import kotlinx.android.synthetic.main.activity_main.btn_hid
import kotlinx.android.synthetic.main.activity_main.btn_show

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_show.setOnClickListener(this)
        btn_hid.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_show -> {
                avi!!.show()
                avi2!!.show()
            }
            R.id.btn_hid -> {
                avi!!.hide()
                avi2!!.hide()
            }
            else -> {
            }
        }
    }

}

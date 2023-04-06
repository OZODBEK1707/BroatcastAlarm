package com.rosh.broatcastalarm

import android.content.Intent
import android.content.IntentFilter
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myGpsBroadCast = MyReceiver()
        val filter = IntentFilter(LocationManager.PROVIDERS_CHANGED_ACTION)
        filter.addAction(Intent.ACTION_PROVIDER_CHANGED)

        this.registerReceiver(myGpsBroadCast, filter)
    }
}
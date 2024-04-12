package com.example.flutter_application_self

import io.flutter.app.FlutterApplication
import com.moengage.flutter.MoEInitializer
import com.moengage.core.MoEngage
import com.moengage.core.DataCenter

class App: FlutterApplication() {

    override fun onCreate() {
        super.onCreate()
        val moEngage: MoEngage.Builder = MoEngage.Builder(this,"8SIW681S80Z08KSHQFSTIZ8T",DataCenter.DATA_CENTER_1)
        MoEInitializer.initialiseDefaultInstance(context = this, builder = moEngage)
    }
}
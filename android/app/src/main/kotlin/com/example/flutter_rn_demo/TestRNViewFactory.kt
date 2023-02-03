package com.example.flutter_rn_demo
import android.app.Activity
import android.content.Context
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory

//
//  android
//  com.shuinfo.digiprime_flutter
//
//  Created by jimmy on 2022/9/30.
//
class TestRNViewFactory (private val messenger: BinaryMessenger, private  val  activity: Activity) : PlatformViewFactory(StandardMessageCodec.INSTANCE){
    override fun create(context: Context?, viewId: Int, args: Any?): PlatformView {

        return TestRNView(context,activity, messenger, viewId, args as Map<String, Any>?)
    }

}
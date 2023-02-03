package com.example.flutter_rn_demo

import android.os.Bundle
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        flutterEngine?.dartExecutor?.binaryMessenger?.let { TestRNViewFactory(it, activity) }?.let {
            flutterEngine?.platformViewsController?.registry?.registerViewFactory("plugins.flutter.io/test_rn_view_plugin",
                it
            )
        }
    }
}

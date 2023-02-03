

package com.example.flutter_rn_demo

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.View
import com.facebook.react.PackageList
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactPackage
import com.facebook.react.ReactRootView
import com.facebook.react.bridge.CatalystInstance
import com.facebook.react.bridge.CatalystInstanceImpl
import com.facebook.react.common.LifecycleState
import com.facebook.react.shell.MainReactPackage
import com.facebook.soloader.SoLoader
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.platform.PlatformView
import java.lang.reflect.Method
import java.util.*


class TestRNView(context: Context?, activity: Activity, messenger: BinaryMessenger, viewId: Int, args: Map<String, Any>?) :
    PlatformView {
    private var mReactRootView: ReactRootView? = null
    private var mReactInstanceManager: ReactInstanceManager? = null

    init {
        SoLoader.init(context, false)

        mReactRootView = ReactRootView(context)
        val packages: List<ReactPackage> = PackageList(activity.application).packages
        // 有一些第三方可能不能自动链接，对于这些包我们可以用下面的方式手动添加进来：
        // packages.add(new MyReactNativePackage());
        // 同时需要手动把他们添加到`settings.gradle`和 `app/build.gradle`配置文件中。

        // 有一些第三方可能不能自动链接，对于这些包我们可以用下面的方式手动添加进来：
        // packages.add(new MyReactNativePackage());
        // 同时需要手动把他们添加到`settings.gradle`和 `app/build.gradle`配置文件中。
        mReactInstanceManager = ReactInstanceManager.builder()
            .setApplication(activity.application)
            .setCurrentActivity(activity)
            .setBundleAssetName("index.android.bundle")
            .setJSMainModulePath("index")
            .addPackages(packages)
            .setUseDeveloperSupport(BuildConfig.DEBUG)
            .setInitialLifecycleState(LifecycleState.RESUMED)
            .build()
        // 注意这里的MyReactNativeApp 必须对应"index.js"中的
        // "AppRegistry.registerComponent()"的第一个参数
        // 注意这里的MyReactNativeApp 必须对应"index.js"中的
        // "AppRegistry.registerComponent()"的第一个参数
//        mReactInstanceManager!!.addReactInstanceEventListener {
//            mReactRootView!!.startReactApplication(mReactInstanceManager, "rnproj", null)
//        }
        mReactRootView!!.startReactApplication(mReactInstanceManager, "rnproj", null)

//        mReactInstanceManager!!.addReactInstanceEventListener(ReactInstanceManager.ReactInstanceEventListener { reactContext ->
////            val catalystInstance: CatalystInstance = reactContext.catalystInstance
////            val loadScripFromFileMethod: Method =
////                CatalystInstanceImpl::class.java.getDeclaredMethod(
////                    "loadScriptFromFile",
////                    String::class.java,
////                    String::class.java,
////                    Boolean::class.javaPrimitiveType
////                )
////            loadScripFromFileMethod.setAccessible(true)
////// fileName 和 sourceURL 传入本地缓存的 bundle 路径，loadSynchronously 为是否同步加载
////// fileName 和 sourceURL 传入本地缓存的 bundle 路径，loadSynchronously 为是否同步加载
////            loadScripFromFileMethod.invoke(catalystInstance,"index.js", "index.android.bundle", true)
//            mReactRootView!!.startReactApplication(mReactInstanceManager, "rnproj", null)
//        })

    }



    override fun getView(): View? {
        print("jimmy11111111111111")
        Log.d("jimmy", "jimmy11111111111111")
        return  mReactRootView
    }

    override fun dispose() {
    }

}


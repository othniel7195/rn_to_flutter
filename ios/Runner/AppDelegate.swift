import UIKit
import Flutter


@UIApplicationMain
@objc class AppDelegate: FlutterAppDelegate {
    let d = AppDeleT()
  override func application(
    _ application: UIApplication,
    didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
  ) -> Bool {
    GeneratedPluginRegistrant.register(with: self)
      RCTAppSetupPrepareApp(application);
      let bridge = d.tTest(launchOptions)
      d.initTest()
      
      let registrar:FlutterPluginRegistrar = self.registrar(forPlugin: "plugins.flutter.io/rn_test_view_plugin")!
     let factory = RNTestViewFactory(messenger: registrar.messenger(), bridge: bridge)
     registrar.register(factory, withId: "plugins.flutter.io/test_rn_view_plugin")
      
      return super.application(application, didFinishLaunchingWithOptions: launchOptions)
  }
    
}

//
//  RNTestView.swift
//  Runner
//
//  Created by jimmy on 2023/2/2.
//

import UIKit


class RNTestView: NSObject, FlutterPlatformView {
    var rootView: UIView
    init(frame: CGRect , viewID: Int64 , args: Any?, messenger: FlutterBinaryMessenger, bridge: RCTBridge) {
        rootView = RCTAppSetupDefaultRootView(bridge, "rnproj", nil);
        rootView.frame = frame
        super.init()
    }
    func view() -> UIView {
        return rootView
    }
    
}

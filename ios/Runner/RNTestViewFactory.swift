//
//  RNTestViewFactory.swift
//  Runner
//
//  Created by jimmy on 2023/2/2.
//

import UIKit
import Flutter
import React

class RNTestViewFactory: NSObject, FlutterPlatformViewFactory {
    var messenger: FlutterBinaryMessenger
    var bridge: RCTBridge
        
    init(messenger: FlutterBinaryMessenger, bridge: RCTBridge) {
            self.messenger = messenger
        self.bridge = bridge
            super.init()
        }
        
        func create(withFrame frame: CGRect, viewIdentifier viewId: Int64, arguments args: Any?) -> FlutterPlatformView {
            return RNTestView(frame: frame, viewID: viewId, args: args, messenger: messenger, bridge: bridge)
        }
        
        func createArgsCodec() -> FlutterMessageCodec & NSObjectProtocol {
            return FlutterStandardMessageCodec.sharedInstance()
        }
}

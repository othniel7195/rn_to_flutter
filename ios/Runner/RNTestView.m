//
//  RNTestView.m
//  Runner
//
//  Created by jimmy on 2023/2/2.
//

#import "RNTestView.h"
#import <React/RCTAppSetupUtils.h>
#import <React/RCTRootView.h>

@implementation RNTestView
- (id) initWithFrame: (CGRect) frame viewID:(int64_t) viewID args: (nullable id) args messenger: (id<FlutterBinaryMessenger>)  messenger bridge: (RCTBridge *) bridge{
    if(self = [super init]) {
        self.rootView = RCTAppSetupDefaultRootView(bridge, @"rnproj", nil);
        self.rootView.frame = frame;
    }
    
    return self;
}
 
- (nonnull UIView *)view {
    
    return self.rootView;
}
@end

//
//  RNTestView.h
//  Runner
//
//  Created by jimmy on 2023/2/2.
//

#import <Foundation/Foundation.h>
#import <Flutter/FlutterPlatformViews.h>
#import <Flutter/FlutterBinaryMessenger.h>
#import <React/RCTBridge.h>
NS_ASSUME_NONNULL_BEGIN

@interface RNTestView : NSObject<FlutterPlatformView>
@property(nonatomic, strong)UIView *rootView;
- (id) initWithFrame: (CGRect) frame viewID:(int64_t) viewID args: (nullable id) args messenger: (id<FlutterBinaryMessenger>)  messenger bridge: (RCTBridge *) bridge;
@end

NS_ASSUME_NONNULL_END

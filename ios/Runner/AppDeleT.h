//
//  AppDeleT.h
//  Runner
//
//  Created by jimmy on 2023/2/2.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeDelegate.h>
#import <React/RCTBridge.h>
NS_ASSUME_NONNULL_BEGIN

@interface AppDeleT : NSObject<RCTBridgeDelegate>
-(void) initTest;
- (RCTBridge *) tTestT:(nullable NSDictionary *)launchOptions;
@end

NS_ASSUME_NONNULL_END

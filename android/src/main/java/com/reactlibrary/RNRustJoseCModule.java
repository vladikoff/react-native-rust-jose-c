
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.reactlibrary.RustJose;

public class RNRustJoseCModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNRustJoseCModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRustJoseC";
  }

  public String getVersion() {
    RustJose r = new RustJose();
    String version = r.getVersion();
    return version;
  }
}
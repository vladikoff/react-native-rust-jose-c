package com.reactlibrary;

public class RustJose {
    private static native String version();

    public String getVersion() {
        return version();
    }
}

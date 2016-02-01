package com.york.android.beatbox;

/**
 * Created by York on 2016/2/1.
 */
public class Sound {
    private String mAssetPath;
    private String mName;

    public Sound(String mAssetPath) {
        this.mAssetPath = mAssetPath;
        String[] components = mAssetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }
}

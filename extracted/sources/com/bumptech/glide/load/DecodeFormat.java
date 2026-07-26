package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DecodeFormat {
    public static final DecodeFormat a;
    public static final DecodeFormat b;
    public static final DecodeFormat c;
    public static final /* synthetic */ DecodeFormat[] d;

    static {
        DecodeFormat decodeFormat = new DecodeFormat("PREFER_ARGB_8888", 0);
        a = decodeFormat;
        DecodeFormat decodeFormat2 = new DecodeFormat("PREFER_RGB_565", 1);
        b = decodeFormat2;
        d = new DecodeFormat[]{decodeFormat, decodeFormat2};
        c = decodeFormat;
    }

    public static DecodeFormat valueOf(String str) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, str);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) d.clone();
    }
}

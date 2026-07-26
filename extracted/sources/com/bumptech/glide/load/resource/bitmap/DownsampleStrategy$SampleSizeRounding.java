package com.bumptech.glide.load.resource.bitmap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DownsampleStrategy$SampleSizeRounding {
    public static final DownsampleStrategy$SampleSizeRounding a;
    public static final DownsampleStrategy$SampleSizeRounding b;
    public static final /* synthetic */ DownsampleStrategy$SampleSizeRounding[] c;

    static {
        DownsampleStrategy$SampleSizeRounding downsampleStrategy$SampleSizeRounding = new DownsampleStrategy$SampleSizeRounding("MEMORY", 0);
        a = downsampleStrategy$SampleSizeRounding;
        DownsampleStrategy$SampleSizeRounding downsampleStrategy$SampleSizeRounding2 = new DownsampleStrategy$SampleSizeRounding("QUALITY", 1);
        b = downsampleStrategy$SampleSizeRounding2;
        c = new DownsampleStrategy$SampleSizeRounding[]{downsampleStrategy$SampleSizeRounding, downsampleStrategy$SampleSizeRounding2};
    }

    public static DownsampleStrategy$SampleSizeRounding valueOf(String str) {
        return (DownsampleStrategy$SampleSizeRounding) Enum.valueOf(DownsampleStrategy$SampleSizeRounding.class, str);
    }

    public static DownsampleStrategy$SampleSizeRounding[] values() {
        return (DownsampleStrategy$SampleSizeRounding[]) c.clone();
    }
}

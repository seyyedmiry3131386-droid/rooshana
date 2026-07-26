package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LottieFeatureFlag {
    public static final LottieFeatureFlag a;
    public static final /* synthetic */ LottieFeatureFlag[] b;

    static {
        LottieFeatureFlag lottieFeatureFlag = new LottieFeatureFlag("MergePathsApi19", 0);
        a = lottieFeatureFlag;
        b = new LottieFeatureFlag[]{lottieFeatureFlag};
    }

    public static LottieFeatureFlag valueOf(String str) {
        return (LottieFeatureFlag) Enum.valueOf(LottieFeatureFlag.class, str);
    }

    public static LottieFeatureFlag[] values() {
        return (LottieFeatureFlag[]) b.clone();
    }
}

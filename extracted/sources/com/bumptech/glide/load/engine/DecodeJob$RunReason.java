package com.bumptech.glide.load.engine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class DecodeJob$RunReason {
    public static final DecodeJob$RunReason a;
    public static final DecodeJob$RunReason b;
    public static final DecodeJob$RunReason c;
    public static final /* synthetic */ DecodeJob$RunReason[] d;

    static {
        DecodeJob$RunReason decodeJob$RunReason = new DecodeJob$RunReason("INITIALIZE", 0);
        a = decodeJob$RunReason;
        DecodeJob$RunReason decodeJob$RunReason2 = new DecodeJob$RunReason("SWITCH_TO_SOURCE_SERVICE", 1);
        b = decodeJob$RunReason2;
        DecodeJob$RunReason decodeJob$RunReason3 = new DecodeJob$RunReason("DECODE_DATA", 2);
        c = decodeJob$RunReason3;
        d = new DecodeJob$RunReason[]{decodeJob$RunReason, decodeJob$RunReason2, decodeJob$RunReason3};
    }

    public static DecodeJob$RunReason valueOf(String str) {
        return (DecodeJob$RunReason) Enum.valueOf(DecodeJob$RunReason.class, str);
    }

    public static DecodeJob$RunReason[] values() {
        return (DecodeJob$RunReason[]) d.clone();
    }
}

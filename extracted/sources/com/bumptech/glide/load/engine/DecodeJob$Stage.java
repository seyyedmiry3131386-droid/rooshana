package com.bumptech.glide.load.engine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class DecodeJob$Stage {
    public static final DecodeJob$Stage a;
    public static final DecodeJob$Stage b;
    public static final DecodeJob$Stage c;
    public static final DecodeJob$Stage d;
    public static final DecodeJob$Stage e;
    public static final DecodeJob$Stage f;
    public static final /* synthetic */ DecodeJob$Stage[] g;

    static {
        DecodeJob$Stage decodeJob$Stage = new DecodeJob$Stage("INITIALIZE", 0);
        a = decodeJob$Stage;
        DecodeJob$Stage decodeJob$Stage2 = new DecodeJob$Stage("RESOURCE_CACHE", 1);
        b = decodeJob$Stage2;
        DecodeJob$Stage decodeJob$Stage3 = new DecodeJob$Stage("DATA_CACHE", 2);
        c = decodeJob$Stage3;
        DecodeJob$Stage decodeJob$Stage4 = new DecodeJob$Stage("SOURCE", 3);
        d = decodeJob$Stage4;
        DecodeJob$Stage decodeJob$Stage5 = new DecodeJob$Stage("ENCODE", 4);
        e = decodeJob$Stage5;
        DecodeJob$Stage decodeJob$Stage6 = new DecodeJob$Stage("FINISHED", 5);
        f = decodeJob$Stage6;
        g = new DecodeJob$Stage[]{decodeJob$Stage, decodeJob$Stage2, decodeJob$Stage3, decodeJob$Stage4, decodeJob$Stage5, decodeJob$Stage6};
    }

    public static DecodeJob$Stage valueOf(String str) {
        return (DecodeJob$Stage) Enum.valueOf(DecodeJob$Stage.class, str);
    }

    public static DecodeJob$Stage[] values() {
        return (DecodeJob$Stage[]) g.clone();
    }
}

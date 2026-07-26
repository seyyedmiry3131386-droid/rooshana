package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RenderMode {
    public static final RenderMode a;
    public static final RenderMode b;
    public static final RenderMode c;
    public static final /* synthetic */ RenderMode[] d;

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        a = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        b = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        c = renderMode3;
        d = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) d.clone();
    }
}

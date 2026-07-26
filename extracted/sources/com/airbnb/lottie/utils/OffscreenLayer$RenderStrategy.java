package com.airbnb.lottie.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class OffscreenLayer$RenderStrategy {
    public static final OffscreenLayer$RenderStrategy a;
    public static final OffscreenLayer$RenderStrategy b;
    public static final OffscreenLayer$RenderStrategy c;
    public static final OffscreenLayer$RenderStrategy d;
    public static final /* synthetic */ OffscreenLayer$RenderStrategy[] e;

    static {
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy = new OffscreenLayer$RenderStrategy("DIRECT", 0);
        a = offscreenLayer$RenderStrategy;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy2 = new OffscreenLayer$RenderStrategy("SAVE_LAYER", 1);
        b = offscreenLayer$RenderStrategy2;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy3 = new OffscreenLayer$RenderStrategy("BITMAP", 2);
        c = offscreenLayer$RenderStrategy3;
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy4 = new OffscreenLayer$RenderStrategy("RENDER_NODE", 3);
        d = offscreenLayer$RenderStrategy4;
        e = new OffscreenLayer$RenderStrategy[]{offscreenLayer$RenderStrategy, offscreenLayer$RenderStrategy2, offscreenLayer$RenderStrategy3, offscreenLayer$RenderStrategy4};
    }

    public static OffscreenLayer$RenderStrategy valueOf(String str) {
        return (OffscreenLayer$RenderStrategy) Enum.valueOf(OffscreenLayer$RenderStrategy.class, str);
    }

    public static OffscreenLayer$RenderStrategy[] values() {
        return (OffscreenLayer$RenderStrategy[]) e.clone();
    }
}

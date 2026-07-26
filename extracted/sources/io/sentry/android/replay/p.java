package io.sentry.android.replay;

import io.sentry.ScreenshotStrategyType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScreenshotStrategyType.values().length];
        try {
            iArr[ScreenshotStrategyType.CANVAS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenshotStrategyType.PIXEL_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

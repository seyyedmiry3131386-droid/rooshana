package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SentryGestureListener$GestureType.values().length];
        a = iArr;
        try {
            iArr[SentryGestureListener$GestureType.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SentryGestureListener$GestureType.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SentryGestureListener$GestureType.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[SentryGestureListener$GestureType.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

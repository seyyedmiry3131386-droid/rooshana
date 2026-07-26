package io.sentry.android.core;

import io.sentry.ProfileLifecycle;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProfileLifecycle.values().length];
        a = iArr;
        try {
            iArr[ProfileLifecycle.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ProfileLifecycle.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}

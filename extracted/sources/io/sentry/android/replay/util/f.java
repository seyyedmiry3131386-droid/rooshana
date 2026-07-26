package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SystemProperties$Property.values().length];
        try {
            iArr[SystemProperties$Property.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SystemProperties$Property.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

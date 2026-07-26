package defpackage;

import ir.mservices.market.reels.home.data.ReelsHomeDisplayMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class i17 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReelsHomeDisplayMode.values().length];
        try {
            iArr[ReelsHomeDisplayMode.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReelsHomeDisplayMode.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

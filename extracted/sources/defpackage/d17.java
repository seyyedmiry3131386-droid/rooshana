package defpackage;

import ir.mservices.market.reels.data.ReelAdType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d17 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReelAdType.values().length];
        try {
            iArr[ReelAdType.APP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReelAdType.LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

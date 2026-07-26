package defpackage;

import ir.mservices.market.reels.data.ReelType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class y17 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReelType.values().length];
        try {
            iArr[ReelType.REELS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReelType.ADS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

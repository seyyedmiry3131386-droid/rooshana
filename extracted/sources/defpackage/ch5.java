package defpackage;

import ir.mservices.market.social.mynet.data.MynetItemType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ch5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MynetItemType.values().length];
        try {
            iArr[MynetItemType.USERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MynetItemType.APP_BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MynetItemType.MOVIE_BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

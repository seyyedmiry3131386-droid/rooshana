package defpackage;

import ir.mservices.market.data.install.PostInstall;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hf1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PostInstall.values().length];
        a = iArr;
        try {
            iArr[PostInstall.OpenIntent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[PostInstall.ShowDialog.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[PostInstall.OpenDirectly.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[PostInstall.Default.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

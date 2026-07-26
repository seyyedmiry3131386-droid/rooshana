package defpackage;

import ir.mservices.market.data.install.PostInstall;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ze5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PostInstall.values().length];
        a = iArr;
        try {
            iArr[PostInstall.ShowDialog.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[PostInstall.OpenDirectly.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[PostInstall.OpenIntent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[PostInstall.Default.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

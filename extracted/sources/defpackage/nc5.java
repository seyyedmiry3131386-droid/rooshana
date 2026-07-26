package defpackage;

import ir.mservices.market.myAccount.MyAccountItemsType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class nc5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MyAccountItemsType.values().length];
        try {
            MyAccountItemsType myAccountItemsType = MyAccountItemsType.b;
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            MyAccountItemsType myAccountItemsType2 = MyAccountItemsType.b;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MyAccountItemsType myAccountItemsType3 = MyAccountItemsType.b;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MyAccountItemsType myAccountItemsType4 = MyAccountItemsType.b;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            MyAccountItemsType myAccountItemsType5 = MyAccountItemsType.b;
            iArr[5] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}

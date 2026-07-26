package defpackage;

import ir.mservices.market.myAccount.MyAccountItemsType;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class tc5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MyAccountItemsType.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            MyAccountItemsType myAccountItemsType = MyAccountItemsType.b;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            MyAccountItemsType myAccountItemsType2 = MyAccountItemsType.b;
            iArr[5] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            MyAccountItemsType myAccountItemsType3 = MyAccountItemsType.b;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            MyAccountItemsType myAccountItemsType4 = MyAccountItemsType.b;
            iArr[3] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[DialogResult.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            DialogResult dialogResult = DialogResult.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr2;
    }
}

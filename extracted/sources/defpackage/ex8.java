package defpackage;

import ir.myket.theme.common.colors.models.UiMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ex8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UiMode.values().length];
        try {
            UiMode uiMode = UiMode.a;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}

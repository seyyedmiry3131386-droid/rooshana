package defpackage;

import androidx.paging.LoadType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class fz5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadType.values().length];
        try {
            LoadType loadType = LoadType.a;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}

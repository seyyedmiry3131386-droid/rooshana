package defpackage;

import androidx.paging.LoadType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dz5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LoadType.values().length];
        try {
            LoadType loadType = LoadType.a;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LoadType loadType2 = LoadType.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LoadType loadType3 = LoadType.a;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

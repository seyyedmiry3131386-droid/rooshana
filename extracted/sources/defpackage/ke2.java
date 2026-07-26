package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ke2 {
    public static final float[] a;

    static {
        long[] jArr = ce7.a;
        int iD = ce7.d(0);
        int iMax = iD > 0 ? Math.max(7, ce7.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ew.H0(jArr, -9187201950435737472L);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        float[] fArr = new float[iMax];
        a = new float[0];
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q29 {
    public static final long a = j31.b(0, 0, 5);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.my7 a(defpackage.q41 r2, defpackage.qz0 r3) {
        /*
            md2 r0 = defpackage.p41.d
            boolean r2 = defpackage.js3.i(r2, r0)
            boolean r0 = r3.g(r2)
            java.lang.Object r1 = r3.M()
            if (r0 != 0) goto L14
            av r0 = defpackage.jz0.a
            if (r1 != r0) goto L2e
        L14:
            if (r2 == 0) goto L1a
            gw6 r2 = defpackage.my7.a
        L18:
            r1 = r2
            goto L2b
        L1a:
            coil3.compose.b r2 = new coil3.compose.b
            r2.<init>()
            long r0 = defpackage.q29.a
            r2.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.c = r0
            goto L18
        L2b:
            r3.l0(r1)
        L2e:
            my7 r1 = (defpackage.my7) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q29.a(q41, qz0):my7");
    }

    public static final long b(long j) {
        int iV = ok4.V(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) ok4.V(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iV) << 32);
    }

    public static void c(String str) {
        throw new IllegalArgumentException(dw1.o("Unsupported type: ", str, ". ", o40.y("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}

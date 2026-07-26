package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j37 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final gx4 g;

    public j37(long j, long j2, long j3, long j4, long j5, float[] fArr, gx4 gx4Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = gx4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<j37> r2 = defpackage.j37.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            j37 r7 = (defpackage.j37) r7
            long r2 = r6.a
            long r4 = r7.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.b
            long r4 = r7.b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.e
            long r4 = r7.e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.c
            long r4 = r7.c
            boolean r2 = defpackage.rq3.a(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.d
            long r4 = r7.d
            boolean r2 = defpackage.rq3.a(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f
            float[] r3 = r6.f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            gx4 r2 = r6.g
            gx4 r7 = r7.g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j37.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (((int) (j4 ^ (j4 >>> 32))) + i2) * 31;
        long j5 = this.d;
        int i4 = (((int) (j5 ^ (j5 >>> 32))) + i3) * 31;
        float[] fArr = this.f;
        return this.g.hashCode() + ((i4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}

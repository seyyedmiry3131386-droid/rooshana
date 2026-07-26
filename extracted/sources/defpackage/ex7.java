package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ex7 extends bm8 {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final jp4 o;
    public final ep4 p;

    static {
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        Uri uri = Uri.EMPTY;
        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
        if (uri != null) {
            new fp4(uri, null, ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list, null, immutableListQ, -9223372036854775807L);
        }
        new ap4(yo4Var);
        new ep4(dp4Var);
        qp4 qp4Var = qp4.K;
    }

    public ex7(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, cv cvVar, jp4 jp4Var, ep4 ep4Var) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = cvVar;
        jp4Var.getClass();
        this.o = jp4Var;
        this.p = ep4Var;
    }

    @Override // defpackage.bm8
    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    @Override // defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        vy2.l(i, 1);
        Object obj = z ? q : null;
        long j = -this.i;
        yl8Var.getClass();
        yl8Var.i(null, obj, 0, this.g, j, bb.f, false);
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final int h() {
        return 1;
    }

    @Override // defpackage.bm8
    public final Object l(int i) {
        vy2.l(i, 1);
        return q;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
      0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v4 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bm8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.am8 m(int r25, defpackage.am8 r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.vy2.l(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L2d
            boolean r3 = r0.m
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.h
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = defpackage.am8.q
            r21 = 0
            long r1 = r0.i
            jp4 r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.e
            long r9 = r0.f
            boolean r13 = r0.k
            ep4 r15 = r0.p
            long r11 = r0.h
            r20 = 0
            r3 = r26
            r22 = r1
            r18 = r11
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex7.m(int, am8, long):am8");
    }

    @Override // defpackage.bm8
    public final int o() {
        return 1;
    }
}

package kotlinx.coroutines.flow;

import defpackage.cq2;
import defpackage.g51;
import defpackage.gu7;
import defpackage.hu7;
import defpackage.im0;
import defpackage.js3;
import defpackage.m91;
import defpackage.mu3;
import defpackage.ok4;
import defpackage.om0;
import defpackage.tx8;
import defpackage.u2;
import defpackage.ub5;
import defpackage.v2;
import defpackage.vy2;
import defpackage.w61;
import defpackage.xe2;
import defpackage.ze2;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public class i extends u2 implements ub5, xe2, cq2 {
    public final int e;
    public final int f;
    public final BufferOverflow g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public i(int i, int i2, BufferOverflow bufferOverflow) {
        this.e = i;
        this.f = i2;
        this.g = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        throw r2.I();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(kotlinx.coroutines.flow.i r8, defpackage.ze2 r9, defpackage.g51 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i.p(kotlinx.coroutines.flow.i, ze2, g51):void");
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) throws Throwable {
        p(this, ze2Var, g51Var);
        return CoroutineSingletons.a;
    }

    @Override // defpackage.ub5
    public final void b() throws Throwable {
        synchronized (this) {
            try {
                try {
                    y(t() + ((long) this.k), this.j, t() + ((long) this.k), t() + ((long) this.k) + ((long) this.l));
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.cq2
    public final xe2 c(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return vy2.A(this, w61Var, i, bufferOverflow);
    }

    @Override // defpackage.ub5
    public final boolean e(Object obj) {
        int i;
        boolean z;
        g51[] g51VarArrS = m91.a;
        synchronized (this) {
            if (v(obj)) {
                g51VarArrS = s(g51VarArrS);
                z = true;
            } else {
                z = false;
            }
        }
        for (g51 g51Var : g51VarArrS) {
            if (g51Var != null) {
                g51Var.resumeWith(tx8.a);
            }
        }
        return z;
    }

    @Override // defpackage.ub5, defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) throws Throwable {
        Throwable th;
        g51[] g51VarArrS;
        gu7 gu7Var;
        if (e(obj)) {
            return tx8.a;
        }
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        g51[] g51VarArrS2 = m91.a;
        synchronized (this) {
            try {
                if (v(obj)) {
                    try {
                        om0Var.resumeWith(tx8.a);
                        g51VarArrS = s(g51VarArrS2);
                        gu7Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        gu7 gu7Var2 = new gu7(this, t() + ((long) (this.k + this.l)), obj, om0Var);
                        r(gu7Var2);
                        this.l++;
                        if (this.f == 0) {
                            g51VarArrS2 = s(g51VarArrS2);
                        }
                        g51VarArrS = g51VarArrS2;
                        gu7Var = gu7Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (gu7Var != null) {
                    om0Var.y(new im0(2, gu7Var));
                }
                for (g51 g51Var2 : g51VarArrS) {
                    if (g51Var2 != null) {
                        g51Var2.resumeWith(tx8.a);
                    }
                }
                Object objU = om0Var.u();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                if (objU != coroutineSingletons) {
                    objU = tx8.a;
                }
                return objU == coroutineSingletons ? objU : tx8.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // defpackage.u2
    public final v2 g() {
        hu7 hu7Var = new hu7();
        hu7Var.a = -1L;
        return hu7Var;
    }

    @Override // defpackage.u2
    public final v2[] h() {
        return new hu7[2];
    }

    public final Object n(hu7 hu7Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        synchronized (this) {
            try {
                if (w(hu7Var) < 0) {
                    hu7Var.b = om0Var;
                } else {
                    om0Var.resumeWith(tx8.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objU = om0Var.u();
        return objU == CoroutineSingletons.a ? objU : tx8.a;
    }

    public final void o() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            js3.m(objArr);
            while (this.l > 0) {
                long jT = t();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((jT + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != vy2.i) {
                    return;
                }
                this.l = i2 - 1;
                vy2.f(objArr, t() + ((long) (this.k + this.l)), null);
            }
        }
    }

    public final void q() {
        v2[] v2VarArr;
        Object[] objArr = this.h;
        js3.m(objArr);
        vy2.f(objArr, t(), null);
        this.k--;
        long jT = t() + 1;
        if (this.i < jT) {
            this.i = jT;
        }
        if (this.j < jT) {
            if (this.a != 0 && (v2VarArr = (v2[]) this.c) != null) {
                for (v2 v2Var : v2VarArr) {
                    if (v2Var != null) {
                        hu7 hu7Var = (hu7) v2Var;
                        long j = hu7Var.a;
                        if (j >= 0 && j < jT) {
                            hu7Var.a = jT;
                        }
                    }
                }
            }
            this.j = jT;
        }
    }

    public final void r(Object obj) {
        int i = this.k + this.l;
        Object[] objArrU = this.h;
        if (objArrU == null) {
            objArrU = u(null, 0, 2);
        } else if (i >= objArrU.length) {
            objArrU = u(objArrU, i, objArrU.length * 2);
        }
        vy2.f(objArrU, t() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [g51[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final g51[] s(g51[] g51VarArr) {
        v2[] v2VarArr;
        hu7 hu7Var;
        om0 om0Var;
        int length = g51VarArr.length;
        if (this.a != 0 && (v2VarArr = (v2[]) this.c) != null) {
            int length2 = v2VarArr.length;
            int i = 0;
            g51VarArr = g51VarArr;
            while (i < length2) {
                v2 v2Var = v2VarArr[i];
                if (v2Var != null && (om0Var = (hu7Var = (hu7) v2Var).b) != null && w(hu7Var) >= 0) {
                    int length3 = g51VarArr.length;
                    g51VarArr = g51VarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) g51VarArr, Math.max(2, g51VarArr.length * 2));
                        js3.o(objArrCopyOf, "copyOf(...)");
                        g51VarArr = objArrCopyOf;
                    }
                    ((g51[]) g51VarArr)[length] = om0Var;
                    hu7Var.b = null;
                    length++;
                }
                i++;
                g51VarArr = g51VarArr;
            }
        }
        return (g51[]) g51VarArr;
    }

    public final long t() {
        return Math.min(this.j, this.i);
    }

    public final Object[] u(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long jT = t();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jT;
                vy2.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.a
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.r(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r2) goto L18
            r12.q()
        L18:
            long r1 = r12.t()
            int r3 = r12.k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.j = r1
            return r9
        L23:
            int r1 = r12.k
            int r3 = r12.f
            if (r1 < r3) goto L47
            long r4 = r12.j
            long r6 = r12.i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            kotlinx.coroutines.channels.BufferOverflow r1 = r12.g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.r(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r3) goto L54
            r12.q()
        L54:
            long r3 = r12.t()
            int r1 = r12.k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.j
            long r5 = r12.t()
            int r7 = r12.k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.t()
            int r10 = r12.k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.y(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i.v(java.lang.Object):boolean");
    }

    public final long w(hu7 hu7Var) {
        long j = hu7Var.a;
        if (j < t() + ((long) this.k)) {
            return j;
        }
        if (this.f <= 0 && j <= t() && this.l != 0) {
            return j;
        }
        return -1L;
    }

    public final Object x(hu7 hu7Var) {
        Object obj;
        g51[] g51VarArrZ = m91.a;
        synchronized (this) {
            try {
                long jW = w(hu7Var);
                if (jW < 0) {
                    obj = vy2.i;
                } else {
                    long j = hu7Var.a;
                    Object[] objArr = this.h;
                    js3.m(objArr);
                    Object obj2 = objArr[((int) jW) & (objArr.length - 1)];
                    if (obj2 instanceof gu7) {
                        obj2 = ((gu7) obj2).c;
                    }
                    hu7Var.a = jW + 1;
                    Object obj3 = obj2;
                    g51VarArrZ = z(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (g51 g51Var : g51VarArrZ) {
            if (g51Var != null) {
                g51Var.resumeWith(tx8.a);
            }
        }
        return obj;
    }

    public final void y(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jT = t(); jT < jMin; jT++) {
            Object[] objArr = this.h;
            js3.m(objArr);
            vy2.f(objArr, jT, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - jMin);
        this.l = (int) (j4 - j3);
    }

    public final g51[] z(long j) {
        long j2;
        long j3;
        long j4;
        g51[] g51VarArr;
        g51[] g51VarArr2;
        v2[] v2VarArr;
        mu3 mu3Var = vy2.i;
        g51[] g51VarArr3 = m91.a;
        if (j <= this.j) {
            long jT = t();
            long j5 = ((long) this.k) + jT;
            int i = this.f;
            if (i == 0 && this.l > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.a != 0 && (v2VarArr = (v2[]) this.c) != null) {
                for (v2 v2Var : v2VarArr) {
                    if (v2Var != null) {
                        long j6 = ((hu7) v2Var).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.j) {
                long jT2 = t() + ((long) this.k);
                int iMin = this.a > 0 ? Math.min(this.l, i - ((int) (jT2 - j5))) : this.l;
                long j7 = ((long) this.l) + jT2;
                if (iMin > 0) {
                    j4 = 1;
                    Object[] objArr = this.h;
                    js3.m(objArr);
                    j2 = jT;
                    g51[] g51VarArr4 = new g51[iMin];
                    long j8 = jT2;
                    while (true) {
                        if (jT2 >= j7) {
                            g51VarArr2 = g51VarArr4;
                            j3 = j5;
                            break;
                        }
                        g51VarArr2 = g51VarArr4;
                        Object obj = objArr[(objArr.length - 1) & ((int) jT2)];
                        if (obj != mu3Var) {
                            js3.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            gu7 gu7Var = (gu7) obj;
                            int i3 = i2 + 1;
                            j3 = j5;
                            g51VarArr2[i2] = gu7Var.d;
                            vy2.f(objArr, jT2, mu3Var);
                            vy2.f(objArr, j8, gu7Var.c);
                            j8++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j3 = j5;
                        }
                        jT2++;
                        g51VarArr4 = g51VarArr2;
                        j5 = j3;
                    }
                    jT2 = j8;
                    g51VarArr = g51VarArr2;
                } else {
                    j2 = jT;
                    j3 = j5;
                    j4 = 1;
                    g51VarArr = g51VarArr3;
                }
                int i4 = (int) (jT2 - j2);
                long j9 = this.a == 0 ? jT2 : j3;
                long jMax = Math.max(this.i, jT2 - ((long) Math.min(this.e, i4)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.h;
                    js3.m(objArr2);
                    if (js3.i(objArr2[((int) jMax) & (objArr2.length - 1)], mu3Var)) {
                        jT2 += j4;
                        jMax += j4;
                    }
                }
                y(jMax, j9, jT2, j7);
                o();
                return g51VarArr.length == 0 ? g51VarArr : s(g51VarArr);
            }
        }
        return g51VarArr3;
    }
}

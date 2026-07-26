package defpackage;

import androidx.compose.runtime.snapshots.a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class vb5 extends c08 {
    public static final int[] n = new int[0];
    public final dp2 e;
    public final dp2 f;
    public int g;
    public sb5 h;
    public ArrayList i;
    public a j;
    public int[] k;
    public int l;
    public boolean m;

    public vb5(long j, a aVar, dp2 dp2Var, dp2 dp2Var2) {
        super(j, aVar);
        this.e = dp2Var;
        this.f = dp2Var2;
        this.j = a.e;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (g08.c) {
            this.j = this.j.f(j);
        }
    }

    public final void B(a aVar) {
        synchronized (g08.c) {
            this.j = this.j.e(aVar);
        }
    }

    public void C(sb5 sb5Var) {
        this.h = sb5Var;
    }

    public vb5 D(dp2 dp2Var, dp2 dp2Var2) throws Throwable {
        if (this.c) {
            wi6.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            wi6.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = g08.c;
        synchronized (obj) {
            try {
                long j = g08.e;
                long j2 = 1;
                g08.e = j + j2;
                g08.d = g08.d.f(j);
                a aVarD = d();
                r(aVarD.f(j));
                try {
                    em5 em5Var = new em5(j, g08.d(aVarD, g() + j2, j), g08.k(dp2Var, e(), true), g08.l(dp2Var2, i()), this);
                    if (this.m || this.c) {
                        return em5Var;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j3 = g08.e;
                        g08.e = j3 + j2;
                        s(j3);
                        g08.d = g08.d.f(g());
                    }
                    r(g08.d(d(), jG + j2, g()));
                    return em5Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.c08
    public final void b() {
        g08.d = g08.d.c(g()).a(this.j);
    }

    @Override // defpackage.c08
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (g08.c) {
            o();
        }
        l();
    }

    @Override // defpackage.c08
    public boolean f() {
        return false;
    }

    @Override // defpackage.c08
    public int h() {
        return this.g;
    }

    @Override // defpackage.c08
    public dp2 i() {
        return this.f;
    }

    @Override // defpackage.c08
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.c08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.wi6.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            sb5 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.wi6.b(r2)
        L27:
            r2 = 0
            r0.C(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            e58 r13 = (defpackage.e58) r13
            g58 r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            androidx.compose.runtime.snapshots.a r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = kotlin.collections.a.h0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            vd7 r6 = defpackage.g08.a
            r14 = 0
            r13.a = r14
        L83:
            g58 r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb5.l():void");
    }

    @Override // defpackage.c08
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.c08
    public void n(e58 e58Var) {
        sb5 sb5VarX = x();
        if (sb5VarX == null) {
            sb5 sb5Var = de7.a;
            sb5VarX = new sb5();
            C(sb5VarX);
        }
        sb5VarX.d(e58Var);
    }

    @Override // defpackage.c08
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            g08.v(this.k[i]);
        }
        o();
    }

    @Override // defpackage.c08
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.c08
    public c08 u(dp2 dp2Var) throws Throwable {
        if (this.c) {
            wi6.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            wi6.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = g08.c;
        synchronized (obj) {
            try {
                long j = g08.e;
                long j2 = 1;
                g08.e = j + j2;
                g08.d = g08.d.f(j);
                try {
                    fm5 fm5Var = new fm5(j, g08.d(d(), jG + j2, j), g08.k(dp2Var, e(), true), this);
                    if (this.m || this.c) {
                        return fm5Var;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j3 = g08.e;
                        g08.e = j3 + j2;
                        s(j3);
                        g08.d = g08.d.f(g());
                    }
                    r(g08.d(d(), jG2 + j2, g()));
                    return fm5Var;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (g08.c) {
            long j2 = g08.e;
            j = 1;
            g08.e = j2 + j;
            s(j2);
            g08.d = g08.d.f(g());
        }
        r(g08.d(d(), jG + j, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.t17 w() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vb5.w():t17");
    }

    public sb5 x() {
        return this.h;
    }

    @Override // defpackage.c08
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public dp2 e() {
        return this.e;
    }

    public final t17 z(long j, sb5 sb5Var, HashMap map, a aVar) {
        ArrayList arrayList;
        ArrayList arrayListZ0;
        ArrayList arrayList2;
        a aVar2;
        Object[] objArr;
        long[] jArr;
        a aVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        g58 g58VarC;
        a aVarE = d().f(g()).e(this.j);
        Object[] objArr3 = sb5Var.b;
        long[] jArr3 = sb5Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListZ0 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            e58 e58Var = (e58) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            g58 g58VarA = e58Var.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            g58 g58VarT = g08.t(g58VarA, j, aVar);
                            if (g58VarT == null) {
                                aVar3 = aVarE;
                                arrayList3 = arrayListZ0;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListZ0;
                                j2 = j3;
                                g58 g58VarT2 = g08.t(g58VarA, g(), aVarE);
                                if (g58VarT2 == null) {
                                    aVar3 = aVarE;
                                } else {
                                    aVar3 = aVarE;
                                    if (g58VarT2.a != 1 && !g58VarT.equals(g58VarT2)) {
                                        g58 g58VarT3 = g08.t(g58VarA, g(), d());
                                        if (g58VarT3 == null) {
                                            g08.s();
                                            throw null;
                                        }
                                        if (map == null || (g58VarC = (g58) map.get(g58VarT)) == null) {
                                            g58VarC = e58Var.c(g58VarT2, g58VarT, g58VarT3);
                                        }
                                        if (g58VarC == null) {
                                            return new d08(this);
                                        }
                                        if (!g58VarC.equals(g58VarT3)) {
                                            if (g58VarC.equals(g58VarT)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new Pair(e58Var, g58VarT.b(g())));
                                                arrayListZ0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListZ0.add(e58Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!g58VarC.equals(g58VarT2) ? new Pair(e58Var, g58VarC) : new Pair(e58Var, g58VarT2.b(g())));
                                            }
                                        }
                                        arrayListZ0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListZ0 = arrayList3;
                        } else {
                            aVar3 = aVarE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        aVarE = aVar3;
                    }
                    aVar2 = aVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    aVar2 = aVarE;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                aVarE = aVar2;
            }
        } else {
            arrayList = null;
            arrayListZ0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                e58 e58Var2 = (e58) pair.a;
                g58 g58Var = (g58) pair.b;
                g58Var.a = j;
                synchronized (g08.c) {
                    g58Var.b = e58Var2.a();
                    e58Var2.d(g58Var);
                }
            }
        }
        if (arrayListZ0 != null) {
            int size2 = arrayListZ0.size();
            for (int i6 = 0; i6 < size2; i6++) {
                sb5Var.l((e58) arrayListZ0.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListZ0 = kotlin.collections.a.z0(arrayListZ0, arrayList6);
            }
            this.i = arrayListZ0;
        }
        return e08.d;
    }
}

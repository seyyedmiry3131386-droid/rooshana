package defpackage;

import android.os.Trace;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.node.i;
import androidx.compose.ui.node.j;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class tf8 extends gx4 implements f14, gv1, in7 {
    public Map A;
    public s95 B;
    public rf8 C;
    public sf8 D;
    public ll o;
    public gj8 p;
    public oh2 q;
    public dp2 r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public List w;
    public dp2 x;
    public iv0 y;
    public dp2 z;

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    public final s95 C0() {
        if (this.B == null) {
            this.B = new s95(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w);
        }
        s95 s95Var = this.B;
        js3.m(s95Var);
        return s95Var;
    }

    public final s95 D0(qj1 qj1Var) {
        s95 s95Var;
        sf8 sf8Var = this.D;
        if (sf8Var != null && sf8Var.c && (s95Var = sf8Var.d) != null) {
            s95Var.d(qj1Var);
            return s95Var;
        }
        s95 s95VarC0 = C0();
        s95VarC0.d(qj1Var);
        return s95VarC0;
    }

    @Override // defpackage.gv1
    public final /* synthetic */ void H() {
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        boolean z;
        if (!this.n) {
            return;
        }
        tm0 tm0VarV = iVar.a.b.v();
        s95 s95VarD0 = D0(iVar);
        ri8 ri8Var = s95VarD0.n;
        if (ri8Var == null) {
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + s95VarD0);
        }
        q95 q95Var = ri8Var.b;
        long j = ri8Var.c;
        boolean z2 = true;
        boolean z3 = (((float) ((int) (j >> 32))) < q95Var.d || q95Var.c || ((float) ((int) (j & 4294967295L))) < q95Var.e) && this.s != 3;
        if (z3) {
            sy6 sy6VarC = ry7.c(0L, (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L)))));
            tm0VarV.e();
            tm0VarV.s(sy6VarC);
        }
        try {
            c28 c28Var = this.p.a;
            qg8 qg8Var = c28Var.m;
            if (qg8Var == null) {
                qg8Var = qg8.b;
            }
            qg8 qg8Var2 = qg8Var;
            ur7 ur7Var = c28Var.n;
            if (ur7Var == null) {
                ur7Var = ur7.d;
            }
            ur7 ur7Var2 = ur7Var;
            iv1 iv1Var = c28Var.p;
            if (iv1Var == null) {
                iv1Var = dc2.a;
            }
            iv1 iv1Var2 = iv1Var;
            ch0 ch0VarE = c28Var.a.e();
            if (ch0VarE != null) {
                q95.j(q95Var, tm0VarV, ch0VarE, this.p.a.a.a(), ur7Var2, qg8Var2, iv1Var2);
            } else {
                iv0 iv0Var = this.y;
                long jA = iv0Var != null ? iv0Var.a() : zu0.h;
                if (jA == 16) {
                    jA = this.p.b() != 16 ? this.p.b() : zu0.b;
                }
                q95.i(q95Var, tm0VarV, jA, ur7Var2, qg8Var2, iv1Var2);
            }
            if (z3) {
                tm0VarV.o();
            }
            sf8 sf8Var = this.D;
            if (sf8Var == null || !sf8Var.c) {
                ll llVar = this.o;
                int length = llVar.b.length();
                List list = llVar.a;
                z = false;
                if (list != null) {
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        kl klVar = (kl) list.get(i);
                        if ((klVar.a instanceof r74) && ml.b(0, length, klVar.b, klVar.c)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                List list2 = this.w;
                if (list2 != null && !list2.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            iVar.a();
        } finally {
        }
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        return d77.a(D0(jVar).e(jVar.getLayoutDirection()).c());
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        return D0(jVar).a(i, jVar.getLayoutDirection());
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            s95 s95VarD0 = D0(el4Var);
            boolean zC = s95VarD0.c(j, el4Var.getLayoutDirection());
            ri8 ri8Var = s95VarD0.n;
            if (ri8Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + s95VarD0);
            }
            long j2 = ri8Var.c;
            ri8Var.b.a.b();
            if (zC) {
                y40.E(this, 2).Q0();
                dp2 dp2Var = this.r;
                if (dp2Var != null) {
                    dp2Var.invoke(ri8Var);
                }
                Map linkedHashMap = this.A;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(a.a, Integer.valueOf(Math.round(ri8Var.d)));
                linkedHashMap.put(a.b, Integer.valueOf(Math.round(ri8Var.e)));
                this.A = linkedHashMap;
            }
            dp2 dp2Var2 = this.x;
            if (dp2Var2 != null) {
                dp2Var2.invoke(ri8Var.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            b96 b96VarT = yk4Var.t(vy2.y(i, i, i2, i2));
            Map map = this.A;
            js3.m(map);
            dl4 dl4VarD = el4Var.D(i, i2, map, new q(b96VarT, 9));
            Trace.endSection();
            return dl4VarD;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        return d77.a(D0(jVar).e(jVar.getLayoutDirection()).d());
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        return D0(jVar).a(i, jVar.getLayoutDirection());
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dp2] */
    /* JADX WARN: Type inference failed for: r0v2, types: [rf8] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        rf8 rf8Var = this.C;
        ?? r0 = rf8Var;
        if (rf8Var == null) {
            final int i = 0;
            ?? r02 = new dp2(this) { // from class: rf8
                public final /* synthetic */ tf8 b;

                {
                    this.b = this;
                }

                @Override // defpackage.dp2
                public final Object invoke(Object obj) {
                    ri8 ri8Var;
                    boolean z;
                    switch (i) {
                        case 0:
                            List list = (List) obj;
                            tf8 tf8Var = this.b;
                            ri8 ri8Var2 = tf8Var.C0().n;
                            if (ri8Var2 != null) {
                                qi8 qi8Var = ri8Var2.a;
                                ll llVar = qi8Var.a;
                                gj8 gj8Var = tf8Var.p;
                                iv0 iv0Var = tf8Var.y;
                                ri8Var = new ri8(new qi8(llVar, gj8.e(gj8Var, iv0Var != null ? iv0Var.a() : zu0.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), qi8Var.c, qi8Var.d, qi8Var.e, qi8Var.f, qi8Var.g, qi8Var.h, qi8Var.i, qi8Var.j), ri8Var2.b, ri8Var2.c);
                                list.add(ri8Var);
                            } else {
                                ri8Var = null;
                            }
                            return Boolean.valueOf(ri8Var != null);
                        case 1:
                            ll llVar2 = (ll) obj;
                            tf8 tf8Var2 = this.b;
                            sf8 sf8Var = tf8Var2.D;
                            if (sf8Var == null) {
                                sf8 sf8Var2 = new sf8(tf8Var2.o, llVar2);
                                s95 s95Var = new s95(llVar2, tf8Var2.p, tf8Var2.q, tf8Var2.s, tf8Var2.t, tf8Var2.u, tf8Var2.v, EmptyList.a);
                                s95Var.d(tf8Var2.C0().j);
                                sf8Var2.d = s95Var;
                                tf8Var2.D = sf8Var2;
                            } else if (!js3.i(llVar2, sf8Var.b)) {
                                sf8Var.b = llVar2;
                                s95 s95Var2 = sf8Var.d;
                                if (s95Var2 != null) {
                                    gj8 gj8Var2 = tf8Var2.p;
                                    oh2 oh2Var = tf8Var2.q;
                                    int i2 = tf8Var2.s;
                                    boolean z2 = tf8Var2.t;
                                    int i3 = tf8Var2.u;
                                    int i4 = tf8Var2.v;
                                    EmptyList emptyList = EmptyList.a;
                                    s95Var2.a = llVar2;
                                    boolean zC = gj8Var2.c(s95Var2.k);
                                    s95Var2.k = gj8Var2;
                                    if (!zC) {
                                        s95Var2.q <<= 2;
                                        s95Var2.l = null;
                                        s95Var2.n = null;
                                        s95Var2.p = -1;
                                        s95Var2.o = -1;
                                    }
                                    s95Var2.b = oh2Var;
                                    s95Var2.c = i2;
                                    s95Var2.d = z2;
                                    s95Var2.e = i3;
                                    s95Var2.f = i4;
                                    s95Var2.g = emptyList;
                                    s95Var2.q = (s95Var2.q << 2) | 2;
                                    s95Var2.l = null;
                                    s95Var2.n = null;
                                    s95Var2.p = -1;
                                    s95Var2.o = -1;
                                }
                            }
                            t17.f(tf8Var2);
                            zk8.J(tf8Var2);
                            rf0.z(tf8Var2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            tf8 tf8Var3 = this.b;
                            sf8 sf8Var3 = tf8Var3.D;
                            if (sf8Var3 == null) {
                                z = false;
                            } else {
                                dp2 dp2Var = tf8Var3.z;
                                if (dp2Var != null) {
                                    dp2Var.invoke(sf8Var3);
                                }
                                sf8 sf8Var4 = tf8Var3.D;
                                if (sf8Var4 != null) {
                                    sf8Var4.c = zBooleanValue;
                                }
                                t17.f(tf8Var3);
                                zk8.J(tf8Var3);
                                rf0.z(tf8Var3);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.C = r02;
            r0 = r02;
        }
        ll llVar = this.o;
        ox3[] ox3VarArr = f.a;
        nn7Var.a(d.B, br9.B(llVar));
        sf8 sf8Var = this.D;
        if (sf8Var != null) {
            ll llVar2 = sf8Var.b;
            g gVar = d.C;
            ox3[] ox3VarArr2 = f.a;
            ox3 ox3Var = ox3VarArr2[16];
            nn7Var.a(gVar, llVar2);
            boolean z = sf8Var.c;
            g gVar2 = d.D;
            ox3 ox3Var2 = ox3VarArr2[17];
            nn7Var.a(gVar2, Boolean.valueOf(z));
        }
        final int i2 = 1;
        nn7Var.a(androidx.compose.ui.semantics.a.l, new e3(null, new dp2(this) { // from class: rf8
            public final /* synthetic */ tf8 b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ri8 ri8Var;
                boolean z2;
                switch (i2) {
                    case 0:
                        List list = (List) obj;
                        tf8 tf8Var = this.b;
                        ri8 ri8Var2 = tf8Var.C0().n;
                        if (ri8Var2 != null) {
                            qi8 qi8Var = ri8Var2.a;
                            ll llVar3 = qi8Var.a;
                            gj8 gj8Var = tf8Var.p;
                            iv0 iv0Var = tf8Var.y;
                            ri8Var = new ri8(new qi8(llVar3, gj8.e(gj8Var, iv0Var != null ? iv0Var.a() : zu0.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), qi8Var.c, qi8Var.d, qi8Var.e, qi8Var.f, qi8Var.g, qi8Var.h, qi8Var.i, qi8Var.j), ri8Var2.b, ri8Var2.c);
                            list.add(ri8Var);
                        } else {
                            ri8Var = null;
                        }
                        return Boolean.valueOf(ri8Var != null);
                    case 1:
                        ll llVar22 = (ll) obj;
                        tf8 tf8Var2 = this.b;
                        sf8 sf8Var2 = tf8Var2.D;
                        if (sf8Var2 == null) {
                            sf8 sf8Var22 = new sf8(tf8Var2.o, llVar22);
                            s95 s95Var = new s95(llVar22, tf8Var2.p, tf8Var2.q, tf8Var2.s, tf8Var2.t, tf8Var2.u, tf8Var2.v, EmptyList.a);
                            s95Var.d(tf8Var2.C0().j);
                            sf8Var22.d = s95Var;
                            tf8Var2.D = sf8Var22;
                        } else if (!js3.i(llVar22, sf8Var2.b)) {
                            sf8Var2.b = llVar22;
                            s95 s95Var2 = sf8Var2.d;
                            if (s95Var2 != null) {
                                gj8 gj8Var2 = tf8Var2.p;
                                oh2 oh2Var = tf8Var2.q;
                                int i22 = tf8Var2.s;
                                boolean z22 = tf8Var2.t;
                                int i3 = tf8Var2.u;
                                int i4 = tf8Var2.v;
                                EmptyList emptyList = EmptyList.a;
                                s95Var2.a = llVar22;
                                boolean zC = gj8Var2.c(s95Var2.k);
                                s95Var2.k = gj8Var2;
                                if (!zC) {
                                    s95Var2.q <<= 2;
                                    s95Var2.l = null;
                                    s95Var2.n = null;
                                    s95Var2.p = -1;
                                    s95Var2.o = -1;
                                }
                                s95Var2.b = oh2Var;
                                s95Var2.c = i22;
                                s95Var2.d = z22;
                                s95Var2.e = i3;
                                s95Var2.f = i4;
                                s95Var2.g = emptyList;
                                s95Var2.q = (s95Var2.q << 2) | 2;
                                s95Var2.l = null;
                                s95Var2.n = null;
                                s95Var2.p = -1;
                                s95Var2.o = -1;
                            }
                        }
                        t17.f(tf8Var2);
                        zk8.J(tf8Var2);
                        rf0.z(tf8Var2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        tf8 tf8Var3 = this.b;
                        sf8 sf8Var3 = tf8Var3.D;
                        if (sf8Var3 == null) {
                            z2 = false;
                        } else {
                            dp2 dp2Var = tf8Var3.z;
                            if (dp2Var != null) {
                                dp2Var.invoke(sf8Var3);
                            }
                            sf8 sf8Var4 = tf8Var3.D;
                            if (sf8Var4 != null) {
                                sf8Var4.c = zBooleanValue;
                            }
                            t17.f(tf8Var3);
                            zk8.J(tf8Var3);
                            rf0.z(tf8Var3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        nn7Var.a(androidx.compose.ui.semantics.a.m, new e3(null, new dp2(this) { // from class: rf8
            public final /* synthetic */ tf8 b;

            {
                this.b = this;
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                ri8 ri8Var;
                boolean z2;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        tf8 tf8Var = this.b;
                        ri8 ri8Var2 = tf8Var.C0().n;
                        if (ri8Var2 != null) {
                            qi8 qi8Var = ri8Var2.a;
                            ll llVar3 = qi8Var.a;
                            gj8 gj8Var = tf8Var.p;
                            iv0 iv0Var = tf8Var.y;
                            ri8Var = new ri8(new qi8(llVar3, gj8.e(gj8Var, iv0Var != null ? iv0Var.a() : zu0.h, 0L, null, null, null, 0L, null, 0, 0L, 16777214), qi8Var.c, qi8Var.d, qi8Var.e, qi8Var.f, qi8Var.g, qi8Var.h, qi8Var.i, qi8Var.j), ri8Var2.b, ri8Var2.c);
                            list.add(ri8Var);
                        } else {
                            ri8Var = null;
                        }
                        return Boolean.valueOf(ri8Var != null);
                    case 1:
                        ll llVar22 = (ll) obj;
                        tf8 tf8Var2 = this.b;
                        sf8 sf8Var2 = tf8Var2.D;
                        if (sf8Var2 == null) {
                            sf8 sf8Var22 = new sf8(tf8Var2.o, llVar22);
                            s95 s95Var = new s95(llVar22, tf8Var2.p, tf8Var2.q, tf8Var2.s, tf8Var2.t, tf8Var2.u, tf8Var2.v, EmptyList.a);
                            s95Var.d(tf8Var2.C0().j);
                            sf8Var22.d = s95Var;
                            tf8Var2.D = sf8Var22;
                        } else if (!js3.i(llVar22, sf8Var2.b)) {
                            sf8Var2.b = llVar22;
                            s95 s95Var2 = sf8Var2.d;
                            if (s95Var2 != null) {
                                gj8 gj8Var2 = tf8Var2.p;
                                oh2 oh2Var = tf8Var2.q;
                                int i22 = tf8Var2.s;
                                boolean z22 = tf8Var2.t;
                                int i32 = tf8Var2.u;
                                int i4 = tf8Var2.v;
                                EmptyList emptyList = EmptyList.a;
                                s95Var2.a = llVar22;
                                boolean zC = gj8Var2.c(s95Var2.k);
                                s95Var2.k = gj8Var2;
                                if (!zC) {
                                    s95Var2.q <<= 2;
                                    s95Var2.l = null;
                                    s95Var2.n = null;
                                    s95Var2.p = -1;
                                    s95Var2.o = -1;
                                }
                                s95Var2.b = oh2Var;
                                s95Var2.c = i22;
                                s95Var2.d = z22;
                                s95Var2.e = i32;
                                s95Var2.f = i4;
                                s95Var2.g = emptyList;
                                s95Var2.q = (s95Var2.q << 2) | 2;
                                s95Var2.l = null;
                                s95Var2.n = null;
                                s95Var2.p = -1;
                                s95Var2.o = -1;
                            }
                        }
                        t17.f(tf8Var2);
                        zk8.J(tf8Var2);
                        rf0.z(tf8Var2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        tf8 tf8Var3 = this.b;
                        sf8 sf8Var3 = tf8Var3.D;
                        if (sf8Var3 == null) {
                            z2 = false;
                        } else {
                            dp2 dp2Var = tf8Var3.z;
                            if (dp2Var != null) {
                                dp2Var.invoke(sf8Var3);
                            }
                            sf8 sf8Var4 = tf8Var3.D;
                            if (sf8Var4 != null) {
                                sf8Var4.c = zBooleanValue;
                            }
                            t17.f(tf8Var3);
                            zk8.J(tf8Var3);
                            rf0.z(tf8Var3);
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        nn7Var.a(androidx.compose.ui.semantics.a.n, new e3(null, new yu7(3, this)));
        f.b(nn7Var, r0);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }
}

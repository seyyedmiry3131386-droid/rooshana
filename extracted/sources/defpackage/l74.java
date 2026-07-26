package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l74 {
    public static boolean q = false;
    public final fk6 d;
    public final wv8 m;
    public yv p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public m18[] n = new m18[1000];
    public int o = 0;
    public yv[] g = new yv[32];

    public l74() {
        s();
        wv8 wv8Var = new wv8(11, false);
        wv8Var.b = new ci6();
        wv8Var.c = new ci6();
        wv8Var.d = new m18[32];
        this.m = wv8Var;
        fk6 fk6Var = new fk6(wv8Var);
        fk6Var.f = new m18[128];
        fk6Var.g = new m18[128];
        fk6Var.h = 0;
        fk6Var.i = new hh2(fk6Var);
        this.d = fk6Var;
        this.p = new yv(wv8Var);
    }

    public static int n(Object obj) {
        m18 m18Var = ((v21) obj).i;
        if (m18Var != null) {
            return (int) (m18Var.e + 0.5f);
        }
        return 0;
    }

    public final m18 a(SolverVariable$Type solverVariable$Type) {
        ci6 ci6Var = (ci6) this.m.c;
        int i = ci6Var.b;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ci6Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            ci6Var.b = i2;
            obj = obj2;
        }
        m18 m18Var = (m18) obj;
        if (m18Var == null) {
            m18Var = new m18(solverVariable$Type);
            m18Var.i = solverVariable$Type;
        } else {
            m18Var.c();
            m18Var.i = solverVariable$Type;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (m18[]) Arrays.copyOf(this.n, i5);
        }
        m18[] m18VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        m18VarArr[i6] = m18Var;
        return m18Var;
    }

    public final void b(m18 m18Var, m18 m18Var2, int i, float f, m18 m18Var3, m18 m18Var4, int i2, int i3) {
        yv yvVarL = l();
        if (m18Var2 == m18Var3) {
            yvVarL.d.g(m18Var, 1.0f);
            yvVarL.d.g(m18Var4, 1.0f);
            yvVarL.d.g(m18Var2, -2.0f);
        } else if (f == 0.5f) {
            yvVarL.d.g(m18Var, 1.0f);
            yvVarL.d.g(m18Var2, -1.0f);
            yvVarL.d.g(m18Var3, -1.0f);
            yvVarL.d.g(m18Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                yvVarL.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            yvVarL.d.g(m18Var, -1.0f);
            yvVarL.d.g(m18Var2, 1.0f);
            yvVarL.b = i;
        } else if (f >= 1.0f) {
            yvVarL.d.g(m18Var4, -1.0f);
            yvVarL.d.g(m18Var3, 1.0f);
            yvVarL.b = -i2;
        } else {
            float f2 = 1.0f - f;
            yvVarL.d.g(m18Var, f2 * 1.0f);
            yvVarL.d.g(m18Var2, f2 * (-1.0f));
            yvVarL.d.g(m18Var3, (-1.0f) * f);
            yvVarL.d.g(m18Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                yvVarL.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            yvVarL.a(this, i3);
        }
        c(yvVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.yv r18) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l74.c(yv):void");
    }

    public final void d(m18 m18Var, int i) {
        int i2 = m18Var.c;
        if (i2 == -1) {
            m18Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                m18 m18Var2 = ((m18[]) this.m.d)[i3];
            }
            return;
        }
        if (i2 == -1) {
            yv yvVarL = l();
            yvVarL.a = m18Var;
            float f = i;
            m18Var.e = f;
            yvVarL.b = f;
            yvVarL.e = true;
            c(yvVarL);
            return;
        }
        yv yvVar = this.g[i2];
        if (yvVar.e) {
            yvVar.b = i;
            return;
        }
        if (yvVar.d.d() == 0) {
            yvVar.e = true;
            yvVar.b = i;
            return;
        }
        yv yvVarL2 = l();
        if (i < 0) {
            yvVarL2.b = i * (-1);
            yvVarL2.d.g(m18Var, 1.0f);
        } else {
            yvVarL2.b = i;
            yvVarL2.d.g(m18Var, -1.0f);
        }
        c(yvVarL2);
    }

    public final void e(m18 m18Var, m18 m18Var2, int i, int i2) {
        if (i2 == 8 && m18Var2.f && m18Var.c == -1) {
            m18Var.d(this, m18Var2.e + i);
            return;
        }
        yv yvVarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            yvVarL.b = i;
        }
        if (z) {
            yvVarL.d.g(m18Var, 1.0f);
            yvVarL.d.g(m18Var2, -1.0f);
        } else {
            yvVarL.d.g(m18Var, -1.0f);
            yvVarL.d.g(m18Var2, 1.0f);
        }
        if (i2 != 8) {
            yvVarL.a(this, i2);
        }
        c(yvVarL);
    }

    public final void f(m18 m18Var, m18 m18Var2, int i, int i2) {
        yv yvVarL = l();
        m18 m18VarM = m();
        m18VarM.d = 0;
        yvVarL.b(m18Var, m18Var2, m18VarM, i);
        if (i2 != 8) {
            yvVarL.d.g(j(i2), (int) (yvVarL.d.c(m18VarM) * (-1.0f)));
        }
        c(yvVarL);
    }

    public final void g(m18 m18Var, m18 m18Var2, int i, int i2) {
        yv yvVarL = l();
        m18 m18VarM = m();
        m18VarM.d = 0;
        yvVarL.c(m18Var, m18Var2, m18VarM, i);
        if (i2 != 8) {
            yvVarL.d.g(j(i2), (int) (yvVarL.d.c(m18VarM) * (-1.0f)));
        }
        c(yvVarL);
    }

    public final void h(yv yvVar) {
        int i;
        if (yvVar.e) {
            yvVar.a.d(this, yvVar.b);
        } else {
            yv[] yvVarArr = this.g;
            int i2 = this.k;
            yvVarArr[i2] = yvVar;
            m18 m18Var = yvVar.a;
            m18Var.c = i2;
            this.k = i2 + 1;
            m18Var.e(this, yvVar);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                yv yvVar2 = this.g[i3];
                if (yvVar2 != null && yvVar2.e) {
                    yvVar2.a.d(this, yvVar2.b);
                    ((ci6) this.m.b).a(yvVar2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        yv[] yvVarArr2 = this.g;
                        int i6 = i4 - 1;
                        yv yvVar3 = yvVarArr2[i4];
                        yvVarArr2[i6] = yvVar3;
                        m18 m18Var2 = yvVar3.a;
                        if (m18Var2.c == i4) {
                            m18Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            yv yvVar = this.g[i];
            yvVar.a.e = yvVar.b;
        }
    }

    public final m18 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        m18 m18VarA = a(SolverVariable$Type.c);
        float[] fArr = m18VarA.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        m18VarA.b = i2;
        m18VarA.d = i;
        ((m18[]) this.m.d)[i2] = m18VarA;
        fk6 fk6Var = this.d;
        fk6Var.i.b = m18VarA;
        Arrays.fill(fArr, 0.0f);
        fArr[m18VarA.d] = 1.0f;
        fk6Var.j(m18VarA);
        return m18VarA;
    }

    public final m18 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof v21)) {
            return null;
        }
        v21 v21Var = (v21) obj;
        m18 m18Var = v21Var.i;
        if (m18Var == null) {
            v21Var.k();
            m18Var = v21Var.i;
        }
        int i = m18Var.b;
        wv8 wv8Var = this.m;
        if (i != -1 && i <= this.c && ((m18[]) wv8Var.d)[i] != null) {
            return m18Var;
        }
        if (i != -1) {
            m18Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        m18Var.b = i2;
        m18Var.i = SolverVariable$Type.a;
        ((m18[]) wv8Var.d)[i2] = m18Var;
        return m18Var;
    }

    public final yv l() {
        Object obj;
        wv8 wv8Var = this.m;
        ci6 ci6Var = (ci6) wv8Var.b;
        int i = ci6Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = ci6Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            ci6Var.b = i2;
        } else {
            obj = null;
        }
        yv yvVar = (yv) obj;
        if (yvVar == null) {
            return new yv(wv8Var);
        }
        yvVar.a = null;
        yvVar.d.b();
        yvVar.b = 0.0f;
        yvVar.e = false;
        return yvVar;
    }

    public final m18 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        m18 m18VarA = a(SolverVariable$Type.b);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        m18VarA.b = i;
        ((m18[]) this.m.d)[i] = m18VarA;
        return m18VarA;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (yv[]) Arrays.copyOf(this.g, i);
        wv8 wv8Var = this.m;
        wv8Var.d = (m18[]) Arrays.copyOf((m18[]) wv8Var.d, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        fk6 fk6Var = this.d;
        if (fk6Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(fk6Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(fk6Var);
                return;
            }
        }
        i();
    }

    public final void q(fk6 fk6Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            yv yvVar = this.g[i];
            SolverVariable$Type solverVariable$Type = yvVar.a.i;
            SolverVariable$Type solverVariable$Type2 = SolverVariable$Type.a;
            if (solverVariable$Type != solverVariable$Type2) {
                float f = 0.0f;
                if (yvVar.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.k) {
                            yv yvVar2 = this.g[i3];
                            if (yvVar2.a.i != solverVariable$Type2 && !yvVar2.e && yvVar2.b < f) {
                                int iD = yvVar2.d.d();
                                int i7 = 0;
                                while (i7 < iD) {
                                    m18 m18VarE = yvVar2.d.e(i7);
                                    float f3 = f;
                                    float fC = yvVar2.d.c(m18VarE);
                                    if (fC > f3) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f4 = m18VarE.g[i8] / fC;
                                            if ((f4 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = m18VarE.b;
                                                i4 = i3;
                                                f2 = f4;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = f3;
                                }
                            }
                            i3++;
                            f = f;
                        }
                        float f5 = f;
                        if (i4 != -1) {
                            yv yvVar3 = this.g[i4];
                            yvVar3.a.c = -1;
                            yvVar3.g(((m18[]) this.m.d)[i5]);
                            m18 m18Var = yvVar3.a;
                            m18Var.c = i4;
                            m18Var.e(this, yvVar3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = f5;
                    }
                }
            }
            i++;
        }
        r(fk6Var);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(defpackage.yv r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb1
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.j
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb1
        L1f:
            m18 r6 = r1.a
            if (r6 == 0) goto L29
            boolean[] r7 = r0.i
            int r6 = r6.b
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.i
            m18 r6 = r1.d(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.i
            int r8 = r6.b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb1
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lad
            r5 = -1
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = r2
            r9 = r5
        L45:
            int r10 = r0.k
            if (r8 >= r10) goto L98
            yv[] r10 = r0.g
            r10 = r10[r8]
            m18 r11 = r10.a
            androidx.constraintlayout.core.SolverVariable$Type r11 = r11.i
            androidx.constraintlayout.core.SolverVariable$Type r12 = androidx.constraintlayout.core.SolverVariable$Type.a
            if (r11 != r12) goto L56
            goto L94
        L56:
            boolean r11 = r10.e
            if (r11 == 0) goto L5b
            goto L94
        L5b:
            pv r11 = r10.d
            int r12 = r11.h
            r14 = -1
            if (r12 != r14) goto L63
            goto L7c
        L63:
            r15 = 0
        L64:
            if (r12 == r14) goto L7c
            int r2 = r11.a
            if (r15 >= r2) goto L7c
            int[] r2 = r11.e
            r2 = r2[r12]
            int r13 = r6.b
            if (r2 != r13) goto L74
            r13 = 1
            goto L7d
        L74:
            int[] r2 = r11.f
            r12 = r2[r12]
            int r15 = r15 + 1
            r2 = 0
            goto L64
        L7c:
            r13 = 0
        L7d:
            if (r13 == 0) goto L94
            pv r2 = r10.d
            float r2 = r2.c(r6)
            r11 = 0
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L94
            float r10 = r10.b
            float r10 = -r10
            float r10 = r10 / r2
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 >= 0) goto L94
            r9 = r8
            r7 = r10
        L94:
            int r8 = r8 + 1
            r2 = 0
            goto L45
        L98:
            if (r9 <= r5) goto Lae
            yv[] r2 = r0.g
            r2 = r2[r9]
            m18 r7 = r2.a
            r7.c = r5
            r2.g(r6)
            m18 r5 = r2.a
            r5.c = r9
            r5.e(r0, r2)
            goto Lae
        Lad:
            r3 = r5
        Lae:
            r2 = 0
            goto L13
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l74.r(yv):void");
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            yv yvVar = this.g[i];
            if (yvVar != null) {
                ((ci6) this.m.b).a(yvVar);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        wv8 wv8Var;
        int i = 0;
        while (true) {
            wv8Var = this.m;
            m18[] m18VarArr = (m18[]) wv8Var.d;
            if (i >= m18VarArr.length) {
                break;
            }
            m18 m18Var = m18VarArr[i];
            if (m18Var != null) {
                m18Var.c();
            }
            i++;
        }
        ci6 ci6Var = (ci6) wv8Var.c;
        m18[] m18VarArr2 = this.n;
        int length = this.o;
        ci6Var.getClass();
        if (length > m18VarArr2.length) {
            length = m18VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            m18 m18Var2 = m18VarArr2[i2];
            int i3 = ci6Var.b;
            Object[] objArr = ci6Var.a;
            if (i3 < objArr.length) {
                objArr[i3] = m18Var2;
                ci6Var.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((m18[]) wv8Var.d, (Object) null);
        this.c = 0;
        fk6 fk6Var = this.d;
        fk6Var.h = 0;
        fk6Var.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            yv yvVar = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new yv(wv8Var);
    }
}

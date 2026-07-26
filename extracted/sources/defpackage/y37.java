package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class y37 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(v80 v80Var) {
        int i = v80Var.h;
        if (i == 2) {
            vy2.s(i == 2);
            v80Var.h = 1;
            v80Var.t();
        }
    }

    public static boolean h(v80 v80Var) {
        return v80Var.h != 0;
    }

    public static void l(v80 v80Var, long j) {
        v80Var.n = true;
        if (v80Var instanceof aj8) {
            aj8 aj8Var = (aj8) v80Var;
            vy2.s(aj8Var.n);
            aj8Var.K = j;
        }
    }

    public void a(v80 v80Var, ag1 ag1Var) {
        vy2.s(((v80) this.e) == v80Var || ((v80) this.f) == v80Var);
        if (h(v80Var)) {
            if (v80Var == ((v80) ag1Var.e)) {
                ag1Var.f = null;
                ag1Var.e = null;
                ag1Var.a = true;
            }
            b(v80Var);
            vy2.s(v80Var.h == 1);
            v80Var.c.g();
            v80Var.h = 0;
            v80Var.i = null;
            v80Var.j = null;
            v80Var.n = false;
            v80Var.n();
            v80Var.q = null;
        }
    }

    public int c() {
        boolean zH = h((v80) this.e);
        v80 v80Var = (v80) this.f;
        return (zH ? 1 : 0) + ((v80Var == null || !h(v80Var)) ? 0 : 1);
    }

    public v80 d(aq4 aq4Var) {
        pc7 pc7Var;
        if (aq4Var != null && (pc7Var = aq4Var.c[this.c]) != null) {
            v80 v80Var = (v80) this.e;
            if (v80Var.i == pc7Var) {
                return v80Var;
            }
            v80 v80Var2 = (v80) this.f;
            if (v80Var2 != null && v80Var2.i == pc7Var) {
                return v80Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(defpackage.aq4 r8, defpackage.v80 r9) {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 1
            if (r9 != 0) goto L6
            goto L49
        L6:
            pc7[] r2 = r8.c
            r2 = r2[r0]
            pc7 r3 = r9.i
            if (r3 == 0) goto L49
            if (r3 != r2) goto L3a
            if (r2 == 0) goto L49
            boolean r2 = r9.k()
            if (r2 != 0) goto L49
            aq4 r2 = r8.m
            bq4 r3 = r8.g
            boolean r3 = r3.g
            if (r3 == 0) goto L3a
            if (r2 == 0) goto L3a
            boolean r3 = r2.e
            if (r3 == 0) goto L3a
            boolean r3 = r9 instanceof defpackage.aj8
            if (r3 != 0) goto L39
            boolean r3 = r9 instanceof defpackage.pv4
            if (r3 != 0) goto L39
            long r3 = r9.m
            long r5 = r2.e()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L3a
            goto L49
        L39:
            return r1
        L3a:
            aq4 r8 = r8.m
            if (r8 == 0) goto L47
            pc7[] r8 = r8.c
            r8 = r8[r0]
            pc7 r9 = r9.i
            if (r8 != r9) goto L47
            goto L49
        L47:
            r8 = 0
            return r8
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y37.e(aq4, v80):boolean");
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((v80) this.e);
        }
        v80 v80Var = (v80) this.f;
        v80Var.getClass();
        return v80Var.h != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.a) {
                v80 v80Var = (v80) this.e;
                vy2.s(v80Var.h == 0);
                v80Var.c.g();
                v80Var.r();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            v80 v80Var2 = (v80) this.f;
            v80Var2.getClass();
            vy2.s(v80Var2.h == 0);
            v80Var2.c.g();
            v80Var2.r();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(v80 v80Var, aq4 aq4Var, jp8 jp8Var, ag1 ag1Var) {
        int i;
        v80 v80Var2 = (v80) this.e;
        int i2 = this.c;
        if (v80Var == null || v80Var.h == 0 || (v80Var == v80Var2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (v80Var == ((v80) this.f) && this.d == 3) {
            return 1;
        }
        Object[] objArr = v80Var.i != aq4Var.c[i2];
        boolean zS = jp8Var.s(i2);
        if (!zS || objArr != false) {
            if (!v80Var.n) {
                p62 p62Var = ((p62[]) jp8Var.d)[i2];
                int length = p62Var != null ? p62Var.length() : 0;
                b[] bVarArr = new b[length];
                for (int i3 = 0; i3 < length; i3++) {
                    p62Var.getClass();
                    bVarArr[i3] = p62Var.g(i3);
                }
                pc7 pc7Var = aq4Var.c[i2];
                pc7Var.getClass();
                v80Var.x(bVarArr, pc7Var, aq4Var.e(), aq4Var.p, aq4Var.g.a);
                return 3;
            }
            if (!v80Var.l()) {
                return 0;
            }
            a(v80Var, ag1Var);
            if (!zS || f()) {
                i(v80Var == v80Var2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((v80) this.e)) {
            i(true);
        }
        v80 v80Var = (v80) this.f;
        if (v80Var == null || v80Var.h != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        v80 v80Var = (v80) this.e;
        int i2 = v80Var.h;
        if (i2 == 1 && this.d != 4) {
            vy2.s(i2 == 1);
            v80Var.h = 2;
            v80Var.s();
            return;
        }
        v80 v80Var2 = (v80) this.f;
        if (v80Var2 == null || (i = v80Var2.h) != 1 || this.d == 3) {
            return;
        }
        vy2.s(i == 1);
        v80Var2.h = 2;
        v80Var2.s();
    }
}

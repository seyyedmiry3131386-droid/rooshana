package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ej4 extends tg9 {
    public final boolean l;
    public final am8 m;
    public final yl8 n;
    public cj4 o;
    public bj4 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public ej4(x70 x70Var, boolean z) {
        super(x70Var);
        this.l = z && x70Var.i();
        this.m = new am8();
        this.n = new yl8();
        bm8 bm8VarG = x70Var.g();
        if (bm8VarG == null) {
            this.o = new cj4(new dj4(x70Var.h()), am8.q, cj4.h);
        } else {
            this.o = new cj4(bm8VarG, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.tg9
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        A();
    }

    @Override // defpackage.x70
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final bj4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        bj4 bj4Var = new bj4(ks4Var, qc1Var, j);
        vy2.s(bj4Var.d == null);
        bj4Var.d = this.k;
        if (!this.r) {
            this.p = bj4Var;
            if (!this.q) {
                this.q = true;
                A();
            }
            return bj4Var;
        }
        Object obj = ks4Var.a;
        if (this.o.g != null && obj.equals(cj4.h)) {
            obj = this.o.g;
        }
        bj4Var.b(ks4Var.a(obj));
        return bj4Var;
    }

    public final boolean D(long j) {
        bj4 bj4Var = this.p;
        int iB = this.o.b(bj4Var.a.a);
        if (iB == -1) {
            return false;
        }
        cj4 cj4Var = this.o;
        yl8 yl8Var = this.n;
        cj4Var.f(iB, yl8Var, false);
        long j2 = yl8Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        bj4Var.g = j;
        return true;
    }

    @Override // defpackage.x70
    public final boolean a(jp4 jp4Var) {
        return this.k.a(jp4Var);
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        bj4 bj4Var = (bj4) zp4Var;
        if (bj4Var.e != null) {
            x70 x70Var = bj4Var.d;
            x70Var.getClass();
            x70Var.n(bj4Var.e);
        }
        if (zp4Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.yz0, defpackage.x70
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // defpackage.tg9, defpackage.x70
    public final void s(jp4 jp4Var) {
        if (this.s) {
            cj4 cj4Var = this.o;
            this.o = new cj4(new rg6(this.o.e, jp4Var), cj4Var.f, cj4Var.g);
        } else {
            this.o = new cj4(new dj4(jp4Var), am8.q, cj4.h);
        }
        this.k.s(jp4Var);
    }

    @Override // defpackage.tg9
    public final ks4 y(ks4 ks4Var) {
        Object obj = ks4Var.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = cj4.h;
        }
        return ks4Var.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tg9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.bm8 r12) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ej4.z(bm8):void");
    }
}

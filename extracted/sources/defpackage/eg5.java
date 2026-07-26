package defpackage;

import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public final class eg5 extends ep7 {
    public d l;
    public int m;
    public boolean n;

    @Override // defpackage.ep7
    public final void c() {
        this.d.i(lu7.w, null);
        this.d.i(lu7.x, null);
        this.d.i(lu7.v, null);
        this.d.g(-1, lu7.t);
        this.d.j(lu7.u, false);
        super.c();
    }

    @Override // defpackage.ep7
    public final boolean g() {
        return b() == 0 || (b() + 21600000) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        this.l.h(new bg5(this), new bg5(this));
    }

    public final int j() {
        if (this.m < 0) {
            l();
        }
        int i = this.m;
        if (i <= 1028) {
            return -1;
        }
        if (i < 0) {
            l();
        }
        return this.m;
    }

    public final boolean k() {
        if (this.m < 0) {
            l();
        }
        return this.n;
    }

    public final void l() {
        this.m = this.d.c(1028, lu7.t);
        boolean zB = this.d.b(lu7.u, false);
        this.n = zB;
        int i = this.m;
        if (i < 1028) {
            lw.b(dw1.k(this.m, ", current version: 1028", new StringBuilder("client latest version saved in shared preferences is older than current version, saved version: ")), null, this.m > 0);
            this.m = 1028;
            this.n = false;
        } else if (i == 1028) {
            lw.b(null, null, zB);
            this.n = false;
        }
    }

    public final void m(int i, String str, String str2, String str3, boolean z) {
        this.m = i;
        this.n = z;
        this.d.g(i, lu7.t);
        this.d.i(lu7.x, str3);
        this.d.j(lu7.u, this.n);
        this.d.i(lu7.w, str2);
        this.d.i(lu7.v, str);
    }
}

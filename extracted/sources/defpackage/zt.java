package defpackage;

import ir.mservices.market.app.update.common.modal.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zt extends ep7 {
    public a l;
    public Long m;

    @Override // defpackage.ep7
    public final void c() {
        super.c();
        j(0L);
        this.e.a(System.currentTimeMillis());
    }

    @Override // defpackage.ep7
    public final boolean g() {
        long jB = b();
        if (this.m == null) {
            this.m = Long.valueOf(this.d.d(lu7.M));
        }
        if (this.m.longValue() > jB) {
            if (this.m == null) {
                this.m = Long.valueOf(this.d.d(lu7.M));
            }
            jB = this.m.longValue();
        }
        return jB == 0 || ((((long) this.d.c(15, lu7.m0)) * 60000) + jB) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        this.l.a(this, "open_myket", "update_list", ff5.b(), new yt(this), new yt(this));
    }

    public final void j(long j) {
        lw.f(null, null, j >= 0);
        this.f.getClass();
        lw.b(null, null, vl8.c(j));
        this.d.h(j, lu7.M);
        this.m = Long.valueOf(j);
    }
}

package defpackage;

import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public final class pp8 extends ep7 {
    public d l;
    public wl5 m;

    @Override // defpackage.ep7
    public final boolean g() {
        return b() == 0 || (b() + 604800000) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        this.l.k(new t15(15, this), new c35(16, this));
    }
}

package defpackage;

import ir.mservices.market.version2.manager.serverUrl.a;
import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public final class kp7 extends ep7 {
    public d l;
    public a m;

    @Override // defpackage.ep7
    public final boolean g() {
        return b() == 0 || (b() + 900000) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        this.l.i(new ck4(16, this), new hl5(9, this));
    }
}

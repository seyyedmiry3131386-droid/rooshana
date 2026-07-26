package ir.mservices.market.togo;

import defpackage.f88;
import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.togo.TogoAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ TogoFragment a;

    public a(TogoFragment togoFragment) {
        this.a = togoFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = TogoFragment.o1;
        TogoFragment togoFragment = this.a;
        if (f88.n0(togoFragment.l1().a)) {
            togoFragment.J0.q();
        } else {
            togoFragment.p1();
        }
        togoFragment.n1().r(TogoAction.CookieCallbackAction.INSTANCE);
        return tx8.a;
    }
}

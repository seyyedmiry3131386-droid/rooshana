package defpackage;

import android.os.Bundle;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.content.MynetManagerFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class wg5 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        if (er3Var.b.d()) {
            return new dr3(new NavIntentDirections.MynetSocial());
        }
        int i = MynetManagerFragment.K0;
        Bundle bundle = new Bundle();
        MynetManagerFragment mynetManagerFragment = new MynetManagerFragment();
        mynetManagerFragment.u0(bundle);
        return new dr3(mynetManagerFragment);
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_mynet), true);
    }
}

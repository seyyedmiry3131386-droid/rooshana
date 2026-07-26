package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class kk6 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        if (er3Var.b.d()) {
            return new dr3(new NavIntentDirections.MyAccount(new uc5(null)));
        }
        String dataString = q0Var.b.getDataString();
        if (dataString != null) {
            return new dr3(UserManagerIntentFragment.I0("TYPE_NOT_LOGIN", dataString, false));
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_private_profile), true);
    }
}

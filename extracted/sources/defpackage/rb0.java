package defpackage;

import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class rb0 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        if (!er3Var.b.d()) {
            String dataString = intent.getDataString();
            if (dataString != null) {
                return new dr3(UserManagerIntentFragment.I0("TYPE_NOT_LOGIN", dataString, true));
            }
        } else {
            if (er3Var.b.f()) {
                return new dr3(new NavIntentDirections.Profile());
            }
            String dataString2 = intent.getDataString();
            if (dataString2 != null) {
                return new dr3(UserManagerIntentFragment.I0("TYPE_NICKNAME_NOT_SET", dataString2, true));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_bind), true);
    }
}

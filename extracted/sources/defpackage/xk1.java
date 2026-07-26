package defpackage;

import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class xk1 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String str;
        js3.p(er3Var, "intentFragmentFactory");
        List listE = q0Var.e();
        if (listE != null && (str = (String) a.q0(1, listE)) != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                return new dr3(new NavIntentDirections.Developer(new ml1(str, "", "", new Tracker("developer", str, "intent"))));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        List listE;
        if (super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_developer), true) && (listE = q0Var.e()) != null && !listE.isEmpty()) {
            List listE2 = q0Var.e();
            if (m88.T(listE2 != null ? (String) a.q0(0, listE2) : null, q0Var.b(rs6.external_intent_filters_host_developer_developer_by_id), true)) {
                return true;
            }
        }
        return false;
    }
}

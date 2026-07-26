package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gq0 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        List listE = q0Var.e();
        return new dr3(new NavIntentDirections.Cheetah(new eq0(null, null, js3.i(listE != null ? (String) a.q0(0, listE) : null, q0Var.b(rs6.external_intent_filters_path_segments_stop)))));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_cheetah), true);
    }
}

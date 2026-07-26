package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dl7 extends t1 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        return new dr3(new NavIntentDirections.SecurityShield());
    }

    @Override // defpackage.t1, defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        List listD;
        return super.b(q0Var) && (listD = q0Var.d()) != null && listD.contains(q0Var.b(rs6.external_intent_path_segments_security_shield));
    }
}

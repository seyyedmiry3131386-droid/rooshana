package defpackage;

import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class w87 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        List listD = q0Var.d();
        String str = listD != null ? (String) a.q0(0, listD) : null;
        List listE = q0Var.e();
        String str2 = listE != null ? (String) a.q0(2, listE) : null;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        return new dr3(new NavIntentDirections.AllSubReviews(new ht(str, null, null, null, null, str2)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        if (super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_apps), true)) {
            List listD = q0Var.d();
            if (listD == null || listD.size() < 3) {
                listD = null;
            }
            if (listD != null) {
                List listD2 = q0Var.d();
                if (m88.T(listD2 != null ? (String) a.q0(1, listD2) : null, q0Var.b(rs6.external_intent_path_segments_reviews), false)) {
                    return true;
                }
            }
        }
        return false;
    }
}

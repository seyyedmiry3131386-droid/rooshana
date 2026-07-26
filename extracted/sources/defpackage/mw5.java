package defpackage;

import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class mw5 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String str;
        js3.p(er3Var, "intentFragmentFactory");
        List listE = q0Var.e();
        if (listE != null && (str = (String) a.q0(0, listE)) != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                Uri data = q0Var.b.getData();
                return new dr3(new NavIntentDirections.OtherFeature(new ow5(data != null ? data.getQueryParameter("title") : null, str)));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_featured), true);
    }
}

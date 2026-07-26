package defpackage;

import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class si7 extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        if (q0Var.g(32)) {
            q0Var.h(32);
            q0Var.g = q0Var.b.getStringExtra("query");
        }
        String str = q0Var.g;
        Uri data = q0Var.b.getData();
        String queryParameter = data != null ? data.getQueryParameter("querySource") : null;
        lw.b("Intent.ACTION_SEARCH: Query is Null!", null, str == null || f88.n0(str));
        if (str == null) {
            return null;
        }
        if (queryParameter == null) {
            queryParameter = "Intent";
        }
        return new dr3(new NavIntentDirections.Search(new yh7(str, queryParameter)));
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        return "android.intent.action.SEARCH".equalsIgnoreCase(q0Var.b.getAction());
    }
}

package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class ti7 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Intent intent = q0Var.b;
        Uri data = intent.getData();
        String queryParameter = data != null ? data.getQueryParameter("query") : null;
        Uri data2 = intent.getData();
        String queryParameter2 = data2 != null ? data2.getQueryParameter("querySource") : null;
        if (queryParameter == null || queryParameter.length() == 0) {
            Uri data3 = intent.getData();
            queryParameter = data3 != null ? data3.getQueryParameter("q") : null;
        }
        if (queryParameter == null) {
            return null;
        }
        if (queryParameter2 == null) {
            queryParameter2 = "Intent";
        }
        return new dr3(new NavIntentDirections.Search(new yh7(queryParameter, queryParameter2)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_search), true);
    }
}

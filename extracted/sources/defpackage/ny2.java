package defpackage;

import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class ny2 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Uri data = q0Var.b.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("url");
        String queryParameter2 = data.getQueryParameter("title");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        String str = queryParameter2;
        if (queryParameter == null) {
            return null;
        }
        String str2 = !f88.n0(queryParameter) ? queryParameter : null;
        if (str2 != null) {
            return new dr3(new NavIntentDirections.WebView(new zc9(str2, str, false, false, false, true, false)));
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_help), true);
    }
}

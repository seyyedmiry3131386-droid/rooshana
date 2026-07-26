package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class t92 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String queryParameter = data.getQueryParameter("select");
        boolean z = Boolean.parseBoolean(data.getQueryParameter("focus"));
        return new dr3(new NavIntentDirections.Feedback(new r92(data.getQueryParameter("packageName"), data.getQueryParameter("title"), data.getQueryParameter("scenario"), queryParameter, z, null)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_feedback), true);
    }
}

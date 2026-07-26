package defpackage;

import android.content.Context;
import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class jd5 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        List listD = q0Var.d();
        if (!m88.T(listD != null ? (String) a.q0(0, listD) : null, q0Var.b(rs6.external_intent_filters_host_invite_share), true)) {
            return new dr3(new NavIntentDirections.MyMarket());
        }
        bu7 bu7Var = er3Var.c;
        Context context = q0Var.a;
        bu7Var.getClass();
        js3.p(context, "context");
        new zt7(bu7Var, context).b(new Void[0]);
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_my_market), true);
    }
}

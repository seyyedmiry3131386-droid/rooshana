package defpackage;

import android.content.Intent;
import android.net.Uri;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class w84 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Intent intent = q0Var.b;
        List listE = q0Var.e();
        String str = listE != null ? (String) a.q0(0, listE) : null;
        Uri data = intent.getData();
        String queryParameter = data != null ? data.getQueryParameter("title") : null;
        String strP = js8.p(intent.getData(), "refId");
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                return new dr3(new NavIntentDirections.Package(new oy5(queryParameter, str, "external-intent-list-".concat(str), strP)));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_list), true);
    }
}

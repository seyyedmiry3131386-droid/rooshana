package defpackage;

import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gs1 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String str;
        js3.p(er3Var, "intentFragmentFactory");
        String lowerCase = null;
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        List listE = q0Var.e();
        if (listE != null && (str = (String) a.q0(0, listE)) != null && !f88.n0(str)) {
            lowerCase = str;
        }
        if (lowerCase == null) {
            lowerCase = "APPS".toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
        }
        return new dr3(new NavIntentDirections.DownloadList(new rr1(lowerCase)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_downloads), true);
    }
}

package defpackage;

import android.content.Intent;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class st1 extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        String lowerCase;
        js3.p(er3Var, "intentFragmentFactory");
        int iA = q0Var.a();
        if (iA == 104 || iA == 105) {
            a aVar = er3Var.a;
            aVar.d.clear();
            aVar.c.clear();
            aVar.i();
        }
        if (iA == 111 || iA == 112) {
            a aVar2 = er3Var.a;
            aVar2.g.clear();
            aVar2.f.clear();
            aVar2.i();
        }
        if ("ir.mservices.market.ACTION_DOWNLOADED_LIST".equalsIgnoreCase(q0Var.b.getAction())) {
            lowerCase = "APPS".toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = "MOVIES".toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
        }
        return new dr3(new NavIntentDirections.DownloadList(new rr1(lowerCase)));
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        Intent intent = q0Var.b;
        return "ir.mservices.market.ACTION_DOWNLOADED_LIST".equalsIgnoreCase(intent.getAction()) || "ir.mservices.market.ACTION_DOWNLOADED_MOVIE_LIST".equalsIgnoreCase(intent.getAction());
    }
}

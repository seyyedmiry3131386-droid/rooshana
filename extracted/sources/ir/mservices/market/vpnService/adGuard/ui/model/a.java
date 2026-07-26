package ir.mservices.market.vpnService.adGuard.ui.model;

import android.content.Context;
import defpackage.js3;
import defpackage.kb9;
import defpackage.lb9;
import defpackage.ma;
import defpackage.na;
import defpackage.tb9;
import defpackage.ub9;
import defpackage.vb7;
import ir.myket.vpn.state.Command;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final na b;
    public final kb9 c;
    public final ma d;

    public a(Context context, na naVar, kb9 kb9Var, ma maVar) {
        js3.p(naVar, "adGuardService");
        js3.p(kb9Var, "vpnController");
        js3.p(maVar, "adGuardOnGoingNotification");
        this.a = context;
        this.b = naVar;
        this.c = kb9Var;
        this.d = maVar;
    }

    public final vb7 a(Object obj) {
        return new vb7(new AdGuardRepositoryImpl$getAdGuardInfo$2(this, obj, null));
    }

    public final void b(String str) {
        kb9 kb9Var = this.c;
        if (str == null) {
            ((lb9) kb9Var).getClass();
            str = ((tb9) ub9.b.a.getValue()).a();
        }
        ((lb9) kb9Var).getClass();
        js3.p(str, "type");
        lb9.a(this.a, new Command.Stop(str));
    }
}

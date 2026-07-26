package ir.mservices.market.app.update.common.data;

import defpackage.js3;
import defpackage.kf1;
import defpackage.s6;
import defpackage.ug1;
import defpackage.up1;
import defpackage.vb7;
import defpackage.wt;
import defpackage.xe2;
import defpackage.xg5;
import defpackage.yq2;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends yq2 {
    public final xg5 g;
    public final wt h;

    public a(xg5 xg5Var, wt wtVar) {
        js3.p(wtVar, "appUpdateRepository");
        this.g = xg5Var;
        this.h = wtVar;
    }

    public final xe2 z0(s6 s6Var) {
        vb7 vb7Var = new vb7(new ActiveUseCase$executeUseCase$1(this, s6Var, null));
        ug1 ug1Var = up1.a;
        return d.t(vb7Var, kf1.c);
    }
}

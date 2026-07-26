package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.br9;
import defpackage.cd0;
import defpackage.eq;
import defpackage.fz1;
import defpackage.gx8;
import defpackage.hy2;
import defpackage.r64;
import defpackage.so6;
import defpackage.sx0;
import defpackage.th0;
import defpackage.tx0;
import defpackage.u40;
import defpackage.vj1;
import defpackage.y61;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tx0> getComponents() {
        sx0 sx0VarA = tx0.a(new so6(u40.class, y61.class));
        sx0VarA.a(new vj1(new so6(u40.class, Executor.class), 1, 0));
        sx0VarA.g = eq.y;
        tx0 tx0VarB = sx0VarA.b();
        sx0 sx0VarA2 = tx0.a(new so6(r64.class, y61.class));
        sx0VarA2.a(new vj1(new so6(r64.class, Executor.class), 1, 0));
        sx0VarA2.g = th0.k;
        tx0 tx0VarB2 = sx0VarA2.b();
        sx0 sx0VarA3 = tx0.a(new so6(cd0.class, y61.class));
        sx0VarA3.a(new vj1(new so6(cd0.class, Executor.class), 1, 0));
        sx0VarA3.g = fz1.j;
        tx0 tx0VarB3 = sx0VarA3.b();
        sx0 sx0VarA4 = tx0.a(new so6(gx8.class, y61.class));
        sx0VarA4.a(new vj1(new so6(gx8.class, Executor.class), 1, 0));
        sx0VarA4.g = hy2.k;
        return br9.C(tx0VarB, tx0VarB2, tx0VarB3, sx0VarA4.b());
    }
}

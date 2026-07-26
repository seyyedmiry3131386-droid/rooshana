package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.b;
import defpackage.ad2;
import defpackage.cd0;
import defpackage.hy0;
import defpackage.hy2;
import defpackage.iy2;
import defpackage.so6;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.u40;
import defpackage.v4;
import defpackage.vj1;
import defpackage.vv1;
import defpackage.xc2;
import defpackage.yq2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static ad2 lambda$getComponents$0(hy0 hy0Var) {
        return new a((xc2) hy0Var.get(xc2.class), hy0Var.c(iy2.class), (ExecutorService) hy0Var.g(new so6(u40.class, ExecutorService.class)), new b((Executor) hy0Var.g(new so6(cd0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tx0> getComponents() {
        sx0 sx0VarB = tx0.b(ad2.class);
        sx0VarB.a = LIBRARY_NAME;
        sx0VarB.a(vj1.a(xc2.class));
        sx0VarB.a(new vj1(0, 1, iy2.class));
        sx0VarB.a(new vj1(new so6(u40.class, ExecutorService.class), 1, 0));
        sx0VarB.a(new vj1(new so6(cd0.class, Executor.class), 1, 0));
        sx0VarB.g = new vv1(19);
        tx0 tx0VarB = sx0VarB.b();
        hy2 hy2Var = new hy2(0);
        sx0 sx0VarB2 = tx0.b(hy2.class);
        sx0VarB2.c = 1;
        sx0VarB2.g = new v4(13, hy2Var);
        return Arrays.asList(tx0VarB, sx0VarB2.b(), yq2.T(LIBRARY_NAME, "19.0.1"));
    }
}

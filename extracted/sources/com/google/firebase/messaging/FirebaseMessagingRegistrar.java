package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import defpackage.ad2;
import defpackage.as8;
import defpackage.cs8;
import defpackage.da8;
import defpackage.ei1;
import defpackage.hy0;
import defpackage.jy2;
import defpackage.so6;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.ue1;
import defpackage.vj1;
import defpackage.xc2;
import defpackage.yq2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(so6 so6Var, hy0 hy0Var) {
        return new FirebaseMessaging((xc2) hy0Var.get(xc2.class), (FirebaseInstanceIdInternal) hy0Var.get(FirebaseInstanceIdInternal.class), hy0Var.c(ei1.class), hy0Var.c(jy2.class), (ad2) hy0Var.get(ad2.class), hy0Var.f(so6Var), (da8) hy0Var.get(da8.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<tx0> getComponents() {
        so6 so6Var = new so6(as8.class, cs8.class);
        sx0 sx0VarB = tx0.b(FirebaseMessaging.class);
        sx0VarB.a = LIBRARY_NAME;
        sx0VarB.a(vj1.a(xc2.class));
        sx0VarB.a(new vj1(0, 0, FirebaseInstanceIdInternal.class));
        sx0VarB.a(new vj1(0, 1, ei1.class));
        sx0VarB.a(new vj1(0, 1, jy2.class));
        sx0VarB.a(vj1.a(ad2.class));
        sx0VarB.a(new vj1(so6Var, 0, 1));
        sx0VarB.a(vj1.a(da8.class));
        sx0VarB.g = new ue1(so6Var, 1);
        if (!(sx0VarB.b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        sx0VarB.b = 1;
        return Arrays.asList(sx0VarB.b(), yq2.T(LIBRARY_NAME, "25.0.1"));
    }
}

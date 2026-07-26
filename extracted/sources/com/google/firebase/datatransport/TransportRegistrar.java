package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.as8;
import defpackage.cs8;
import defpackage.es8;
import defpackage.hy0;
import defpackage.p58;
import defpackage.so6;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.vj1;
import defpackage.yj0;
import defpackage.yq2;
import defpackage.z44;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cs8 lambda$getComponents$0(hy0 hy0Var) {
        es8.b((Context) hy0Var.get(Context.class));
        return es8.a().c(yj0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cs8 lambda$getComponents$1(hy0 hy0Var) {
        es8.b((Context) hy0Var.get(Context.class));
        return es8.a().c(yj0.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ cs8 lambda$getComponents$2(hy0 hy0Var) {
        es8.b((Context) hy0Var.get(Context.class));
        return es8.a().c(yj0.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<tx0> getComponents() {
        sx0 sx0VarB = tx0.b(cs8.class);
        sx0VarB.a = LIBRARY_NAME;
        sx0VarB.a(vj1.a(Context.class));
        sx0VarB.g = new p58(19);
        tx0 tx0VarB = sx0VarB.b();
        sx0 sx0VarA = tx0.a(new so6(z44.class, cs8.class));
        sx0VarA.a(vj1.a(Context.class));
        sx0VarA.g = new p58(20);
        tx0 tx0VarB2 = sx0VarA.b();
        sx0 sx0VarA2 = tx0.a(new so6(as8.class, cs8.class));
        sx0VarA2.a(vj1.a(Context.class));
        sx0VarA2.g = new p58(21);
        return Arrays.asList(tx0VarB, tx0VarB2, sx0VarA2.b(), yq2.T(LIBRARY_NAME, "18.2.0"));
    }
}

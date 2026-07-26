package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.da8;
import defpackage.hy0;
import defpackage.js8;
import defpackage.ko9;
import defpackage.rq4;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.u32;
import defpackage.vj1;
import defpackage.xc2;
import defpackage.xs8;
import defpackage.yd;
import defpackage.yo9;
import defpackage.yq2;
import defpackage.zd;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static yd lambda$getComponents$0(hy0 hy0Var) {
        xc2 xc2Var = (xc2) hy0Var.get(xc2.class);
        Context context = (Context) hy0Var.get(Context.class);
        da8 da8Var = (da8) hy0Var.get(da8.class);
        rq4.n(xc2Var);
        rq4.n(context);
        rq4.n(da8Var);
        rq4.n(context.getApplicationContext());
        if (zd.b == null) {
            synchronized (zd.class) {
                try {
                    if (zd.b == null) {
                        Bundle bundle = new Bundle(1);
                        xc2Var.a();
                        if ("[DEFAULT]".equals(xc2Var.b)) {
                            ((u32) da8Var).a(ko9.d, js8.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", xc2Var.h());
                        }
                        zd.b = new zd(yo9.e(context, bundle).b);
                    }
                } finally {
                }
            }
        }
        return zd.b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<tx0> getComponents() {
        sx0 sx0VarB = tx0.b(yd.class);
        sx0VarB.a(vj1.a(xc2.class));
        sx0VarB.a(vj1.a(Context.class));
        sx0VarB.a(vj1.a(da8.class));
        sx0VarB.g = xs8.a;
        if (!(sx0VarB.b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        sx0VarB.b = 2;
        return Arrays.asList(sx0VarB.b(), yq2.T("fire-analytics", "23.0.0"));
    }
}

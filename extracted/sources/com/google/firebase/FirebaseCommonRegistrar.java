package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ei1;
import defpackage.gd1;
import defpackage.hy2;
import defpackage.iy2;
import defpackage.jy2;
import defpackage.q20;
import defpackage.so6;
import defpackage.sx0;
import defpackage.tx0;
import defpackage.tz3;
import defpackage.u40;
import defpackage.ue1;
import defpackage.vj1;
import defpackage.vv1;
import defpackage.we1;
import defpackage.xc2;
import defpackage.yq2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        sx0 sx0VarB = tx0.b(ei1.class);
        sx0VarB.a(new vj1(2, 0, q20.class));
        sx0VarB.g = new gd1(13);
        arrayList.add(sx0VarB.b());
        so6 so6Var = new so6(u40.class, Executor.class);
        sx0 sx0Var = new sx0(we1.class, new Class[]{iy2.class, jy2.class});
        sx0Var.a(vj1.a(Context.class));
        sx0Var.a(vj1.a(xc2.class));
        sx0Var.a(new vj1(2, 0, hy2.class));
        sx0Var.a(new vj1(1, 1, ei1.class));
        sx0Var.a(new vj1(so6Var, 1, 0));
        sx0Var.g = new ue1(so6Var, 0);
        arrayList.add(sx0Var.b());
        arrayList.add(yq2.T("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(yq2.T("fire-core", "22.0.1"));
        arrayList.add(yq2.T("device-name", b(Build.PRODUCT)));
        arrayList.add(yq2.T("device-model", b(Build.DEVICE)));
        arrayList.add(yq2.T("device-brand", b(Build.BRAND)));
        arrayList.add(yq2.a0("android-target-sdk", new vv1(15)));
        arrayList.add(yq2.a0("android-min-sdk", new vv1(16)));
        arrayList.add(yq2.a0("android-platform", new vv1(17)));
        arrayList.add(yq2.a0("android-installer", new vv1(18)));
        try {
            tz3.b.getClass();
            str = "2.2.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(yq2.T("kotlin", str));
        }
        return arrayList;
    }
}

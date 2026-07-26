package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qy0 implements qn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qy0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.qn6
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                ry0 ry0Var = (ry0) this.b;
                tx0 tx0Var = (tx0) this.c;
                ly0 ly0Var = tx0Var.f;
                o77 o77Var = new o77();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<vj1> set = tx0Var.c;
                Set set2 = tx0Var.g;
                for (vj1 vj1Var : set) {
                    int i = vj1Var.c;
                    int i2 = vj1Var.b;
                    boolean z = i == 0;
                    so6 so6Var = vj1Var.a;
                    if (z) {
                        if (i2 == 2) {
                            hashSet4.add(so6Var);
                        } else {
                            hashSet.add(so6Var);
                        }
                    } else if (i == 2) {
                        hashSet3.add(so6Var);
                    } else if (i2 == 2) {
                        hashSet5.add(so6Var);
                    } else {
                        hashSet2.add(so6Var);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(so6.a(vn6.class));
                }
                o77Var.a = DesugarCollections.unmodifiableSet(hashSet);
                o77Var.b = DesugarCollections.unmodifiableSet(hashSet2);
                DesugarCollections.unmodifiableSet(hashSet3);
                o77Var.c = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                o77Var.d = ry0Var;
                return ly0Var.h(o77Var);
            case 1:
                return new ky2((Context) this.b, (String) this.c);
            default:
                xc2 xc2Var = (xc2) this.b;
                Context contextCreateDeviceProtectedStorageContext = (Context) this.c;
                String strD = xc2Var.d();
                ia1 ia1Var = new ia1();
                if (Build.VERSION.SDK_INT >= 24) {
                    contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(contextCreateDeviceProtectedStorageContext);
                }
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                ia1Var.a = z2;
                return ia1Var;
        }
    }
}

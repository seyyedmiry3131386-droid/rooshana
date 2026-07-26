package ir.myket.persistent.migration;

import android.content.SharedPreferences;
import defpackage.bj6;
import defpackage.g51;
import defpackage.mu7;
import defpackage.pb5;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.migration.MyketDataStoreMigrationKt$getMigrationsList$2", f = "MyketDataStoreMigration.kt", l = {}, m = "invokeSuspend", v = 1)
final class MyketDataStoreMigrationKt$getMigrationsList$2 extends SuspendLambda implements rp2 {
    public /* synthetic */ mu7 a;
    public /* synthetic */ pb5 b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        MyketDataStoreMigrationKt$getMigrationsList$2 myketDataStoreMigrationKt$getMigrationsList$2 = new MyketDataStoreMigrationKt$getMigrationsList$2(3, (g51) obj3);
        myketDataStoreMigrationKt$getMigrationsList$2.a = (mu7) obj;
        myketDataStoreMigrationKt$getMigrationsList$2.b = (pb5) obj2;
        return myketDataStoreMigrationKt$getMigrationsList$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mu7 mu7Var = this.a;
        pb5 pb5Var = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        pb5 pb5Var2 = new pb5(kotlin.collections.b.U(pb5Var.a()), false);
        SharedPreferences sharedPreferences = mu7Var.a;
        SharedPreferences sharedPreferences2 = mu7Var.a;
        mu7Var.a("AccessToken");
        if (sharedPreferences.contains("AccessToken")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var = ir.myket.persistent.datasource.a.o;
            String strB = mu7Var.b("AccessToken");
            if (strB == null) {
                strB = "";
            }
            pb5Var2.e(bj6Var, strB);
        }
        mu7Var.a("AccountId");
        if (sharedPreferences2.contains("AccountId")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var2 = ir.myket.persistent.datasource.a.p;
            String strB2 = mu7Var.b("AccountId");
            if (strB2 == null) {
                strB2 = "";
            }
            pb5Var2.e(bj6Var2, strB2);
        }
        mu7Var.a("UuId");
        if (sharedPreferences2.contains("UuId")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var3 = ir.myket.persistent.datasource.a.q;
            String strB3 = mu7Var.b("UuId");
            if (strB3 == null) {
                strB3 = "";
            }
            pb5Var2.e(bj6Var3, strB3);
        }
        mu7Var.a("AccountKey");
        if (sharedPreferences2.contains("AccountKey")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var4 = ir.myket.persistent.datasource.a.s;
            String strB4 = mu7Var.b("AccountKey");
            pb5Var2.e(bj6Var4, strB4 != null ? strB4 : "");
        }
        mu7Var.a("IsUserLoggedIn");
        if (sharedPreferences2.contains("IsUserLoggedIn")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var5 = ir.myket.persistent.datasource.a.t;
            mu7Var.a("IsUserLoggedIn");
            pb5Var2.e(bj6Var5, Boolean.valueOf(sharedPreferences2.getBoolean("IsUserLoggedIn", false)));
        }
        mu7Var.a("AppFirstLaunch");
        if (sharedPreferences2.contains("AppFirstLaunch")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var6 = ir.myket.persistent.datasource.a.A;
            mu7Var.a("AppFirstLaunch");
            pb5Var2.e(bj6Var6, Boolean.valueOf(sharedPreferences2.getBoolean("AppFirstLaunch", true)));
        }
        mu7Var.a("is_package_installer_available");
        if (sharedPreferences2.contains("is_package_installer_available")) {
            ir.myket.persistent.datasource.a.m.getClass();
            bj6 bj6Var7 = ir.myket.persistent.datasource.a.B;
            mu7Var.a("is_package_installer_available");
            pb5Var2.e(bj6Var7, Boolean.valueOf(sharedPreferences2.getBoolean("is_package_installer_available", true)));
        }
        return pb5Var2;
    }
}

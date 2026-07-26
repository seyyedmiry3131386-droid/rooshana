package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class qu2 {
    public final Context a;
    public ou2 b;

    public qu2(Context context) {
        this.a = context;
    }

    public static boolean d(Context context) {
        js3.p(context, "context");
        if (!e(context)) {
            try {
                if ((Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo("com.google.android.gms", 0).getLongVersionCode() : r6.versionCode) < 150000000) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                lw.g(null, "isGooglePlayServicesVersion15OrAbove", "Google Play Services package not found");
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        js3.p(context, "context");
        return gu2.e.b(context, hu2.a) != 0;
    }

    public final void a(cu2 cu2Var, long j) {
        String strC = c();
        if (strC.equals("")) {
            b(cu2Var, j);
        } else {
            cu2Var.s(this.a, strC);
        }
    }

    public final void b(cu2 cu2Var, long j) {
        if (this.b == null) {
            ou2 ou2Var = new ou2(this);
            this.b = ou2Var;
            ou2Var.b(lx.f, new Void[0]);
        }
        ou2 ou2Var2 = this.b;
        js3.n(ou2Var2, "null cannot be cast to non-null type ir.myket.core.async.AsyncTaskSupport<java.lang.Void, java.lang.Void, kotlin.String>");
        new pu2(j, ou2Var2, cu2Var, this).b(lx.f, new Void[0]);
    }

    public final String c() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("google_utils", 0);
        js3.o(sharedPreferences, "getSharedPreferences(...)");
        String string = sharedPreferences.getString("KEY_GOOGLE_AD_ID", "");
        if (Objects.equals(string, "") && new Random().nextInt(32) == 0) {
            string = "";
        }
        return string == null ? "" : string;
    }
}

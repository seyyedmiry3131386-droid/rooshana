package ir.mservices.market.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import defpackage.at2;
import defpackage.dp3;
import defpackage.lu7;
import defpackage.lw;
import defpackage.ly5;
import defpackage.my5;
import defpackage.o30;
import defpackage.t32;
import defpackage.w91;
import ir.mservices.market.app.update.common.manager.a;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class PackageInstallationChangeReceiver extends BroadcastReceiver {
    public volatile boolean a = false;
    public final Object b = new Object();
    public a c;
    public dp3 d;
    public lu7 e;

    public final void a(Context context, Intent intent) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    ((w91) ((my5) at2.a0(context))).l0(this);
                    this.a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Context context, String str, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action) || str.equals(context.getPackageName())) {
            return;
        }
        if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
            this.c.c(str);
            return;
        }
        if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
            PackageInfo packageInfoZ = this.d.z(0, str);
            if (packageInfoZ == null) {
                return;
            }
            if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                this.e.h(0L, lu7.s0);
                this.d.N(str, packageInfoZ.versionCode, null, Boolean.valueOf(intent.getBooleanExtra("android.intent.extra.REPLACING", false)), Boolean.valueOf(!TextUtils.isEmpty(intent.getPackage())), Boolean.valueOf(intent.getComponent() != null));
                return;
            }
            a aVar = this.c;
            aVar.getClass();
            Map map = (Map) aVar.h.getValue();
            o30 o30Var = map != null ? (o30) map.get(str) : null;
            if (o30Var == null || o30Var.f >= packageInfoZ.versionCode) {
                return;
            }
            this.c.c(str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context, intent);
        Objects.toString(intent);
        if (TextUtils.isEmpty(intent.getDataString()) || !intent.getDataString().startsWith("package:")) {
            lw.g(null, "Can not found packageName!", null);
            return;
        }
        String strSubstring = intent.getDataString().substring(8);
        if (TextUtils.isEmpty(strSubstring)) {
            lw.g(null, "Can not found packageName! It's Empty!", null);
            return;
        }
        b(context, dp3.y(strSubstring), intent);
        b(context, dp3.w(strSubstring), intent);
        t32 t32VarB = t32.b();
        ly5 ly5Var = new ly5();
        ly5Var.a = strSubstring;
        ly5Var.b = intent;
        t32VarB.g(ly5Var);
    }
}

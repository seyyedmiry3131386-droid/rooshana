package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class mr4 {
    public static final Object b = new Object();
    public static volatile mr4 c;
    public ir4 a;

    public static mr4 a(Context context) {
        mr4 mr4Var;
        synchronized (b) {
            try {
                if (c == null) {
                    Context applicationContext = context.getApplicationContext();
                    mr4 mr4Var2 = new mr4();
                    ir4 ir4Var = new ir4();
                    ir4Var.a = applicationContext;
                    ir4Var.b = applicationContext.getContentResolver();
                    mr4Var2.a = ir4Var;
                    c = mr4Var2;
                }
                mr4Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mr4Var;
    }

    public final boolean b(jr4 jr4Var) {
        ir4 ir4Var = this.a;
        lr4 lr4Var = jr4Var.a;
        Context context = ir4Var.a;
        int i = lr4Var.b;
        String str = lr4Var.a;
        int i2 = lr4Var.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (ir4Var.a(lr4Var, "android.permission.STATUS_BAR_SERVICE") || ir4Var.a(lr4Var, "android.permission.MEDIA_CONTENT_CONTROL") || i2 == 1000) {
                    return true;
                }
                String string = Settings.Secure.getString(ir4Var.b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}

package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class fw4 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a() {
        /*
            boolean r0 = e()
            if (r0 == 0) goto L4b
            boolean r0 = c()
            if (r0 == 0) goto L4b
            java.lang.String r0 = "ro.miui.ui.version.code"
            java.lang.String r0 = b(r0)     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L23
            boolean r1 = defpackage.f88.n0(r0)     // Catch: java.lang.Exception -> L23
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L23
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L23
            goto L24
        L23:
            r0 = -1
        L24:
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = b(r1)
            boolean r2 = d()
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "/"
            r4.append(r0)
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = defpackage.dw1.s(r4, r0, r3)
            return r0
        L4b:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw4.a():java.lang.String");
    }

    public static String b(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            js3.n(objInvoke, "null cannot be cast to non-null type kotlin.String");
            return (String) objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean c() {
        String strB = b("ro.miui.ui.version.name");
        return !(strB == null || f88.n0(strB));
    }

    public static boolean d() {
        String strB = b("persist.sys.miui_optimization");
        if (!"1".equals(strB) && !"true".equals(strB)) {
            if ("0".equals(strB) || "false".equals(strB)) {
                return false;
            }
            try {
                js3.n(Class.forName("android.miui.AppOpsUtils").getDeclaredMethod("isXOptMode", null).invoke(null, null), "null cannot be cast to non-null type kotlin.Boolean");
                return !((Boolean) r0).booleanValue();
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static boolean e() {
        try {
            String str = Build.MANUFACTURER;
            if (!m88.T(str, "Xiaomi", true)) {
                if (!m88.T(str, "blackshark", true)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

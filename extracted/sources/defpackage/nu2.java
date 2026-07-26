package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class nu2 {
    public static nu2 c;
    public final Context a;
    public volatile String b;

    public nu2(Context context) {
        this.a = context.getApplicationContext();
    }

    public static nu2 a(Context context) {
        rq4.n(context);
        synchronized (nu2.class) {
            try {
                if (c == null) {
                    mt9.a(context);
                    c = new nu2(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ee, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(android.content.pm.PackageInfo r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.c(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static xq9 d(PackageInfo packageInfo, xq9... xq9VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                t0.m("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            kr9 kr9Var = new kr9(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < xq9VarArr.length; i++) {
                if (xq9VarArr[i].equals(kr9Var)) {
                    return xq9VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r21) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.b(int):boolean");
    }
}

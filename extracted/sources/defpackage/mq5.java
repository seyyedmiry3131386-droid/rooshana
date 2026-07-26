package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class mq5 {
    public final d56 a = (d56) ((w91) ApplicationLauncher.o.b()).U.get();
    public final PendingInstall b;
    public final int c;
    public final AppCompatActivity d;

    public mq5(LaunchContentActivity launchContentActivity, PendingInstall pendingInstall, int i) {
        this.d = launchContentActivity;
        this.b = pendingInstall;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r6) {
        /*
            r5 = this;
            r0 = 2
            d56 r1 = r5.a
            androidx.appcompat.app.AppCompatActivity r2 = r5.d
            boolean r0 = r1.b(r2, r0)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L21
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 > r4) goto L15
            r0 = r1
            goto L1d
        L15:
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            boolean r0 = r0.canRequestPackageInstalls()
        L1d:
            if (r0 == 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 != 0) goto L25
            return r3
        L25:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<ir.mservices.market.version2.activity.ObbMoveBackActivity> r3 = ir.mservices.market.version2.activity.ObbMoveBackActivity.class
            r0.<init>(r2, r3)
            java.lang.String r3 = "BUNDLE_KEY_INSTALL_DATA"
            ir.mservices.market.data.install.PendingInstall r4 = r5.b
            r0.putExtra(r3, r4)
            java.lang.String r3 = "BUNDLE_KEY_MESSAGE"
            int r4 = r5.c
            r0.putExtra(r3, r4)
            r2.startActivityForResult(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq5.a(int):boolean");
    }
}

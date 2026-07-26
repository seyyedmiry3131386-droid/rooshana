package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eq7 {
    public static final String b;
    public static final String c;
    public final dq7 a;

    static {
        lp4.a("media3.session");
        String str = j29.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eq7(android.content.Context r13, android.content.ComponentName r14) {
        /*
            r12 = this;
            r12.<init>()
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            java.lang.String r0 = r14.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L14
        L12:
            r2 = r0
            goto L16
        L14:
            r0 = -1
            goto L12
        L16:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = a(r13, r0, r14)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L23
            r13 = 2
        L21:
            r3 = r13
            goto L36
        L23:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = a(r13, r0, r14)
            if (r0 == 0) goto L2d
            r13 = 1
            goto L21
        L2d:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r13 = a(r13, r0, r14)
            if (r13 == 0) goto L64
            r3 = r1
        L36:
            if (r3 == r1) goto L51
            fq7 r1 = new fq7
            java.lang.String r6 = r14.getPackageName()
            java.lang.String r7 = r14.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r11 = 0
            r4 = 1000000(0xf4240, float:1.401298E-39)
            r5 = 0
            r9 = 0
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.a = r1
            goto L63
        L51:
            r5 = r14
            gq7 r1 = new gq7
            java.lang.String r6 = r5.getPackageName()
            android.os.Bundle r7 = android.os.Bundle.EMPTY
            r3 = r2
            r2 = 0
            r4 = 101(0x65, float:1.42E-43)
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.a = r1
        L63:
            return
        L64:
            r5 = r14
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r14.<init>(r0)
            r14.append(r5)
            java.lang.String r0 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq7.<init>(android.content.Context, android.content.ComponentName):void");
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        dq7 dq7Var = this.a;
        boolean z = dq7Var instanceof fq7;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, dq7Var.g());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eq7) {
            return this.a.equals(((eq7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public eq7(int i, int i2, int i3, String str, xf3 xf3Var, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = xf3Var.asBinder();
        bundle.getClass();
        this.a = new fq7(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle, token);
    }
}

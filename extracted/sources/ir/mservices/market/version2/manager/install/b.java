package ir.mservices.market.version2.manager.install;

import defpackage.mx;
import ir.mservices.market.data.install.PendingInstall;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends mx {
    public final /* synthetic */ PendingInstall i;
    public final /* synthetic */ e j;

    public b(e eVar, PendingInstall pendingInstall) {
        this.j = eVar;
        this.i = pendingInstall;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013c A[PHI: r3 r12
      0x013c: PHI (r3v5 java.lang.Boolean) = (r3v2 java.lang.Boolean), (r3v3 java.lang.Boolean), (r3v0 java.lang.Boolean) binds: [B:41:0x015c, B:45:0x0163, B:37:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v7 android.content.pm.PackageInstaller$Session) = 
      (r12v5 android.content.pm.PackageInstaller$Session)
      (r12v6 android.content.pm.PackageInstaller$Session)
      (r12v10 android.content.pm.PackageInstaller$Session)
     binds: [B:41:0x015c, B:45:0x0163, B:37:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.mx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.b.a(java.lang.Object[]):java.lang.Object");
    }

    @Override // defpackage.mx
    public final void d(Object obj) {
        Boolean bool = (Boolean) obj;
        e eVar = this.j;
        eVar.s = null;
        if (bool == null) {
            eVar.i(4);
        } else if (Boolean.FALSE == bool) {
            eVar.i(6);
        }
    }
}

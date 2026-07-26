package defpackage;

import android.os.Binder;
import android.os.IBinder;
import androidx.browser.trusted.TrustedWebActivityService;

/* JADX INFO: loaded from: classes.dex */
public final class ct8 extends Binder implements rg3 {
    public final /* synthetic */ TrustedWebActivityService n;

    public ct8(TrustedWebActivityService trustedWebActivityService) {
        this.n = trustedWebActivityService;
        attachInterface(this, rg3.k);
    }

    public final void L() {
        TrustedWebActivityService trustedWebActivityService = this.n;
        int i = trustedWebActivityService.b;
        if (i != -1) {
            if (i != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        } else {
            trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            trustedWebActivityService.b();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0190 A[PHI: r11
      0x0190: PHI (r11v7 android.app.Notification) = (r11v4 android.app.Notification), (r11v8 android.app.Notification) binds: [B:76:0x017b, B:78:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct8.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

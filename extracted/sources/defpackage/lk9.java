package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class lk9 extends au2 {
    @Override // defpackage.d70
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return iInterfaceQueryLocalInterface instanceof dq9 ? (dq9) iInterfaceQueryLocalInterface : new dq9(iBinder);
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12200000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // defpackage.d70
    public final boolean usesClientTelemetry() {
        return true;
    }
}

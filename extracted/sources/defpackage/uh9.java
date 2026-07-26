package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class uh9 extends au2 {
    @Override // defpackage.d70
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof si9 ? (si9) iInterfaceQueryLocalInterface : new si9(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 0);
    }

    @Override // defpackage.d70
    public final Feature[] getApiFeatures() {
        return gu9.f;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 253600000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.d70
    public final boolean getUseDynamicLookup() {
        return true;
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class lx9 extends au2 {
    @Override // defpackage.d70
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof bq9 ? (bq9) iInterfaceQueryLocalInterface : new bq9(iBinder);
    }

    @Override // defpackage.d70
    public final Feature[] getApiFeatures() {
        return rf0.g;
    }

    @Override // defpackage.d70, defpackage.sl
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // defpackage.d70
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // defpackage.d70
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // defpackage.d70
    public final boolean usesClientTelemetry() {
        return true;
    }
}

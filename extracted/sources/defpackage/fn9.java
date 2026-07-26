package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class fn9 extends yl9 implements gn9 {
    public fn9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.gn9
    public final void I(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, bundle);
        zzc(1, parcelZza);
    }
}

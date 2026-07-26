package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.am9;
import defpackage.yl9;

/* JADX INFO: loaded from: classes.dex */
public final class zzgf extends yl9 implements zzgh {
    public zzgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzoqVar);
        zzd(2, parcelZza);
    }
}

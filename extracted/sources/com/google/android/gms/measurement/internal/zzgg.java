package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.am9;
import defpackage.zl9;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgg extends zl9 implements zzgh {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) am9.a(parcel, zzoq.CREATOR);
        am9.d(parcel);
        zze(zzoqVar);
        return true;
    }
}

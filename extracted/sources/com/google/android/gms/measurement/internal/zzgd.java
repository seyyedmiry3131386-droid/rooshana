package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.am9;
import defpackage.zl9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzgd extends zl9 implements zzge {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        am9.d(parcel);
        zze(arrayListCreateTypedArrayList);
        return true;
    }
}

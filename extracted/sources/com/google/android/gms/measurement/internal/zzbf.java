package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        Bundle bundleG = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                cc7.E(i, parcel);
            } else {
                bundleG = cc7.g(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new zzbe(bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}

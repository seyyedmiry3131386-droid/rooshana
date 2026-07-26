package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzor implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        ArrayList arrayListO = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                cc7.E(i, parcel);
            } else {
                arrayListO = cc7.o(parcel, i, zzom.CREATOR);
            }
        }
        cc7.p(iJ, parcel);
        return new zzoq(arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoq[i];
    }
}

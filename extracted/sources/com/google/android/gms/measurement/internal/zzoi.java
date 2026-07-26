package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class zzoi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        int iY = 0;
        long jA = 0;
        String strK = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strK = cc7.k(i, parcel);
            } else if (c == 2) {
                jA = cc7.A(i, parcel);
            } else if (c != 3) {
                cc7.E(i, parcel);
            } else {
                iY = cc7.y(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new zzoh(strK, jA, iY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoh[i];
    }
}

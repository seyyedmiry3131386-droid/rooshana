package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class zzag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        long jA = 0;
        long jA2 = 0;
        int iY = 0;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jA = cc7.A(i, parcel);
            } else if (c == 2) {
                iY = cc7.y(i, parcel);
            } else if (c != 3) {
                cc7.E(i, parcel);
            } else {
                jA2 = cc7.A(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new zzaf(jA, iY, jA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}

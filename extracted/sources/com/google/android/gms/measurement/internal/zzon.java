package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        byte[] bArrH = null;
        String strK = null;
        Bundle bundleG = null;
        String strK2 = null;
        long jA = 0;
        long jA2 = 0;
        int iY = 0;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jA = cc7.A(i, parcel);
                    break;
                case 2:
                    bArrH = cc7.h(i, parcel);
                    break;
                case 3:
                    strK = cc7.k(i, parcel);
                    break;
                case 4:
                    bundleG = cc7.g(i, parcel);
                    break;
                case 5:
                    iY = cc7.y(i, parcel);
                    break;
                case 6:
                    jA2 = cc7.A(i, parcel);
                    break;
                case 7:
                    strK2 = cc7.k(i, parcel);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new zzom(jA, bArrH, strK, bundleG, iY, jA2, strK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzom[i];
    }
}

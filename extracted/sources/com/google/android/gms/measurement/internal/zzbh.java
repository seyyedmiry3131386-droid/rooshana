package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh implements Parcelable.Creator {
    public static void zza(zzbg zzbgVar, Parcel parcel, int i) {
        String str = zzbgVar.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 2, str, false);
        uy6.C(parcel, 3, zzbgVar.zzb, i, false);
        uy6.D(parcel, 4, zzbgVar.zzc, false);
        long j = zzbgVar.zzd;
        uy6.I(parcel, 5, 8);
        parcel.writeLong(j);
        uy6.K(iJ, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        long jA = 0;
        String strK = null;
        zzbe zzbeVar = null;
        String strK2 = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strK = cc7.k(i, parcel);
            } else if (c == 3) {
                zzbeVar = (zzbe) cc7.j(parcel, i, zzbe.CREATOR);
            } else if (c == 4) {
                strK2 = cc7.k(i, parcel);
            } else if (c != 5) {
                cc7.E(i, parcel);
            } else {
                jA = cc7.A(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new zzbg(strK, zzbeVar, strK2, jA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbg[i];
    }
}

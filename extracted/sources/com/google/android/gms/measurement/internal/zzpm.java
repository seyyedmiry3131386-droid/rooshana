package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzpm implements Parcelable.Creator {
    public static void zza(zzpl zzplVar, Parcel parcel, int i) {
        int i2 = zzplVar.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        uy6.D(parcel, 2, zzplVar.zzb, false);
        long j = zzplVar.zzc;
        uy6.I(parcel, 3, 8);
        parcel.writeLong(j);
        uy6.B(parcel, 4, zzplVar.zzd);
        uy6.D(parcel, 6, zzplVar.zze, false);
        uy6.D(parcel, 7, zzplVar.zzf, false);
        uy6.x(parcel, 8, zzplVar.zzg);
        uy6.K(iJ, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        String strK = null;
        Long lB = null;
        Float fValueOf = null;
        String strK2 = null;
        String strK3 = null;
        Double dV = null;
        long jA = 0;
        int iY = 0;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iY = cc7.y(i, parcel);
                    break;
                case 2:
                    strK = cc7.k(i, parcel);
                    break;
                case 3:
                    jA = cc7.A(i, parcel);
                    break;
                case 4:
                    lB = cc7.B(i, parcel);
                    break;
                case 5:
                    int iC = cc7.C(i, parcel);
                    if (iC != 0) {
                        cc7.M(parcel, iC, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strK2 = cc7.k(i, parcel);
                    break;
                case 7:
                    strK3 = cc7.k(i, parcel);
                    break;
                case '\b':
                    dV = cc7.v(i, parcel);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new zzpl(iY, strK, jA, lB, fValueOf, strK2, strK3, dV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        String strK = null;
        String strK2 = null;
        zzpl zzplVar = null;
        String strK3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long jA = 0;
        long jA2 = 0;
        long jA3 = 0;
        boolean zU = false;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strK = cc7.k(i, parcel);
                    break;
                case 3:
                    strK2 = cc7.k(i, parcel);
                    break;
                case 4:
                    zzplVar = (zzpl) cc7.j(parcel, i, zzpl.CREATOR);
                    break;
                case 5:
                    jA = cc7.A(i, parcel);
                    break;
                case 6:
                    zU = cc7.u(i, parcel);
                    break;
                case 7:
                    strK3 = cc7.k(i, parcel);
                    break;
                case '\b':
                    zzbgVar = (zzbg) cc7.j(parcel, i, zzbg.CREATOR);
                    break;
                case '\t':
                    jA2 = cc7.A(i, parcel);
                    break;
                case '\n':
                    zzbgVar2 = (zzbg) cc7.j(parcel, i, zzbg.CREATOR);
                    break;
                case 11:
                    jA3 = cc7.A(i, parcel);
                    break;
                case '\f':
                    zzbgVar3 = (zzbg) cc7.j(parcel, i, zzbg.CREATOR);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new zzah(strK, strK2, zzplVar, jA, zU, strK3, zzbgVar, jA2, zzbgVar2, jA3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}

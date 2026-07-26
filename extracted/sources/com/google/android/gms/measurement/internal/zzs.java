package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cc7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        boolean zU = false;
        int iY = 0;
        boolean zU2 = false;
        boolean zU3 = false;
        int iY2 = 0;
        int iY3 = 0;
        long jA = 0;
        long jA2 = 0;
        long jA3 = 0;
        long jA4 = 0;
        long jA5 = 0;
        long jA6 = 0;
        long jA7 = 0;
        String strK = "";
        String strK2 = strK;
        String strK3 = strK2;
        String strK4 = strK3;
        String strK5 = null;
        String strK6 = null;
        String strK7 = null;
        String strK8 = null;
        String strK9 = null;
        String strK10 = null;
        Boolean boolValueOf = null;
        ArrayList arrayListM = null;
        String strK11 = null;
        String strK12 = null;
        int iY4 = 100;
        boolean zU4 = true;
        boolean zU5 = true;
        long jA8 = -2147483648L;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strK5 = cc7.k(i, parcel);
                    break;
                case 3:
                    strK6 = cc7.k(i, parcel);
                    break;
                case 4:
                    strK7 = cc7.k(i, parcel);
                    break;
                case 5:
                    strK8 = cc7.k(i, parcel);
                    break;
                case 6:
                    jA = cc7.A(i, parcel);
                    break;
                case 7:
                    jA2 = cc7.A(i, parcel);
                    break;
                case '\b':
                    strK9 = cc7.k(i, parcel);
                    break;
                case '\t':
                    zU4 = cc7.u(i, parcel);
                    break;
                case '\n':
                    zU = cc7.u(i, parcel);
                    break;
                case 11:
                    jA8 = cc7.A(i, parcel);
                    break;
                case '\f':
                    strK10 = cc7.k(i, parcel);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    cc7.E(i, parcel);
                    break;
                case 14:
                    jA3 = cc7.A(i, parcel);
                    break;
                case 15:
                    iY = cc7.y(i, parcel);
                    break;
                case 16:
                    zU5 = cc7.u(i, parcel);
                    break;
                case 18:
                    zU2 = cc7.u(i, parcel);
                    break;
                case 21:
                    int iC = cc7.C(i, parcel);
                    if (iC != 0) {
                        cc7.M(parcel, iC, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jA4 = cc7.A(i, parcel);
                    break;
                case 23:
                    arrayListM = cc7.m(i, parcel);
                    break;
                case 25:
                    strK = cc7.k(i, parcel);
                    break;
                case 26:
                    strK2 = cc7.k(i, parcel);
                    break;
                case 27:
                    strK11 = cc7.k(i, parcel);
                    break;
                case 28:
                    zU3 = cc7.u(i, parcel);
                    break;
                case 29:
                    jA5 = cc7.A(i, parcel);
                    break;
                case 30:
                    iY4 = cc7.y(i, parcel);
                    break;
                case 31:
                    strK3 = cc7.k(i, parcel);
                    break;
                case ' ':
                    iY2 = cc7.y(i, parcel);
                    break;
                case '\"':
                    jA6 = cc7.A(i, parcel);
                    break;
                case '#':
                    strK12 = cc7.k(i, parcel);
                    break;
                case '$':
                    strK4 = cc7.k(i, parcel);
                    break;
                case '%':
                    jA7 = cc7.A(i, parcel);
                    break;
                case '&':
                    iY3 = cc7.y(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new zzr(strK5, strK6, strK7, strK8, jA, jA2, strK9, zU4, zU, jA8, strK10, jA3, iY, zU5, zU2, boolValueOf, jA4, arrayListM, strK, strK2, strK11, zU3, jA5, iY4, strK3, iY2, jA6, strK12, strK4, jA7, iY3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}

package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cc7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        ArrayList arrayListM = null;
        ArrayList arrayListO = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zU = cc7.u(i, parcel);
                    break;
                case 2:
                    strK = cc7.k(i, parcel);
                    break;
                case 3:
                    strK2 = cc7.k(i, parcel);
                    break;
                case 4:
                    zU2 = cc7.u(i, parcel);
                    break;
                case 5:
                    strK3 = cc7.k(i, parcel);
                    break;
                case 6:
                    arrayListM = cc7.m(i, parcel);
                    break;
                case 7:
                    zU3 = cc7.u(i, parcel);
                    break;
                case '\b':
                    arrayListO = cc7.o(parcel, i, Claim.CREATOR);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zU, strK, strK2, zU2, strK3, arrayListM, zU3, arrayListO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}

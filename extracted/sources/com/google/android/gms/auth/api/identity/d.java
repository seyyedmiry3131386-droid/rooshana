package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        byte[] bArrH = null;
        boolean zU = false;
        String strK = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zU = cc7.u(i, parcel);
            } else if (c == 2) {
                bArrH = cc7.h(i, parcel);
            } else if (c != 3) {
                cc7.E(i, parcel);
            } else {
                strK = cc7.k(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new BeginSignInRequest.PasskeysRequestOptions(strK, zU, bArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeysRequestOptions[i];
    }
}

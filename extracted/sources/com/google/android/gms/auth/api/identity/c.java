package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        String strK = null;
        boolean zU = false;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zU = cc7.u(i, parcel);
            } else if (c != 2) {
                cc7.E(i, parcel);
            } else {
                strK = cc7.k(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(zU, strK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
    }
}

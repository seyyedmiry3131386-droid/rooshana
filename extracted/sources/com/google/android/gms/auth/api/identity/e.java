package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        boolean zU = false;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                cc7.E(i, parcel);
            } else {
                zU = cc7.u(i, parcel);
            }
        }
        cc7.p(iJ, parcel);
        return new BeginSignInRequest.PasswordRequestOptions(zU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasswordRequestOptions[i];
    }
}

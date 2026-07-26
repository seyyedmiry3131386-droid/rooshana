package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cc7;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iJ = cc7.J(parcel);
        boolean zU = false;
        int iY = 0;
        boolean zU2 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strK = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < iJ) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) cc7.j(parcel, i, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) cc7.j(parcel, i, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strK = cc7.k(i, parcel);
                    break;
                case 4:
                    zU = cc7.u(i, parcel);
                    break;
                case 5:
                    iY = cc7.y(i, parcel);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) cc7.j(parcel, i, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) cc7.j(parcel, i, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case '\b':
                    zU2 = cc7.u(i, parcel);
                    break;
                default:
                    cc7.E(i, parcel);
                    break;
            }
        }
        cc7.p(iJ, parcel);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strK, zU, iY, passkeysRequestOptions, passkeyJsonRequestOptions, zU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}

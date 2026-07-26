package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaw> CREATOR = new th9(22);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public zaw(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.K(iJ, parcel);
    }
}

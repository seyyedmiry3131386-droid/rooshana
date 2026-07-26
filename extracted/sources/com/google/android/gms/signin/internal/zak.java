package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new th9(17);
    public final int a;
    public final ConnectionResult b;
    public final zay c;

    public zak(int i, ConnectionResult connectionResult, zay zayVar) {
        this.a = i;
        this.b = connectionResult;
        this.c = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.K(iJ, parcel);
    }
}

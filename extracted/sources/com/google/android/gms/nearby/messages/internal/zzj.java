package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new uq9(21);
    public final int a;
    public final ClientAppContext b;
    public final int c;

    public zzj(int i, ClientAppContext clientAppContext, int i2) {
        this.a = i;
        this.b = clientAppContext;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.K(iJ, parcel);
    }
}

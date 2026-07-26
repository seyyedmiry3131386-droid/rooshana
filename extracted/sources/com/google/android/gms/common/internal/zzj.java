package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new uq9(18);
    public Bundle a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.v(parcel, 1, this.a);
        uy6.G(parcel, 2, this.b, i);
        int i2 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i2);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.K(iJ, parcel);
    }
}

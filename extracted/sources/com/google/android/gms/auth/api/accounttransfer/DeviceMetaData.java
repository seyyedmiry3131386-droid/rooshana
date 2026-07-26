package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ix9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new ix9(9);
    public final int a;
    public final boolean b;
    public final long c;
    public final boolean d;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uy6.I(parcel, 3, 8);
        parcel.writeLong(this.c);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

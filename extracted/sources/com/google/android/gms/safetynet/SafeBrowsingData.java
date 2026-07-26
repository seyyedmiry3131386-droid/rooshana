package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new uq9(7);
    public String a;
    public DataHolder b;
    public ParcelFileDescriptor c;
    public long d;
    public byte[] e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 2, this.a, false);
        uy6.C(parcel, 3, this.b, i, false);
        uy6.C(parcel, 4, this.c, i, false);
        long j = this.d;
        uy6.I(parcel, 5, 8);
        parcel.writeLong(j);
        uy6.w(parcel, 6, this.e, false);
        uy6.K(iJ, parcel);
        this.c = null;
    }
}

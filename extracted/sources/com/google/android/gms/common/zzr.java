package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.ln2;
import defpackage.o37;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new ds9(28);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public zzr(int i, int i2, long j, String str, boolean z) {
        this.a = z;
        this.b = str;
        this.c = ln2.j(i) - 1;
        this.d = o37.D(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        uy6.D(parcel, 2, this.b, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d);
        uy6.I(parcel, 5, 8);
        parcel.writeLong(this.e);
        uy6.K(iJ, parcel);
    }
}

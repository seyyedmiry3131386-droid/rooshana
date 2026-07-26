package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzis extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzis> CREATOR = new uq9(3);
    public final int a;
    public final int b;
    public final byte[] c;
    public final boolean d;

    public zzis(byte[] bArr, int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.b);
        uy6.w(parcel, 2, this.c, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}

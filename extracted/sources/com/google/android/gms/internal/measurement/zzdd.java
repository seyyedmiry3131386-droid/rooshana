package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new hm9(18);
    public final long a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public zzdd(long j, long j2, boolean z, Bundle bundle, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 8);
        parcel.writeLong(this.a);
        uy6.I(parcel, 2, 8);
        parcel.writeLong(this.b);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.v(parcel, 7, this.d);
        uy6.D(parcel, 8, this.e, false);
        uy6.K(iJ, parcel);
    }
}

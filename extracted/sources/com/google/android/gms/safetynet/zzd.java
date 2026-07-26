package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new hm9(20);
    public final long a;
    public final HarmfulAppsData[] b;
    public final int c;
    public final boolean d;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.a = j;
        this.b = harmfulAppsDataArr;
        this.d = z;
        if (z) {
            this.c = i;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 2, 8);
        parcel.writeLong(this.a);
        uy6.G(parcel, 3, this.b, i);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.c);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

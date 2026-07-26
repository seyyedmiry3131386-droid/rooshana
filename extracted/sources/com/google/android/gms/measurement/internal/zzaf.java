package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    public final long zza;
    public final int zzb;
    public final long zzc;

    public zzaf(long j, int i, long j2) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.zzb;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.zzc;
        uy6.I(parcel, 3, 8);
        parcel.writeLong(j2);
        uy6.K(iJ, parcel);
    }
}

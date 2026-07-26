package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzoi();
    public final String zza;
    public final long zzb;
    public final int zzc;

    public zzoh(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, str, false);
        long j = this.zzb;
        uy6.I(parcel, 2, 8);
        parcel.writeLong(j);
        int i2 = this.zzc;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i2);
        uy6.K(iJ, parcel);
    }
}

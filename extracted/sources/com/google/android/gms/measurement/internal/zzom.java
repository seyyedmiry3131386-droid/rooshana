package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.zza = j;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i;
        this.zzf = j2;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 8);
        parcel.writeLong(j);
        uy6.w(parcel, 2, this.zzb, false);
        uy6.D(parcel, 3, this.zzc, false);
        uy6.v(parcel, 4, this.zzd);
        int i2 = this.zze;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(i2);
        long j2 = this.zzf;
        uy6.I(parcel, 6, 8);
        parcel.writeLong(j2);
        uy6.D(parcel, 7, this.zzg, false);
        uy6.K(iJ, parcel);
    }
}

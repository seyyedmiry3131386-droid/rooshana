package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public String zza;
    public String zzb;
    public zzpl zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzbg zzg;
    public long zzh;
    public zzbg zzi;
    public final long zzj;
    public final zzbg zzk;

    public zzah(zzah zzahVar) {
        rq4.n(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 2, this.zza, false);
        uy6.D(parcel, 3, this.zzb, false);
        uy6.C(parcel, 4, this.zzc, i, false);
        long j = this.zzd;
        uy6.I(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.zze;
        uy6.I(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        uy6.D(parcel, 7, this.zzf, false);
        uy6.C(parcel, 8, this.zzg, i, false);
        long j2 = this.zzh;
        uy6.I(parcel, 9, 8);
        parcel.writeLong(j2);
        uy6.C(parcel, 10, this.zzi, i, false);
        long j3 = this.zzj;
        uy6.I(parcel, 11, 8);
        parcel.writeLong(j3);
        uy6.C(parcel, 12, this.zzk, i, false);
        uy6.K(iJ, parcel);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbg zzbgVar, long j2, zzbg zzbgVar2, long j3, zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j2;
        this.zzi = zzbgVar2;
        this.zzj = j3;
        this.zzk = zzbgVar3;
    }
}

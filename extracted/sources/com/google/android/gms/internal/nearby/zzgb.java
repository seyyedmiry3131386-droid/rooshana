package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgb> CREATOR = new up9(1);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final boolean h;
    public final int i;
    public final zzjk j;
    public final zzo k;
    public final int l;

    public zzgb(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, int i, zzjk zzjkVar, zzo zzoVar, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = bArr;
        this.f = bArr2;
        this.g = bArr3;
        this.h = z2;
        this.i = i;
        this.j = zzjkVar;
        this.k = zzoVar;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (vy2.w(this.a, zzgbVar.a) && vy2.w(this.b, zzgbVar.b) && vy2.w(this.c, zzgbVar.c) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(zzgbVar.d)) && Arrays.equals(this.e, zzgbVar.e) && Arrays.equals(this.f, zzgbVar.f) && Arrays.equals(this.g, zzgbVar.g) && vy2.w(Boolean.valueOf(this.h), Boolean.valueOf(zzgbVar.h)) && vy2.w(Integer.valueOf(this.i), Integer.valueOf(zzgbVar.i)) && vy2.w(this.j, zzgbVar.j) && vy2.w(this.k, zzgbVar.k) && vy2.w(Integer.valueOf(this.l), Integer.valueOf(zzgbVar.l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k, Integer.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.w(parcel, 5, this.e, false);
        uy6.w(parcel, 6, this.f, false);
        uy6.w(parcel, 7, this.g, false);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uy6.I(parcel, 9, 4);
        parcel.writeInt(this.i);
        uy6.C(parcel, 10, this.j, i, false);
        uy6.C(parcel, 11, this.k, i, false);
        uy6.I(parcel, 12, 4);
        parcel.writeInt(this.l);
        uy6.K(iJ, parcel);
    }
}

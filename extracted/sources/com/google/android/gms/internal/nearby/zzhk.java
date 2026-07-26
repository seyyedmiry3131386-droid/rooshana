package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzhk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhk> CREATOR = new up9(18);
    public long a;
    public int b;
    public byte[] c;
    public ParcelFileDescriptor d;
    public String e;
    public long f;
    public ParcelFileDescriptor g;
    public Uri h;
    public long i;
    public boolean j;
    public zzhg k;
    public long l;
    public String m;
    public String n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzhk) {
            zzhk zzhkVar = (zzhk) obj;
            if (vy2.w(Long.valueOf(this.a), Long.valueOf(zzhkVar.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzhkVar.b)) && Arrays.equals(this.c, zzhkVar.c) && vy2.w(this.d, zzhkVar.d) && vy2.w(this.e, zzhkVar.e) && vy2.w(Long.valueOf(this.f), Long.valueOf(zzhkVar.f)) && vy2.w(this.g, zzhkVar.g) && vy2.w(this.h, zzhkVar.h) && vy2.w(Long.valueOf(this.i), Long.valueOf(zzhkVar.i)) && vy2.w(Boolean.valueOf(this.j), Boolean.valueOf(zzhkVar.j)) && vy2.w(this.k, zzhkVar.k) && vy2.w(Long.valueOf(this.l), Long.valueOf(zzhkVar.l)) && vy2.w(this.m, zzhkVar.m) && vy2.w(this.n, zzhkVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, Long.valueOf(this.f), this.g, this.h, Long.valueOf(this.i), Boolean.valueOf(this.j), this.k, Long.valueOf(this.l), this.m, this.n});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        long j = this.a;
        uy6.I(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        uy6.w(parcel, 3, this.c, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.D(parcel, 5, this.e, false);
        long j2 = this.f;
        uy6.I(parcel, 6, 8);
        parcel.writeLong(j2);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.C(parcel, 8, this.h, i, false);
        long j3 = this.i;
        uy6.I(parcel, 9, 8);
        parcel.writeLong(j3);
        boolean z = this.j;
        uy6.I(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        uy6.C(parcel, 11, this.k, i, false);
        long j4 = this.l;
        uy6.I(parcel, 12, 8);
        parcel.writeLong(j4);
        uy6.D(parcel, 13, this.m, false);
        uy6.D(parcel, 14, this.n, false);
        uy6.K(iJ, parcel);
    }
}

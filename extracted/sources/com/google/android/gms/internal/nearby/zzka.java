package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzka extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzka> CREATOR = new uq9(22);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public long k;
    public int l;
    public byte[] m;
    public byte[] n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzka) {
            zzka zzkaVar = (zzka) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzkaVar.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzkaVar.b)) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzkaVar.c)) && vy2.w(Integer.valueOf(this.d), Integer.valueOf(zzkaVar.d)) && vy2.w(Integer.valueOf(this.e), Integer.valueOf(zzkaVar.e)) && vy2.w(Long.valueOf(this.f), Long.valueOf(zzkaVar.f)) && vy2.w(Long.valueOf(this.g), Long.valueOf(zzkaVar.g)) && vy2.w(Float.valueOf(this.h), Float.valueOf(zzkaVar.h)) && vy2.w(Float.valueOf(this.i), Float.valueOf(zzkaVar.i)) && vy2.w(Long.valueOf(this.j), Long.valueOf(zzkaVar.j)) && vy2.w(Long.valueOf(this.k), Long.valueOf(zzkaVar.k)) && vy2.w(Integer.valueOf(this.l), Integer.valueOf(zzkaVar.l)) && Arrays.equals(this.m, zzkaVar.m) && Arrays.equals(this.n, zzkaVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        uy6.I(parcel, 4, 4);
        parcel.writeInt(i5);
        int i6 = this.e;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(i6);
        long j = this.f;
        uy6.I(parcel, 6, 8);
        parcel.writeLong(j);
        long j2 = this.g;
        uy6.I(parcel, 7, 8);
        parcel.writeLong(j2);
        float f = this.h;
        uy6.I(parcel, 8, 4);
        parcel.writeFloat(f);
        float f2 = this.i;
        uy6.I(parcel, 9, 4);
        parcel.writeFloat(f2);
        long j3 = this.j;
        uy6.I(parcel, 10, 8);
        parcel.writeLong(j3);
        long j4 = this.k;
        uy6.I(parcel, 11, 8);
        parcel.writeLong(j4);
        int i7 = this.l;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(i7);
        uy6.w(parcel, 13, this.m, false);
        uy6.w(parcel, 14, this.n, false);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmi> CREATOR = new ds9(10);
    public int a;
    public int b;
    public byte[] c;
    public zznr d;
    public int e;
    public zzox[] f;
    public int g;
    public byte[] h;
    public zzox i;
    public zzlw j;
    public int k;
    public int l;
    public boolean m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmi) {
            zzmi zzmiVar = (zzmi) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzmiVar.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzmiVar.b)) && Arrays.equals(this.c, zzmiVar.c) && vy2.w(this.d, zzmiVar.d) && vy2.w(Integer.valueOf(this.e), Integer.valueOf(zzmiVar.e)) && Arrays.equals(this.f, zzmiVar.f) && vy2.w(Integer.valueOf(this.g), Integer.valueOf(zzmiVar.g)) && Arrays.equals(this.h, zzmiVar.h) && vy2.w(this.i, zzmiVar.i) && vy2.w(this.j, zzmiVar.j) && vy2.w(Integer.valueOf(this.k), Integer.valueOf(zzmiVar.k)) && vy2.w(Integer.valueOf(this.l), Integer.valueOf(zzmiVar.l)) && vy2.w(Boolean.valueOf(this.m), Boolean.valueOf(zzmiVar.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), this.i, this.j, Integer.valueOf(this.k), Integer.valueOf(this.l), Boolean.valueOf(this.m)});
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
        uy6.w(parcel, 3, this.c, false);
        uy6.C(parcel, 4, this.d, i, false);
        int i4 = this.e;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(i4);
        uy6.G(parcel, 6, this.f, i);
        int i5 = this.g;
        uy6.I(parcel, 7, 4);
        parcel.writeInt(i5);
        uy6.w(parcel, 8, this.h, false);
        uy6.C(parcel, 9, this.i, i, false);
        uy6.C(parcel, 10, this.j, i, false);
        int i6 = this.k;
        uy6.I(parcel, 11, 4);
        parcel.writeInt(i6);
        int i7 = this.l;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(i7);
        boolean z = this.m;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(z ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

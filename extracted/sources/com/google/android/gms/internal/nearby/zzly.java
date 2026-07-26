package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzly extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzly> CREATOR = new ds9(4);
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int[] f;
    public int[] g;
    public float h;
    public int[] i;
    public int[] j;
    public int[] k;
    public boolean l;
    public boolean m;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzly) {
            zzly zzlyVar = (zzly) obj;
            if (vy2.w(Boolean.valueOf(this.a), Boolean.valueOf(zzlyVar.a)) && vy2.w(Boolean.valueOf(this.b), Boolean.valueOf(zzlyVar.b)) && vy2.w(Boolean.valueOf(this.c), Boolean.valueOf(zzlyVar.c)) && vy2.w(Integer.valueOf(this.d), Integer.valueOf(zzlyVar.d)) && vy2.w(Integer.valueOf(this.e), Integer.valueOf(zzlyVar.e)) && Arrays.equals(this.f, zzlyVar.f) && Arrays.equals(this.g, zzlyVar.g) && vy2.w(Float.valueOf(this.h), Float.valueOf(zzlyVar.h)) && Arrays.equals(this.i, zzlyVar.i) && Arrays.equals(this.j, zzlyVar.j) && Arrays.equals(this.k, zzlyVar.k) && vy2.w(Boolean.valueOf(this.l), Boolean.valueOf(zzlyVar.l)) && vy2.w(Boolean.valueOf(this.m), Boolean.valueOf(zzlyVar.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Float.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Boolean.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        boolean z = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(z3 ? 1 : 0);
        int i2 = this.d;
        uy6.I(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.e;
        uy6.I(parcel, 5, 4);
        parcel.writeInt(i3);
        uy6.z(parcel, 6, this.f);
        uy6.z(parcel, 7, this.g);
        float f = this.h;
        uy6.I(parcel, 8, 4);
        parcel.writeFloat(f);
        uy6.z(parcel, 9, this.i);
        uy6.z(parcel, 10, this.j);
        uy6.z(parcel, 11, this.k);
        boolean z4 = this.l;
        uy6.I(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.m;
        uy6.I(parcel, 13, 4);
        parcel.writeInt(z5 ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

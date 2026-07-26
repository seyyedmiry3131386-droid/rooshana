package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import defpackage.bp9;
import defpackage.rp9;
import defpackage.to9;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzib extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzib> CREATOR = new up9(26);
    public rp9 a;
    public to9 b;
    public String c;
    public String d;
    public long e;
    public AdvertisingOptions f;
    public bp9 g;
    public byte[] h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzib) {
            zzib zzibVar = (zzib) obj;
            if (vy2.w(this.a, zzibVar.a) && vy2.w(this.b, zzibVar.b) && vy2.w(this.c, zzibVar.c) && vy2.w(this.d, zzibVar.d) && vy2.w(Long.valueOf(this.e), Long.valueOf(zzibVar.e)) && vy2.w(this.f, zzibVar.f) && vy2.w(this.g, zzibVar.g) && Arrays.equals(this.h, zzibVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        rp9 rp9Var = this.a;
        uy6.y(parcel, 1, rp9Var == null ? null : rp9Var.asBinder());
        to9 to9Var = this.b;
        uy6.y(parcel, 2, to9Var == null ? null : to9Var.o);
        uy6.D(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.d, false);
        long j = this.e;
        uy6.I(parcel, 5, 8);
        parcel.writeLong(j);
        uy6.C(parcel, 6, this.f, i, false);
        bp9 bp9Var = this.g;
        uy6.y(parcel, 7, bp9Var != null ? bp9Var.asBinder() : null);
        uy6.w(parcel, 8, this.h, false);
        uy6.K(iJ, parcel);
    }
}

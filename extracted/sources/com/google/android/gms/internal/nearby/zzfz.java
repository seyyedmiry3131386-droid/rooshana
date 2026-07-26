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
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new up9(0);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final zzjk e;
    public final zzo f;

    public zzfz(String str, int i, int i2, int i3, zzjk zzjkVar, zzo zzoVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = zzjkVar;
        this.f = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfz) {
            zzfz zzfzVar = (zzfz) obj;
            if (vy2.w(this.a, zzfzVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzfzVar.b)) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzfzVar.c)) && vy2.w(Integer.valueOf(this.d), Integer.valueOf(zzfzVar.d)) && vy2.w(this.e, zzfzVar.e) && vy2.w(this.f, zzfzVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.K(iJ, parcel);
    }
}

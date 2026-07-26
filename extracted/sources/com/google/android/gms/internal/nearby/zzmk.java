package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmk> CREATOR = new ds9(11);
    public final zzme a;
    public final zzme b;
    public final zzme c;
    public final long d;
    public final int e;
    public final zzka f;

    public zzmk(zzme zzmeVar, zzme zzmeVar2, zzme zzmeVar3, long j, int i, zzka zzkaVar) {
        this.a = zzmeVar;
        this.b = zzmeVar2;
        this.c = zzmeVar3;
        this.d = j;
        this.e = i;
        this.f = zzkaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmk) {
            zzmk zzmkVar = (zzmk) obj;
            if (vy2.w(this.a, zzmkVar.a) && vy2.w(this.b, zzmkVar.b) && vy2.w(this.c, zzmkVar.c) && vy2.w(Long.valueOf(this.d), Long.valueOf(zzmkVar.d)) && vy2.w(Integer.valueOf(this.e), Integer.valueOf(zzmkVar.e)) && vy2.w(this.f, zzmkVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.I(parcel, 4, 8);
        parcel.writeLong(this.d);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.K(iJ, parcel);
    }
}

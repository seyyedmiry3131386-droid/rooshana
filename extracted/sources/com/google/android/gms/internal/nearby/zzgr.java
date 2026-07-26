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
public final class zzgr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgr> CREATOR = new up9(9);
    public final String a;
    public final zzhk b;
    public final boolean c;
    public final int d;
    public final zzjk e;
    public final zzo f;

    public zzgr(String str, zzhk zzhkVar, boolean z, int i, zzjk zzjkVar, zzo zzoVar) {
        this.a = str;
        this.b = zzhkVar;
        this.c = z;
        this.d = i;
        this.e = zzjkVar;
        this.f = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgr) {
            zzgr zzgrVar = (zzgr) obj;
            if (vy2.w(this.a, zzgrVar.a) && vy2.w(this.b, zzgrVar.b) && vy2.w(Boolean.valueOf(this.c), Boolean.valueOf(zzgrVar.c)) && vy2.w(Integer.valueOf(this.d), Integer.valueOf(zzgrVar.d)) && vy2.w(this.e, zzgrVar.e) && vy2.w(this.f, zzgrVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.zzaa;
import com.google.android.gms.nearby.connection.zzo;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzgl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzgl> CREATOR = new up9(6);
    public final String a;
    public final int b;
    public final zzaa c;
    public final int d;
    public final zzo e;

    public zzgl(String str, int i, zzaa zzaaVar, int i2, zzo zzoVar) {
        this.a = str;
        this.b = i;
        this.c = zzaaVar;
        this.d = i2;
        this.e = zzoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgl) {
            zzgl zzglVar = (zzgl) obj;
            if (vy2.w(this.a, zzglVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzglVar.b)) && vy2.w(this.c, zzglVar.c) && vy2.w(Integer.valueOf(this.d), Integer.valueOf(zzglVar.d)) && vy2.w(this.e, zzglVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.K(iJ, parcel);
    }
}

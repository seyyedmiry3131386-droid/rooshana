package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.ur9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.xr9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzna extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzna> CREATOR = new ds9(17);
    public xr9 a;
    public zzmi b;
    public ur9 c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzna) {
            zzna zznaVar = (zzna) obj;
            if (vy2.w(this.a, zznaVar.a) && vy2.w(this.b, zznaVar.b) && vy2.w(this.c, zznaVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        xr9 xr9Var = this.a;
        uy6.y(parcel, 1, xr9Var == null ? null : xr9Var.o);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.y(parcel, 3, this.c.o);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import defpackage.xr9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzjw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjw> CREATOR = new uq9(16);
    public xr9 a;
    public zzmc b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjw) {
            zzjw zzjwVar = (zzjw) obj;
            if (vy2.w(this.a, zzjwVar.a) && vy2.w(this.b, zzjwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        xr9 xr9Var = this.a;
        uy6.y(parcel, 1, xr9Var == null ? null : xr9Var.o);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.K(iJ, parcel);
    }
}

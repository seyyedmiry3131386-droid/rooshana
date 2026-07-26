package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzme extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzme> CREATOR = new ds9(9);
    public int a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzmeVar.a)) && vy2.w(Float.valueOf(this.b), Float.valueOf(zzmeVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        float f = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeFloat(f);
        uy6.K(iJ, parcel);
    }
}

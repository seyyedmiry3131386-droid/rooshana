package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzmc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmc> CREATOR = new ds9(8);
    public zzni a;
    public int b;
    public byte[] c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmc) {
            zzmc zzmcVar = (zzmc) obj;
            if (vy2.w(this.a, zzmcVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzmcVar.b)) && Arrays.equals(this.c, zzmcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        int i2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        uy6.w(parcel, 3, this.c, false);
        uy6.K(iJ, parcel);
    }
}

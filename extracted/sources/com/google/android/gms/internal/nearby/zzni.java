package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new ds9(19);
    public byte[] a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzni) {
            zzni zzniVar = (zzni) obj;
            if (Arrays.equals(this.a, zzniVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzniVar.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 1, this.a, false);
        int i2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        uy6.K(iJ, parcel);
    }
}

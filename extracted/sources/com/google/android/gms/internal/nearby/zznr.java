package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zznr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznr> CREATOR = new ds9(21);
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zznr) {
            zznr zznrVar = (zznr) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zznrVar.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zznrVar.b)) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zznrVar.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a;
        uy6.I(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i4);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bl4;
import defpackage.nj9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaa> CREATOR = new nj9(17);
    public int a;
    public int b;
    public int c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzaa) {
            zzaa zzaaVar = (zzaa) obj;
            if (vy2.w(Integer.valueOf(this.a), Integer.valueOf(zzaaVar.a)) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzaaVar.b)) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzaaVar.c)) && vy2.w(Boolean.valueOf(this.d), Boolean.valueOf(zzaaVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d;
        StringBuilder sbB = bl4.B(i, i2, "UwbRangingData{rawDistance=", ", rawAngleOfArrivalAzimuth=", ", rawAngleOfArrivalPolar=");
        sbB.append(i3);
        sbB.append(", isValidAngleOfArrivalData=");
        sbB.append(z);
        sbB.append("}");
        return sbB.toString();
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
        boolean z = this.d;
        uy6.I(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

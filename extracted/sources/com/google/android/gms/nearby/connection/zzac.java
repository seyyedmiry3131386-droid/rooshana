package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.nj9;
import defpackage.o40;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new nj9(19);
    public byte[] a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (Arrays.equals(this.a, zzacVar.a) && vy2.w(Integer.valueOf(this.b), Integer.valueOf(zzacVar.b)) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(zzacVar.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        return dw1.k(this.c, "}", o40.B(this.b, "UwbSenderInfo{address=", string, ", channel=", ", preambleIndex="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 1, this.a, false);
        int i2 = this.b;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        uy6.I(parcel, 3, 4);
        parcel.writeInt(i3);
        uy6.K(iJ, parcel);
    }
}

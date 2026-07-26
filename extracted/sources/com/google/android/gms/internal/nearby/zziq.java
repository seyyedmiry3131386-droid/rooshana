package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zziq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zziq> CREATOR = new uq9(2);
    public static final zziq d = new zziq(1, "", null);
    public final int a;
    public final String b;
    public final String c;

    public zziq(int i, String str, String str2) {
        this.a = Integer.valueOf(i).intValue();
        this.b = str == null ? "" : str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zziq)) {
            return false;
        }
        zziq zziqVar = (zziq) obj;
        return vy2.w(this.b, zziqVar.b) && vy2.w(this.c, zziqVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NearbyDevice{handle=");
        sb.append(this.b);
        sb.append(", bluetoothAddress=");
        return dw1.s(sb, this.c, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 3, this.b, false);
        uy6.D(parcel, 6, this.c, false);
        uy6.I(parcel, 1000, 4);
        parcel.writeInt(this.a);
        uy6.K(iJ, parcel);
    }
}

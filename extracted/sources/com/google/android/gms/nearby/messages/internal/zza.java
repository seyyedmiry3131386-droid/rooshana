package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.sk9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new sk9(20);
    public final int a;
    public final int b;
    public final int c;

    public zza(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return this.b == zzaVar.b && this.c == zzaVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BleSignal{rssi=");
        sb.append(this.b);
        sb.append(", txPower=");
        return dw1.k(this.c, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c);
        uy6.K(iJ, parcel);
    }
}

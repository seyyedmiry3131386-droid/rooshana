package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.uy6;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator<zze> CREATOR = new hm9(26);
    public final int a;
    public final int b;
    public final double c;

    public zze(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zze zzeVar = (zze) obj;
        double d = this.c;
        if (Double.isNaN(d) && Double.isNaN(zzeVar.c)) {
            return 0;
        }
        return Double.compare(d, zzeVar.c);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof zze) {
                zze zzeVar = (zze) obj;
                double d = zzeVar.c;
                if (this.b == zzeVar.b) {
                    double d2 = this.c;
                    if (((Double.isNaN(d2) && Double.isNaN(d)) ? 0 : Double.compare(d2, d)) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Double.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.US, "(%.1fm, %s)", Double.valueOf(this.c), this.b != 1 ? "UNKNOWN" : "LOW");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.I(parcel, 3, 8);
        parcel.writeDouble(this.c);
        uy6.K(iJ, parcel);
    }
}

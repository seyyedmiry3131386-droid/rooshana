package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dw1;
import defpackage.ix9;
import defpackage.o40;
import defpackage.uy6;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Strategy> CREATOR = new ix9(10);
    public static final Strategy c = new Strategy(1, 3);
    public static final Strategy d = new Strategy(1, 2);
    public static final Strategy e = new Strategy(1, 1);
    public final int a;
    public final int b;

    public Strategy(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.a == strategy.a && this.b == strategy.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return dw1.k(this.b, "}", o40.B(this.a, "Strategy(", c.equals(this) ? "P2P_CLUSTER" : d.equals(this) ? "P2P_STAR" : e.equals(this) ? "P2P_POINT_TO_POINT" : "UNKNOWN", "){connectionType=", ", topology="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.b);
        uy6.K(iJ, parcel);
    }
}

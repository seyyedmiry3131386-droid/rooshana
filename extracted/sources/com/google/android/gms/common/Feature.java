package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.hh2;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new sk9(24);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public Feature(String str, int i, boolean z, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (vy2.w(this.a, feature.a) && u() == feature.u() && this.d == feature.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(u()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        hh2Var.d(this.a, AppMeasurementSdk.ConditionalUserProperty.NAME);
        hh2Var.d(Long.valueOf(u()), "version");
        hh2Var.d(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return hh2Var.toString();
    }

    public final long u() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jU = u();
        uy6.I(parcel, 3, 8);
        parcel.writeLong(jU);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.K(iJ, parcel);
    }

    public Feature(long j, String str) {
        this(str, -1, false, j);
    }
}

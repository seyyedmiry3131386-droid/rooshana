package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.f87;
import defpackage.hh2;
import defpackage.hm9;
import defpackage.tv8;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements f87, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status h = new Status(15, null, null, null);
    public static final Status i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new hm9(21);

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    @Override // defpackage.f87
    public final Status d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && vy2.w(this.b, status.b) && vy2.w(this.c, status.c) && vy2.w(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        hh2 hh2Var = new hh2(this);
        String strT = this.b;
        if (strT == null) {
            strT = tv8.t(this.a);
        }
        hh2Var.d(strT, "statusCode");
        hh2Var.d(this.c, "resolution");
        return hh2Var.toString();
    }

    public final boolean u() {
        return this.a <= 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.C(parcel, 3, this.c, i2, false);
        uy6.C(parcel, 4, this.d, i2, false);
        uy6.K(iJ, parcel);
    }
}

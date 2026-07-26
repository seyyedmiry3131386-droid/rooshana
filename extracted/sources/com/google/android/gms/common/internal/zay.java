package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bf3;
import defpackage.f4;
import defpackage.gx9;
import defpackage.th9;
import defpackage.uy6;
import defpackage.vy2;

/* JADX INFO: loaded from: classes.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new th9(23);
    public final int a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public zay(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object gx9Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        if (!this.c.equals(zayVar.c)) {
            return false;
        }
        Object gx9Var2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            gx9Var = null;
        } else {
            int i = f4.o;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            gx9Var = iInterfaceQueryLocalInterface instanceof bf3 ? (bf3) iInterfaceQueryLocalInterface : new gx9(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = zayVar.b;
        if (iBinder2 != null) {
            int i2 = f4.o;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            gx9Var2 = iInterfaceQueryLocalInterface2 instanceof bf3 ? (bf3) iInterfaceQueryLocalInterface2 : new gx9(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return vy2.w(gx9Var, gx9Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.y(parcel, 2, this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

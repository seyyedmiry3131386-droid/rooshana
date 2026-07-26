package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;
import defpackage.cu9;
import defpackage.hm9;
import defpackage.hx9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbz> CREATOR = new hm9(7);
    public final int a;
    public final zzae b;
    public final Strategy c;
    public final cu9 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final hx9 h;
    public final boolean i;
    public final ClientAppContext j;
    public final int k;

    public zzbz(int i, zzae zzaeVar, Strategy strategy, IBinder iBinder, String str, String str2, boolean z, IBinder iBinder2, boolean z2, ClientAppContext clientAppContext, int i2) {
        cu9 cu9Var;
        this.a = i;
        this.b = zzaeVar;
        this.c = strategy;
        hx9 hx9Var = null;
        if (iBinder == null) {
            cu9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface : new cu9(iBinder);
        }
        this.d = cu9Var;
        this.e = str;
        this.f = str2;
        this.g = z;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IPublishCallback");
            hx9Var = iInterfaceQueryLocalInterface2 instanceof hx9 ? (hx9) iInterfaceQueryLocalInterface2 : new hx9(iBinder2, "com.google.android.gms.nearby.messages.internal.IPublishCallback", 3);
        }
        this.h = hx9Var;
        this.i = z2;
        this.j = ClientAppContext.u(clientAppContext, str2, str, z2);
        this.k = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.y(parcel, 4, this.d.o);
        uy6.D(parcel, 5, this.e, false);
        uy6.D(parcel, 6, this.f, false);
        uy6.I(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        hx9 hx9Var = this.h;
        uy6.y(parcel, 8, hx9Var == null ? null : hx9Var.o);
        uy6.I(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        uy6.C(parcel, 10, this.j, i, false);
        uy6.I(parcel, 11, 4);
        parcel.writeInt(this.k);
        uy6.K(iJ, parcel);
    }
}

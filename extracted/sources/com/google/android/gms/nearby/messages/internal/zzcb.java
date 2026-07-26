package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cu9;
import defpackage.hm9;
import defpackage.nx9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcb> CREATOR = new hm9(8);
    public final int a;
    public final cu9 b;
    public final nx9 c;
    public final boolean d;
    public final String e;
    public final ClientAppContext f;

    public zzcb(int i, IBinder iBinder, IBinder iBinder2, boolean z, String str, ClientAppContext clientAppContext) {
        cu9 cu9Var;
        nx9 nx9Var;
        this.a = i;
        if (iBinder == null) {
            cu9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface : new cu9(iBinder);
        }
        this.b = cu9Var;
        if (iBinder2 == null) {
            nx9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IStatusCallback");
            nx9Var = iInterfaceQueryLocalInterface2 instanceof nx9 ? (nx9) iInterfaceQueryLocalInterface2 : new nx9(iBinder2, "com.google.android.gms.nearby.messages.internal.IStatusCallback", 3);
        }
        this.c = nx9Var;
        this.d = z;
        this.e = str;
        this.f = ClientAppContext.u(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.y(parcel, 2, this.b.o);
        uy6.y(parcel, 3, this.c.o);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.D(parcel, 5, this.e, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cu9;
import defpackage.hm9;
import defpackage.is9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcg> CREATOR = new hm9(11);
    public final int a;
    public final is9 b;
    public final cu9 c;
    public final PendingIntent d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final ClientAppContext i;

    public zzcg(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, int i2, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        is9 is9Var;
        this.a = i;
        cu9 cu9Var = null;
        if (iBinder == null) {
            is9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            is9Var = iInterfaceQueryLocalInterface instanceof is9 ? (is9) iInterfaceQueryLocalInterface : new is9(iBinder);
        }
        this.b = is9Var;
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface2 instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface2 : new cu9(iBinder2);
        }
        this.c = cu9Var;
        this.d = pendingIntent;
        this.e = i2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = ClientAppContext.u(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        is9 is9Var = this.b;
        uy6.y(parcel, 2, is9Var == null ? null : is9Var.o);
        uy6.y(parcel, 3, this.c.o);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.D(parcel, 6, this.f, false);
        uy6.D(parcel, 7, this.g, false);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uy6.C(parcel, 9, this.i, i, false);
        uy6.K(iJ, parcel);
    }
}

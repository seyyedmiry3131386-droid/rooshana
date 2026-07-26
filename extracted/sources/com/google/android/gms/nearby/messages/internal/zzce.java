package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cu9;
import defpackage.hm9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new hm9(10);
    public final int a;
    public final zzae b;
    public final cu9 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final ClientAppContext g;

    public zzce(int i, zzae zzaeVar, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        cu9 cu9Var;
        this.a = i;
        this.b = zzaeVar;
        if (iBinder == null) {
            cu9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface : new cu9(iBinder);
        }
        this.c = cu9Var;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.u(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.y(parcel, 3, this.c.o);
        uy6.D(parcel, 4, this.d, false);
        uy6.D(parcel, 5, this.e, false);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.K(iJ, parcel);
    }
}

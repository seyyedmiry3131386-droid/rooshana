package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.cu9;
import defpackage.up9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new up9(24);
    public final int a;
    public final cu9 b;
    public final String c;
    public final ClientAppContext d;

    public zzh(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        cu9 cu9Var;
        this.a = i;
        if (iBinder == null) {
            cu9Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            cu9Var = iInterfaceQueryLocalInterface instanceof cu9 ? (cu9) iInterfaceQueryLocalInterface : new cu9(iBinder);
        }
        this.b = cu9Var;
        this.c = str;
        this.d = ClientAppContext.u(clientAppContext, null, str, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.y(parcel, 2, this.b.o);
        uy6.D(parcel, 3, this.c, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.K(iJ, parcel);
    }
}

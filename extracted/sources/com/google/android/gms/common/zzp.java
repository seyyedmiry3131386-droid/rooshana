package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dr5;
import defpackage.ds9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new ds9(26);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) dr5.q0(dr5.p0(iBinder));
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.y(parcel, 4, new dr5(this.d));
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new sk9(12);
    public final String a;
    public final int b;

    public zzav(String str, int i) {
        rq4.n(str);
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(1);
        uy6.D(parcel, 2, this.a, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.b);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaw;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new th9(15);
    public final int a;
    public final zaw b;

    public zai(int i, zaw zawVar) {
        this.a = i;
        this.b = zawVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.K(iJ, parcel);
    }
}

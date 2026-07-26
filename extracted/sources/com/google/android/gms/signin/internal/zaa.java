package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.f87;
import defpackage.th9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements f87 {
    public static final Parcelable.Creator<zaa> CREATOR = new th9(3);
    public final int a;
    public final int b;
    public final Intent c;

    public zaa(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.f87
    public final Status d() {
        return this.b == 0 ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.I(parcel, 1, 4);
        parcel.writeInt(this.a);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b);
        uy6.C(parcel, 3, this.c, i, false);
        uy6.K(iJ, parcel);
    }
}

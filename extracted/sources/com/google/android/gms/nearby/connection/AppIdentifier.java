package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.rq4;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new hm9(1);
    public final String a;

    public AppIdentifier(String str) {
        rq4.l(str, "Missing application identifier value");
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.K(iJ, parcel);
    }
}

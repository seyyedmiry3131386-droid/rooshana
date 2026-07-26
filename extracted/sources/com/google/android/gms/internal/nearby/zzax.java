package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sk9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new sk9(15);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzax);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        uy6.K(uy6.J(20293, parcel), parcel);
    }
}

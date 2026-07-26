package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uq9;
import defpackage.uy6;

/* JADX INFO: loaded from: classes.dex */
public final class zzjy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjy> CREATOR = new uq9(17);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzjy);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        uy6.K(uy6.J(20293, parcel), parcel);
    }
}

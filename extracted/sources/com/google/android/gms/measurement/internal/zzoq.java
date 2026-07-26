package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.uy6;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();
    public final List zza;

    public zzoq(List list) {
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, list, false);
        uy6.K(iJ, parcel);
    }
}

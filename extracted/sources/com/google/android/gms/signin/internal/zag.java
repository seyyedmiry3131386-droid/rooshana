package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.f87;
import defpackage.th9;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements f87 {
    public static final Parcelable.Creator<zag> CREATOR = new th9(14);
    public final List a;
    public final String b;

    public zag(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    @Override // defpackage.f87
    public final Status d() {
        return this.b != null ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.F(parcel, 1, this.a);
        uy6.D(parcel, 2, this.b, false);
        uy6.K(iJ, parcel);
    }
}

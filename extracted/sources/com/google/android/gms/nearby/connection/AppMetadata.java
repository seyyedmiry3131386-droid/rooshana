package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm9;
import defpackage.rq4;
import defpackage.uy6;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppMetadata> CREATOR = new hm9(16);
    public final List a;

    public AppMetadata(ArrayList arrayList) {
        rq4.o(arrayList, "Must specify application identifiers");
        this.a = arrayList;
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Application identifiers cannot be empty");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, this.a, false);
        uy6.K(iJ, parcel);
    }
}

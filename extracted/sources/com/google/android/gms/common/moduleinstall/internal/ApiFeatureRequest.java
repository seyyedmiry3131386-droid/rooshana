package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.th9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new th9(7);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z, String str, String str2) {
        rq4.n(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.b == apiFeatureRequest.b && vy2.w(this.a, apiFeatureRequest.a) && vy2.w(this.c, apiFeatureRequest.c) && vy2.w(this.d, apiFeatureRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, this.a, false);
        uy6.I(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        uy6.D(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.d, false);
        uy6.K(iJ, parcel);
    }
}

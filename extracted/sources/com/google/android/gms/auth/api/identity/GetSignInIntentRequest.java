package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.nj9;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new nj9(1);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final List g;

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z, int i, ArrayList arrayList) {
        rq4.n(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return vy2.w(this.a, getSignInIntentRequest.a) && vy2.w(this.d, getSignInIntentRequest.d) && vy2.w(this.b, getSignInIntentRequest.b) && vy2.w(Boolean.valueOf(this.e), Boolean.valueOf(getSignInIntentRequest.e)) && this.f == getSignInIntentRequest.f && vy2.w(this.g, getSignInIntentRequest.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.d, false);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uy6.I(parcel, 6, 4);
        parcel.writeInt(this.f);
        uy6.H(parcel, 7, this.g, false);
        uy6.K(iJ, parcel);
    }
}

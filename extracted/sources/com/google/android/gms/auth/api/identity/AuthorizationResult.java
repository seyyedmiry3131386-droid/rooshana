package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.th9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new th9(26);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        rq4.n(arrayList);
        this.d = arrayList;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return vy2.w(this.a, authorizationResult.a) && vy2.w(this.b, authorizationResult.b) && vy2.w(this.c, authorizationResult.c) && vy2.w(this.d, authorizationResult.d) && vy2.w(this.f, authorizationResult.f) && vy2.w(this.e, authorizationResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.F(parcel, 4, this.d);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.nj9;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new nj9(8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final PublicKeyCredential i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        rq4.n(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return vy2.w(this.a, signInCredential.a) && vy2.w(this.b, signInCredential.b) && vy2.w(this.c, signInCredential.c) && vy2.w(this.d, signInCredential.d) && vy2.w(this.e, signInCredential.e) && vy2.w(this.f, signInCredential.f) && vy2.w(this.g, signInCredential.g) && vy2.w(this.h, signInCredential.h) && vy2.w(this.i, signInCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.d, false);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.D(parcel, 6, this.f, false);
        uy6.D(parcel, 7, this.g, false);
        uy6.D(parcel, 8, this.h, false);
        uy6.C(parcel, 9, this.i, i, false);
        uy6.K(iJ, parcel);
    }
}

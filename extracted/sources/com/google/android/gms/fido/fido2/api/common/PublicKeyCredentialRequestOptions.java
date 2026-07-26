package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new sk9(5);
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final zzay g;
    public final AuthenticationExtensions h;
    public final Long i;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        rq4.n(bArr);
        this.a = bArr;
        this.b = d;
        rq4.n(str);
        this.c = str;
        this.d = arrayList;
        this.e = num;
        this.f = tokenBinding;
        this.i = l;
        if (str2 != null) {
            try {
                this.g = zzay.a(str2);
            } catch (zzax e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.g = null;
        }
        this.h = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.d;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && vy2.w(this.b, publicKeyCredentialRequestOptions.b) && vy2.w(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && vy2.w(this.e, publicKeyCredentialRequestOptions.e) && vy2.w(this.f, publicKeyCredentialRequestOptions.f) && vy2.w(this.g, publicKeyCredentialRequestOptions.g) && vy2.w(this.h, publicKeyCredentialRequestOptions.h) && vy2.w(this.i, publicKeyCredentialRequestOptions.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.x(parcel, 3, this.b);
        uy6.D(parcel, 4, this.c, false);
        uy6.H(parcel, 5, this.d, false);
        uy6.A(parcel, 6, this.e);
        uy6.C(parcel, 7, this.f, i, false);
        zzay zzayVar = this.g;
        uy6.D(parcel, 8, zzayVar == null ? null : zzayVar.a, false);
        uy6.C(parcel, 9, this.h, i, false);
        uy6.B(parcel, 10, this.i);
        uy6.K(iJ, parcel);
    }
}

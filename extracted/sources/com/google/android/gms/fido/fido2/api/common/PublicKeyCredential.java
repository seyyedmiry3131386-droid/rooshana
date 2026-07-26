package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new sk9(2);
    public final String a;
    public final String b;
    public final byte[] c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs g;
    public final String h;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z = false;
        }
        rq4.i(z);
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.g = authenticationExtensionsClientOutputs;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return vy2.w(this.a, publicKeyCredential.a) && vy2.w(this.b, publicKeyCredential.b) && Arrays.equals(this.c, publicKeyCredential.c) && vy2.w(this.d, publicKeyCredential.d) && vy2.w(this.e, publicKeyCredential.e) && vy2.w(this.f, publicKeyCredential.f) && vy2.w(this.g, publicKeyCredential.g) && vy2.w(this.h, publicKeyCredential.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.w(parcel, 3, this.c, false);
        uy6.C(parcel, 4, this.d, i, false);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.D(parcel, 8, this.h, false);
        uy6.K(iJ, parcel);
    }
}

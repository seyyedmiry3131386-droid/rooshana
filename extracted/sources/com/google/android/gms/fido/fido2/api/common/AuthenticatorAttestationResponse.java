package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pl9;
import defpackage.rq4;
import defpackage.sk6;
import defpackage.t17;
import defpackage.ul9;
import defpackage.uq9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new uq9(19);
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final String[] d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        rq4.n(bArr);
        this.a = bArr;
        rq4.n(bArr2);
        this.b = bArr2;
        rq4.n(bArr3);
        this.c = bArr3;
        rq4.n(strArr);
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.a, authenticatorAttestationResponse.a) && Arrays.equals(this.b, authenticatorAttestationResponse.b) && Arrays.equals(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        sk6 sk6VarJ = t17.j(this);
        pl9 pl9Var = ul9.c;
        byte[] bArr = this.a;
        sk6VarJ.L("keyHandle", pl9Var.c(bArr.length, bArr));
        byte[] bArr2 = this.b;
        sk6VarJ.L("clientDataJSON", pl9Var.c(bArr2.length, bArr2));
        byte[] bArr3 = this.c;
        sk6VarJ.L("attestationObject", pl9Var.c(bArr3.length, bArr3));
        sk6VarJ.L("transports", Arrays.toString(this.d));
        return sk6VarJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.w(parcel, 3, this.b, false);
        uy6.w(parcel, 4, this.c, false);
        uy6.E(parcel, 5, this.d);
        uy6.K(iJ, parcel);
    }
}

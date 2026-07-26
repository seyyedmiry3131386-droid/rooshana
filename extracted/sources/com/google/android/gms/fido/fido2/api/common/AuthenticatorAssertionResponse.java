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
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new uq9(4);
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        rq4.n(bArr);
        this.a = bArr;
        rq4.n(bArr2);
        this.b = bArr2;
        rq4.n(bArr3);
        this.c = bArr3;
        rq4.n(bArr4);
        this.d = bArr4;
        this.e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.a, authenticatorAssertionResponse.a) && Arrays.equals(this.b, authenticatorAssertionResponse.b) && Arrays.equals(this.c, authenticatorAssertionResponse.c) && Arrays.equals(this.d, authenticatorAssertionResponse.d) && Arrays.equals(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        sk6 sk6VarJ = t17.j(this);
        pl9 pl9Var = ul9.c;
        byte[] bArr = this.a;
        sk6VarJ.L("keyHandle", pl9Var.c(bArr.length, bArr));
        byte[] bArr2 = this.b;
        sk6VarJ.L("clientDataJSON", pl9Var.c(bArr2.length, bArr2));
        byte[] bArr3 = this.c;
        sk6VarJ.L("authenticatorData", pl9Var.c(bArr3.length, bArr3));
        byte[] bArr4 = this.d;
        sk6VarJ.L("signature", pl9Var.c(bArr4.length, bArr4));
        byte[] bArr5 = this.e;
        if (bArr5 != null) {
            sk6VarJ.L("userHandle", pl9Var.c(bArr5.length, bArr5));
        }
        return sk6VarJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.w(parcel, 3, this.b, false);
        uy6.w(parcel, 4, this.c, false);
        uy6.w(parcel, 5, this.d, false);
        uy6.w(parcel, 6, this.e, false);
        uy6.K(iJ, parcel);
    }
}

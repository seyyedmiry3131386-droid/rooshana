package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import defpackage.jk9;
import defpackage.sk6;
import defpackage.t17;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new uq9(27);
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(String str, int i, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return vy2.w(this.a, authenticatorErrorResponse.a) && vy2.w(this.b, authenticatorErrorResponse.b) && vy2.w(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        sk6 sk6VarJ = t17.j(this);
        String strValueOf = String.valueOf(this.a.a);
        jk9 jk9Var = new jk9(24, (byte) 0);
        ((sk6) sk6VarJ.d).d = jk9Var;
        sk6VarJ.d = jk9Var;
        jk9Var.c = strValueOf;
        jk9Var.b = "errorCode";
        String str = this.b;
        if (str != null) {
            sk6VarJ.L("errorMessage", str);
        }
        return sk6VarJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        int i2 = this.a.a;
        uy6.I(parcel, 2, 4);
        parcel.writeInt(i2);
        uy6.D(parcel, 3, this.b, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.c);
        uy6.K(iJ, parcel);
    }
}

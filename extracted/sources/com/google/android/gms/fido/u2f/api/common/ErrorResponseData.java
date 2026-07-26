package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hm9;
import defpackage.jk9;
import defpackage.sk6;
import defpackage.t17;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new hm9(15);
    public final ErrorCode a;
    public final String b;

    public ErrorResponseData(int i, String str) {
        ErrorCode errorCode;
        ErrorCode[] errorCodeArrValues = ErrorCode.values();
        int length = errorCodeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                errorCode = ErrorCode.OTHER_ERROR;
                break;
            }
            errorCode = errorCodeArrValues[i2];
            if (i == errorCode.a) {
                break;
            } else {
                i2++;
            }
        }
        this.a = errorCode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        return vy2.w(this.a, errorResponseData.a) && vy2.w(this.b, errorResponseData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
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
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pl9;
import defpackage.rq4;
import defpackage.sk6;
import defpackage.t17;
import defpackage.ul9;
import defpackage.uq9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new uq9(28);
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        rq4.n(bArr);
        this.a = bArr;
        rq4.n(str);
        this.b = str;
        rq4.n(bArr2);
        this.c = bArr2;
        rq4.n(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && vy2.w(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        sk6 sk6VarJ = t17.j(this);
        pl9 pl9Var = ul9.c;
        byte[] bArr = this.a;
        sk6VarJ.L("keyHandle", pl9Var.c(bArr.length, bArr));
        sk6VarJ.L("clientDataString", this.b);
        byte[] bArr2 = this.c;
        sk6VarJ.L("signatureData", pl9Var.c(bArr2.length, bArr2));
        byte[] bArr3 = this.d;
        sk6VarJ.L("application", pl9Var.c(bArr3.length, bArr3));
        return sk6VarJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.D(parcel, 3, this.b, false);
        uy6.w(parcel, 4, this.c, false);
        uy6.w(parcel, 5, this.d, false);
        uy6.K(iJ, parcel);
    }
}

package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import defpackage.pl9;
import defpackage.sk6;
import defpackage.t17;
import defpackage.ul9;
import defpackage.up9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterResponseData extends ResponseData {
    public static final Parcelable.Creator<RegisterResponseData> CREATOR = new up9(23);
    public final byte[] a;
    public final ProtocolVersion b;
    public final String c;

    public RegisterResponseData(byte[] bArr, String str, String str2) {
        this.a = bArr;
        try {
            this.b = ProtocolVersion.a(str);
            this.c = str2;
        } catch (ProtocolVersion.UnsupportedProtocolException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegisterResponseData)) {
            return false;
        }
        RegisterResponseData registerResponseData = (RegisterResponseData) obj;
        return vy2.w(this.b, registerResponseData.b) && Arrays.equals(this.a, registerResponseData.a) && vy2.w(this.c, registerResponseData.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.a)), this.c});
    }

    public final String toString() {
        sk6 sk6VarJ = t17.j(this);
        sk6VarJ.L("protocolVersion", this.b);
        pl9 pl9Var = ul9.c;
        byte[] bArr = this.a;
        sk6VarJ.L("registerData", pl9Var.c(bArr.length, bArr));
        String str = this.c;
        if (str != null) {
            sk6VarJ.L("clientDataString", str);
        }
        return sk6VarJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.D(parcel, 3, this.b.a, false);
        uy6.D(parcel, 4, this.c, false);
        uy6.K(iJ, parcel);
    }
}

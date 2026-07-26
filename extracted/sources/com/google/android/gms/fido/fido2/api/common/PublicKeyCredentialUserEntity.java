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
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new sk9(8);
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2, String str3) {
        rq4.n(bArr);
        this.a = bArr;
        rq4.n(str);
        this.b = str;
        this.c = str2;
        rq4.n(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.a, publicKeyCredentialUserEntity.a) && vy2.w(this.b, publicKeyCredentialUserEntity.b) && vy2.w(this.c, publicKeyCredentialUserEntity.c) && vy2.w(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.w(parcel, 2, this.a, false);
        uy6.D(parcel, 3, this.b, false);
        uy6.D(parcel, 4, this.c, false);
        uy6.D(parcel, 5, this.d, false);
        uy6.K(iJ, parcel);
    }
}

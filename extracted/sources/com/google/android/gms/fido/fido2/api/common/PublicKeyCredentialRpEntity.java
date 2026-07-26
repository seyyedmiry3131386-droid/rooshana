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
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new sk9(6);
    public final String a;
    public final String b;
    public final String c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        rq4.n(str);
        this.a = str;
        rq4.n(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return vy2.w(this.a, publicKeyCredentialRpEntity.a) && vy2.w(this.b, publicKeyCredentialRpEntity.b) && vy2.w(this.c, publicKeyCredentialRpEntity.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.D(parcel, 2, this.a, false);
        uy6.D(parcel, 3, this.b, false);
        uy6.D(parcel, 4, this.c, false);
        uy6.K(iJ, parcel);
    }
}

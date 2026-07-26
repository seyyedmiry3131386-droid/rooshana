package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import defpackage.rq4;
import defpackage.sk9;
import defpackage.uy6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new sk9(4);
    public final PublicKeyCredentialType a;
    public final COSEAlgorithmIdentifier b;

    public PublicKeyCredentialParameters(String str, int i) {
        rq4.n(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.a.equals(publicKeyCredentialParameters.a) && this.b.equals(publicKeyCredentialParameters.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        this.a.getClass();
        uy6.D(parcel, 2, "public-key", false);
        uy6.A(parcel, 3, Integer.valueOf(this.b.a.a()));
        uy6.K(iJ, parcel);
    }
}
